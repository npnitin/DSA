package com.example.vayana;

public class SourceDestination {
    private String source;
    private String destination;

    public String getDestination() {
        return destination;
    }

    public String getSource() {
        return source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSource(String source) {
        this.source = source;
    }

    SourceDestination(String source, String destination){
        this.source = source;
        this.destination = destination;
    }
}
