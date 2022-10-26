package ajc.fr.thales.projetPatisserie.model.exception;

import org.springframework.web.server.ResponseStatusException;

import java.util.function.Supplier;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends Exception  implements ResponsableException {
	
	private static final long serialVersionUID = -482919263914713319L;
	
	private Object id;
	private Class<?> origin;

	public EntityNotFoundException(Class<?> c,Object id) {
		super(message(c.getName(),id));
		this.origin = c;
		this.id = id;
	}
	
	public ResponseStatusException toResponse() {
		return new ResponseStatusException(HttpStatus.NOT_FOUND,message(origin.getSimpleName(),id));
	}
	
	private static String message(String className,Object id) {
		return "L'objet ["+className+", id="+id+"] n'existe pas";
	}
	
	public static ResponseStatusException responseStatus(Class<?> c,Object id) {
		return new EntityNotFoundException(c,id).toResponse();
	}
	
	public static Supplier<? extends ResponseStatusException> responseStatusSupplier(Class<?> c,Object id) {
		return () -> responseStatus(c,id);
	}

}
