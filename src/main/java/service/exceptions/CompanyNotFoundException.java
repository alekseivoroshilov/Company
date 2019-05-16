package service.exceptions;

import service.entity.Company;

import javax.persistence.EntityNotFoundException;

public class CompanyNotFoundException extends EntityNotFoundException {
    private final static String msg = "Company with provided id doesn't exist.";
    public CompanyNotFoundException() {
        super(msg);
    }
}