package cat.barcelonactiva.tech4good.controller;

import cat.barcelonactiva.tech4good.model.dto.*;
import cat.barcelonactiva.tech4good.model.service.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tech4good")
@CrossOrigin(origins = "http://localhost:3000")
@Tag(name = "Tech4Good API", description = "API operations pertaining to Tech4Good APP")
public class Tech4GoodController {

    @Autowired
    CommercialCensusService commercialCensusService;

    @Autowired
    CommercialGalleryService commercialGalleryService;

    @Autowired
    MarketFairService marketFairService;

    @Autowired
    MarketMunService marketMunService;

    @Autowired
    ShoppingCenterService shoppingCenterService;

    @GetMapping(value = "/commercialCensus", produces = "application/json")
    @Operation(summary = "Returns all the commercial census of Barcelona", description = "Returns a list with all commercial census")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of commercial census retrieved successfully", content = {@Content(mediaType = "application/json")})
            })
    public ResponseEntity<List<CommercialCensusDTO>> getAllCommercialCensus() {
        return new ResponseEntity<>(commercialCensusService.findAllCommercialCensus(), HttpStatus.OK);
    }


    @GetMapping(value = "/commercialGallery", produces = "application/json")
    @Operation(summary = "Returns all the commercial galleries of Barcelona", description = "Returns a list with all commercial galleries")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of commercial galleries retrieved successfully", content = {@Content(mediaType = "application/json")})
    })
    public ResponseEntity<List<CommercialGalleryDTO>> getAllCommercialGalleries() {
        return new ResponseEntity<>(commercialGalleryService.findAllCommercialGalleries(), HttpStatus.OK);
    }


    @GetMapping(value = "/marketsFairs", produces = "application/json")
    @Operation(summary = "Returns all the markets fairs of Barcelona", description = "Returns a list with all markets fairs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of markets fairs retrieved successfully", content = {@Content(mediaType = "application/json")})
    })
    public ResponseEntity<List<MarketFairDTO>> getAllMarketsFairs() {
        return new ResponseEntity<>(marketFairService.findAllMarketsFairs(), HttpStatus.OK);
    }


    @GetMapping(value = "/marketsMun", produces = "application/json")
    @Operation(summary = "Returns all the municipal markets of Barcelona", description = "Returns a list with all municipal markets")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of municipal markets retrieved successfully", content = {@Content(mediaType = "application/json")})
    })
    public ResponseEntity<List<MarketMunDTO>> getAllMarketsMun() {
        return new ResponseEntity<>(marketMunService.findAllMarketsMun(), HttpStatus.OK);
    }


    @GetMapping(value = "/shoppingCenter", produces = "application/json")
    @Operation(summary = "Returns all the shopping centers of Barcelona", description = "Returns a list with all shopping centers")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of shopping centers retrieved successfully", content = {@Content(mediaType = "application/json")})
    })
    public ResponseEntity<List<ShoppingCenterDTO>> getAllShoppingCenters() {
        return new ResponseEntity<>(shoppingCenterService.findAllShoppingCenters(), HttpStatus.OK);
    }

}
