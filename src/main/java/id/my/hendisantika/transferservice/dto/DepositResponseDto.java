package id.my.hendisantika.transferservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import id.my.hendisantika.transferservice.domain.Deposit;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

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
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public record DepositResponseDto(
        @Schema(description = "requestUid")
        String requestUid,
        @Schema(description = "Created deposit id")
        long id) {

    public static DepositResponseDto fromDomain(Deposit deposit) {
        return DepositResponseDto.builder()
                .requestUid(deposit.getRequestUid())
                .id(deposit.getId())
                .build();
    }
}
