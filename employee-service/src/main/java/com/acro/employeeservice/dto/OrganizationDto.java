package com.acro.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Schema(
        description = "Organization DTO model"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

    private Long id;
    @Schema(
            description = "Organization Name"
    )
    private String organizationName;
    @Schema(
            description = "Organization Code"
    )
    private String organizationCode;
    @Schema(
            description = "Organization Description"
    )
    private String organizationDescription;
    @Schema(
            description = "Organization Created Date"
    )
    private LocalDate createdDate;
}
