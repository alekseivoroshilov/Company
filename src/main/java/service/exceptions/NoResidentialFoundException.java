package service.exceptions;

import javax.persistence.EntityNotFoundException;

public class NoResidentialFoundException extends EntityNotFoundException {
    private final static String msg = "Residentials with provided id doesn't exist.";
    public NoResidentialFoundException() {
        super(msg);
    }
}
