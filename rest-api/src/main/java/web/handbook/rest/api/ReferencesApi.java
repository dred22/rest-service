package web.handbook.rest.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import web.handbook.rest.api.model.ReferenceDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(value = "references")
public interface ReferencesApi {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "References successfully retrieved"),
            @ApiResponse(code = 403, message = "Forbidden access to providers"),
            @ApiResponse(code = 500, message = "An error occurred while processing the request")
    })
    @GetMapping(value = "/providers", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<ReferenceDTO>> getReferences(

/*            @ApiParam("Filters providers by country code (ISO 3166 alpha 3)")
            @RequestParam(value = "country_code", required = false)
                    String countryCode,


            @ApiParam("Filters providers containing a given channel definition type (REDIRECT or EMBEDDED)")
            @RequestParam(value = "channel_definition_mode", required = false)
                    ChannelDefinitionMode channelDefinitionMode,*/

            HttpServletRequest request
    );
}
