package hsesslingen.group4.jumbleShare.Service;


import hsesslingen.group4.jumbleShare.Entity.Grp4Ss21Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionService
{
    Grp4Ss21Transaction findTransactionByUserId(UUID userId);
    List<Grp4Ss21Transaction> findTransactionsByUserId(UUID userId);
}
