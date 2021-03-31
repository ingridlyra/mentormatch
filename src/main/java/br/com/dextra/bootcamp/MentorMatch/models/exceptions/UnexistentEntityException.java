package br.com.dextra.bootcamp.MentorMatch.models.exceptions;

public class UnexistentEntityException extends RuntimeException{
    private static final long serialVersionId = 1L;

    public UnexistentEntityException() {
    }

    public UnexistentEntityException(String message) {
        super(message);
    }
}
