package id.my.hendisantika.transferservice.repository;

import id.my.hendisantika.transferservice.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
