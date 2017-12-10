package com.sda.classes;

public enum Status {
    DISABLED("disabled", "user is disabled"),
    INACTIVE("inactive", "user is inactive"),
    ENABLED("enabled", "user is enabled"),
    SUSPENDED("suspended", "user is suspended");

    private String name;
    private String message;

    Status(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public static Status getStatus(String name) {
        for (Status status : Status.values()) {
            if (status.name == name)
                return status;
        }
        return null;
    }

}
