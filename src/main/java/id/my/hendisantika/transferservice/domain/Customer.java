package id.my.hendisantika.transferservice.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;

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
@Table(schema = "transfer_service", name = "customer")
public class Customer {

    @Id
    long id;
    String name;
    String personNumber;
    OffsetDateTime createdAt;
}
