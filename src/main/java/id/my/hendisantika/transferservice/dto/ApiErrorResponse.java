package id.my.hendisantika.transferservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

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
public record ApiErrorResponse(
        @Schema(description = "requestUid")
        String requestUid,
        @Schema(description = "Error code")
        int errorCode,
        @Schema(description = "Error description")
        String description) {
}
