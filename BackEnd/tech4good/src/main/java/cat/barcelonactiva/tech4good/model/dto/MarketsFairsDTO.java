package cat.barcelonactiva.tech4good.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketsFairsDTO {

    @Schema(description = "Name")
    private String name;

    @Schema(description = "Addresses District Name")
    private String addressDistrict;

    @Schema(description = "Addresses Neighborhood Name")
    private String addressNeighborhood;

    @Schema(description = "Addresses Road Name")
    private String addressRoad;

    @Schema(description = "Addresses Zip Code")
    private String addressZip;

    @Schema(description = "Length")
    private String length;

    @Schema(description = "Latitude")
    private String latitude;


}
