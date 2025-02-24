package id.my.hendisantika.transferservice.metric;

import id.my.hendisantika.transferservice.domain.Deposit;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:03
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@Slf4j
@Component
public class DepositMetricsService implements MetricsService {

    public static final String CREATED_DEPOSITS = "created_deposits";
    public static final String DEPOSIT_EXCEPTIONS = "deposit_exceptions";

    private ObservationRegistry observationRegistry;
    private MeterRegistry meterRegistry;

    @Override
    public void countCreatedDeposits(Deposit deposit) {
        Observation.createNotStarted(CREATED_DEPOSITS, observationRegistry)
                .lowCardinalityKeyValue("request-uid", deposit.getRequestUid())
                .observe(() -> log.debug("Counting created deposits"));
    }

    @Override
    public void incrementExceptionCounter(String tageName, String tagValue) {
        Counter.builder(DEPOSIT_EXCEPTIONS)
                .tag(tageName, tagValue)
                .register(this.meterRegistry)
                .increment();
    }
}
