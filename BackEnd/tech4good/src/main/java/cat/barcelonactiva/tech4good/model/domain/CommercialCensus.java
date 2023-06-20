package cat.barcelonactiva.tech4good.model.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "commercialCensus")
public class CommercialCensus {

    @Id
    @Schema(description = "Id")
    private ObjectId id;

    @Field("Nom_Activitat")
    @Schema(description = "Activity Name")
    private String nameActivity;

    @Field("Nom_Local")
    @Schema (description = "Local Name")
    private String nameLocal;

    @Field("Nom_Districte")
    @Schema (description = "District Name")
    private String nameDistrict;

    @Field("Nom_Barri")
    @Schema (description = "Neighborhood Name")
    private String nameNeighborhood;

    @Field("Latitud")
    @Schema (description = "Latitude")
    private String latitude;

    @Field("Longitud")
    @Schema (description = "Length")
    private String length;
}
