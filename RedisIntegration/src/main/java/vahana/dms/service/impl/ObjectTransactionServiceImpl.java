package vahana.dms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vahana.dms.domain.ObjectTransaction;
import vahana.dms.repository.ObjectTransactionRepo;
import vahana.dms.service.ObjectTransactionService;

@Service
public class ObjectTransactionServiceImpl  implements ObjectTransactionService
{

    @Autowired
    public ObjectTransactionRepo objectTransactionRepo;

    @Override
    public ObjectTransaction add(ObjectTransaction objectTransaction) {
        return objectTransactionRepo.save(objectTransaction);
    }
}
