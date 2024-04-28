package id.my.hendisantika.transferservice.service;

import id.my.hendisantika.transferservice.exception.NotFoundException;
import id.my.hendisantika.transferservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:06
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void validateCustomer(long id) {
        var customerOptional = customerRepository.findById(id);
        customerOptional.orElseThrow(() -> {
            log.debug("Could not find customer, id: {}", id);
            return new NotFoundException(String.format("Could not find customer, id: %s", id));
        });
    }
}
