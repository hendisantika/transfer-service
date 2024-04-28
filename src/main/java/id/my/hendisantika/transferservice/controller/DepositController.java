package id.my.hendisantika.transferservice.controller;

import id.my.hendisantika.transferservice.service.DepositService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:08
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(path = "/api/deposits", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class DepositController {

    static final String REQUEST_UID = "requestUid";

    private final DepositService depositService;

}
