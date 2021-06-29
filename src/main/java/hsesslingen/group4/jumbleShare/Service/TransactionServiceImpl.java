package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Transaction;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TransactionRepository;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TripRepository;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21VehicleRepository;
import hsesslingen.group4.jumbleShare.Web.Dto.TransactionBookingsDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService
{

    private Grp4Ss21TransactionRepository transactionRepository;
    private Grp4Ss21TripRepository tripRepository;
    private Grp4Ss21VehicleRepository vehicleRepository;

    public TransactionServiceImpl(Grp4Ss21TransactionRepository transactionRepository, Grp4Ss21TripRepository tripRepository, Grp4Ss21VehicleRepository vehicleRepository)
    {
        super();
        this.transactionRepository = transactionRepository;
        this.tripRepository = tripRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Grp4Ss21Transaction findTransactionByUserId(UUID userId)
    {
        var transactions = transactionRepository.findAll();
        var trips = tripRepository.findAll();
        var transaction = transactions.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(x.getTripId().toString(), trips.stream()
                .filter(y -> HelperExtension.UuidEqualityCheck(y.getUserId().toString(), userId.toString())).toString()))
                .findFirst()
                .orElse(new Grp4Ss21Transaction());
        return transaction;
    }

    @Override
    public List<Grp4Ss21Transaction> findTransactionsByUserId(UUID userId)
    {
        var transactions = transactionRepository.findAll();
        var trips = tripRepository.findAll();

        List<Grp4Ss21Transaction> filteredTransactions = new ArrayList<>();

        for(var transaction : transactions)
        {
            for(var trip : trips)
            {
                if(HelperExtension.UuidEqualityCheck(transaction.getTripId(), trip.getId()) && HelperExtension.UuidEqualityCheck(userId, trip.getUserId()))
                    filteredTransactions.add(transaction);
            }
        }

        //Do not delete - so much nicer code than those two loops above :((
        /*
        var filteredTransactions = transactions.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(x.getTripId().toString(), trips.stream()
                    .filter(y -> HelperExtension.UuidEqualityCheck(y.getUserId().toString(), userId.toString()))
                        .findFirst()
                        .orElse(new Grp4Ss21Trip())
                        .getId()
                        .toString()))
                .collect(Collectors.toList());
         */
        return filteredTransactions;
    }

    @Override
    public List<TransactionBookingsDto> findTransactionsForBookingsByUserId(UUID userId)
    {
        List<TransactionBookingsDto> results = new ArrayList<>();
        var transactions = findTransactionsByUserId(userId);

        for(var transaction : transactions)
        {
            var trip = findTripByTransactionId(transaction.getId());
            var vehicle = findVehicleByVehicleId(trip.getVehicleId());
            var tripDuration = HelperExtension.GetTimespanInMinutes(trip.getTimestampStart(), trip.getTimestampEnd());

            TransactionBookingsDto booking = new TransactionBookingsDto(
                    transaction.getId(),
                    trip.getTimestampStart(),
                    trip.getTimestampEnd(),
                    vehicle.getBrand(),
                    trip.getVehiclePricePerMinute().toString(),
                    String.valueOf(tripDuration),
                    new BigDecimal(tripDuration).multiply(trip.getVehiclePricePerMinute()).toString()
            );
            results.add(booking);
        }

        return results;
    }

    @Override
    public Grp4Ss21Trip findTripByTransactionId(UUID transactionId)
    {
        var transactions = transactionRepository.findAll();
        var transaction = transactions.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(x.getId().toString(), transactionId.toString()))
                .findFirst()
                .orElse(new Grp4Ss21Transaction());

        var trips = tripRepository.findAll();
        var trip = trips.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(transaction.getTripId().toString(), x.getId().toString()))
                .findFirst()
                .orElse(new Grp4Ss21Trip());

        if(trip.getId() == null)
            throw new NullPointerException();

        return trip;
    }

    @Override
    public Grp4Ss21Vehicle findVehicleByVehicleId(UUID vehicleId)
    {
        var vehicles = vehicleRepository.findAll();
        var vehicle = vehicles.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(vehicleId.toString(), x.getId().toString()))
                .findFirst()
                .orElse(new Grp4Ss21Vehicle());

        if(vehicle.getId() == null)
            throw new NullPointerException();

        return vehicle;
    }



}
