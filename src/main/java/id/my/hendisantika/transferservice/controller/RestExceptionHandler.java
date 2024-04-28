package id.my.hendisantika.transferservice.controller;

import id.my.hendisantika.transferservice.dto.ApiErrorResponse;
import id.my.hendisantika.transferservice.exception.NotFoundException;
import id.my.hendisantika.transferservice.metric.MetricsService;
import jakarta.servlet.ServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

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

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleNotFoundException(ServletRequest request, NotFoundException e) {

        metricsService.incrementExceptionCounter("exception_type", "CustomerNotFoundException");
        return ResponseEntity.status(NOT_FOUND).body(ApiErrorResponse.builder()
                .requestUid(getRequestIdentifier(request))
                .errorCode(NOT_FOUND.value())
                .description(e.getMessage())
                .build());
    }
}
