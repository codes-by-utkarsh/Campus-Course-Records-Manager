package edu.campus.ccrm.exception;

/**
 * Custom exception thrown when data import operations fail.
 */
public class DataImportException extends Exception {
    public DataImportException(String message) {
        super(message);
    }

    public DataImportException(String message, Throwable cause) {
        super(message, cause);
    }
}
