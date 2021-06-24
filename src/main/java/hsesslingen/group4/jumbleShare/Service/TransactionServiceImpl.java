package hsesslingen.group4.jumbleShare.Service;

import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Account;
import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Transaction;
import hsesslingen.group4.jumbleShare.Helper.HelperExtension;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TransactionRepository;
import hsesslingen.group4.jumbleShare.Repository.Grp4Ss21TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService
{

    private Grp4Ss21TransactionRepository transactionRepository;
    private Grp4Ss21TripRepository tripRepository;

    public TransactionServiceImpl(Grp4Ss21TransactionRepository transactionRepository) {
        super();
        this.transactionRepository = transactionRepository;
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
        var filteredTransactions = transactions.stream()
                .filter(x -> HelperExtension.UuidEqualityCheck(x.getTripId().toString(), trips.stream()
                        .filter(y -> HelperExtension.UuidEqualityCheck(y.getUserId().toString(), userId.toString())).toString())
                ).collect(Collectors.toList());
        return filteredTransactions;
    }
}
