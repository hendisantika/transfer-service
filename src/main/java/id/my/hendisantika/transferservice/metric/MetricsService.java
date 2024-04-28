package id.my.hendisantika.transferservice.metric;

import id.my.hendisantika.transferservice.domain.Deposit;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:04
 * To change this template use File | Settings | File Templates.
 */
public interface MetricsService {

    void countCreatedDeposits(Deposit deposit);

    void incrementExceptionCounter(String tageName, String tagValue);
}
