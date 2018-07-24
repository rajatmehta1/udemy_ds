package com.ksl.arrays;

public class BinaryException extends Exception {
    private String mesg;

    public BinaryException(String mesg) {
        this.mesg = mesg;
    }

    public String getMessage() {
        return this.mesg;
    }

}
