package cat.barcelonactiva.tech4good.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommercialCensusDTO {

    @JsonProperty("Nom_Activitat")
    @Schema (description = "Activity Name")
    private String nameActivity;

    @JsonProperty("Nom_Local")
    @Schema (description = "Local Name")
    private String nameLocal;

    @JsonProperty("Nom_Districte")
    @Schema (description = "District Name")
    private String nameDistrict;

    @JsonProperty("Nom_Barri")
    @Schema (description = "Neighborhood Name")
    private String nameNeighborhood;

    @JsonProperty("Latitud")
    @Schema (description = "Latitude")
    private String latitude;

    @JsonProperty("Longitud")
    @Schema (description = "Length")
    private String length;



}
