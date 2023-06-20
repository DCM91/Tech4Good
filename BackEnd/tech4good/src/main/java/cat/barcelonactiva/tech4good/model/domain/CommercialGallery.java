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
@Document(collection = "commercialGalleries")
public class CommercialGallery {
    @Id
    @Schema(description = "Id")
    private ObjectId id;

    @Field("name")
    @Schema(description = "Name")
    private String name;

    @Field("addresses_district_name")
    @Schema(description = "Addresses District Name")
    private String addressDistrict;

    @Field("addresses_neighborhood_name")
    @Schema(description = "Addresses Neighborhood Name")
    private String addressNeighborhood;

    @Field("addresses_road_name")
    @Schema(description = "Addresses Road Name")
    private String addressRoad;

    @Field("addresses_zip_code")
    @Schema(description = "Addresses Zip Code")
    private String addressZip;

    @Field("geo_epgs_4326_x")
    @Schema(description = "Length")
    private String length;

    @Field("geo_epgs_4326_y")
    @Schema(description = "Latitude")
    private String latitude;
}
