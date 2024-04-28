package id.my.hendisantika.transferservice.controller;

import id.my.hendisantika.transferservice.metric.MetricsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:09
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@ControllerAdvice
@AllArgsConstructor
public class RestExceptionHandler {

    private MetricsService metricsService;
}
