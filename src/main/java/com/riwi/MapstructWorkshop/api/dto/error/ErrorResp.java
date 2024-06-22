package com.riwi.MapstructWorkshop.api.dto.error;




import java.util.List;
import java.util.Map;

import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResp extends BaseErrorResponse {

    private List<Map<String,String>> errors;
}
