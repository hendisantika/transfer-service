package id.my.hendisantika.transferservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import id.my.hendisantika.transferservice.domain.Deposit;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : transfer-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/28/24
 * Time: 07:07
 * To change this template use File | Settings | File Templates.
 */
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public record DepositRequestDto(
        @Schema(description = "requestUid", example = "6881763f-d955-40e6-b040-26907c9c6377")
        @NotBlank
        String requestUid,
        @Schema(description = "The customer id who does deposit")
        long customerId,
        @Schema(description = "The account number from which money will be withdrawn")
        @NotBlank
        String fromAccountNumber,
        @Schema(description = "The account number to which money will be deposited")
        @NotBlank
        String toAccountNumber,
        @Schema(description = "The transfer amount")
        @NotNull @Positive
        BigDecimal amount) {

    public Deposit toDomain() {
        return Deposit.builder()
                .requestUid(requestUid)
                .customerId(customerId)
                .fromAccountNumber(fromAccountNumber)
                .toAccountNumber(toAccountNumber)
                .amount(amount)
                .build();
    }
}
