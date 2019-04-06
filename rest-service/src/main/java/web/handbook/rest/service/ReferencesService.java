package web.handbook.rest.service;

import web.handbook.rest.api.model.ReferenceDTO;

import java.util.List;

public interface ReferencesService {

    List<ReferenceDTO> getReferences();
}
