package id.my.hendisantika.transferservice.repository;

import id.my.hendisantika.transferservice.domain.Deposit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:05
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface DepositRepository extends CrudRepository<Deposit, Long> {

    Optional<Deposit> findByRequestUid(String requestUid);
}
