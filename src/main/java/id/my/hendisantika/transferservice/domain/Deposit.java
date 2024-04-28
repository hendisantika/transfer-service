package id.my.hendisantika.transferservice.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:02
 * To change this template use File | Settings | File Templates.
 */
@Data
@Builder(toBuilder = true)
@Table(schema = "transfer_service", name = "deposit")
public class Deposit {

    @Id
    long id;
    String requestUid;
    long customerId;
    String fromAccountNumber;
    String toAccountNumber;
    BigDecimal amount;
    LocalDateTime createdAt;
}
