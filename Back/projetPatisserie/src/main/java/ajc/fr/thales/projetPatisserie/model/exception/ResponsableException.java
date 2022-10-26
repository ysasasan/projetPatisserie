package ajc.fr.thales.projetPatisserie.model.exception;

import org.springframework.web.server.ResponseStatusException;

public interface ResponsableException {
	
	public ResponseStatusException toResponse();

}
