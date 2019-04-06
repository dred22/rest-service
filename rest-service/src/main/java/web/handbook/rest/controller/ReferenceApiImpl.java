package web.handbook.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import web.handbook.rest.api.ReferencesApi;
import web.handbook.rest.api.model.ReferenceDTO;

import java.util.List;

@RestController
public class ReferenceApiImpl implements ReferencesApi {
    @Override
    public ResponseEntity<List<ReferenceDTO>> getReferences(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}
