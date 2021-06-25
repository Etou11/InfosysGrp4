package hsesslingen.group4.jumbleShare.Service;


import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Transaction;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Trip;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Vehicle;
import hsesslingen.group4.jumbleShare.Web.Dto.TransactionBookingsDto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface TransactionService
{
    Grp4Ss21Transaction findTransactionByUserId(UUID userId);
    List<Grp4Ss21Transaction> findTransactionsByUserId(UUID userId);
    List<TransactionBookingsDto> findTransactionsForBookingsByUserId(UUID userId);
    Grp4Ss21Trip findTripByTransactionId(UUID transactionId);
    Grp4Ss21Vehicle findVehicleByVehicleId(UUID vehicleId);
}
