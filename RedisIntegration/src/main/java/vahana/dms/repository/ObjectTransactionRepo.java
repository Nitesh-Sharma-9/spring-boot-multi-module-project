package vahana.dms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vahana.dms.domain.ObjectTransaction;

@Repository
public interface ObjectTransactionRepo extends CrudRepository<ObjectTransaction,Long> {
}
