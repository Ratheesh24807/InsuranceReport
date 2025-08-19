package org.amadeus.exception;

public enum ErrorListInternal {

    INVALID_USER_ID( "The customer is not present by this id"),
    DATABASE_FAILURE("Unable to fetch the data from database. Internal server error");
    private final String error;

    ErrorListInternal( String error) {

        this.error = error;
    }

    public String toError() {
        return error;
    }
}

