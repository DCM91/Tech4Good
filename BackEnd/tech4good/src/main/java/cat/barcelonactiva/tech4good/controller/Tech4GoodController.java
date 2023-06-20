package cat.barcelonactiva.tech4good.controller;

import cat.barcelonactiva.tech4good.model.dto.CommercialCensusDTO;
import cat.barcelonactiva.tech4good.model.service.CommercialCensusService;
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

    @GetMapping(value = "/commercialCensus", produces = "application/json")
    @Operation(summary = "Returns all the commercial census of Barcelona", description = "Returns a list with all commercial census")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of commercial census retrieved successfully", content = {@Content(mediaType = "application/json")})
            })

    public ResponseEntity<List<CommercialCensusDTO>> getAllCommercialCensus() {
        return new ResponseEntity<>(commercialCensusService.findAllCommercialCensus(), HttpStatus.OK);
    }

}
