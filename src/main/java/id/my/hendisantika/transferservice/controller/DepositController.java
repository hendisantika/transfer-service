package id.my.hendisantika.transferservice.controller;

import id.my.hendisantika.transferservice.dto.ApiErrorResponse;
import id.my.hendisantika.transferservice.dto.DepositRequestDto;
import id.my.hendisantika.transferservice.dto.DepositResponseDto;
import id.my.hendisantika.transferservice.service.DepositService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.ServletRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Operation(summary = "Add deposit request")
    @ApiResponse(responseCode = "201", content = @Content(schema = @Schema(implementation = DepositResponseDto.class)))
    @ApiResponse(responseCode = "400", content = @Content(schema = @Schema(implementation = ApiErrorResponse.class)))
    @ApiResponse(responseCode = "404", content = @Content(schema = @Schema(implementation = ApiErrorResponse.class)))
    @ApiResponse(responseCode = "500", content = @Content(schema = @Schema(implementation = ApiErrorResponse.class)))
    @PostMapping
    public ResponseEntity<DepositResponseDto> add(@Valid @RequestBody DepositRequestDto requestDto, ServletRequest httpServletRequest) {
        httpServletRequest.setAttribute(REQUEST_UID, requestDto.requestUid());
        var createdDeposit = depositService.add(requestDto.toDomain());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(DepositResponseDto.fromDomain(createdDeposit));
    }

}
