package cat.barcelonactiva.tech4good.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommercialGalleriesDTO {
    @JsonProperty("name")
    @Schema(description = "Name")
    private String name;

    @JsonProperty("addresses_district_name")
    @Schema (description = "Addresses District Name")
    private String addressDistrict;

    @JsonProperty("addresses_neighborhood_name")
    @Schema (description = "Addresses Neighborhood Name")
    private String addressNeighborhood;

    @JsonProperty("addresses_road_name")
    @Schema (description = "Addresses Road Name")
    private String addressRoad;

    @JsonProperty("addresses_zip_code")
    @Schema (description = "Addresses Zip Code")
    private String addressZip;

    @JsonProperty("geo_epgs_4326_x")
    @Schema (description = "Length")
    private String length;

    @JsonProperty("geo_epgs_4326_y")
    @Schema(description = "Latitude")
    private String latitude;
}
