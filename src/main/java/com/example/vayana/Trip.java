package com.example.vayana;

public class Trip {
    String airlineName;
    String airlineId;
    String sourceAirport;
    String sourceAirportId;
    String destinationAirport;
    String getDestinationAirportId;

    public Trip(){

    }

    public Trip(String airlineName, String airlineId, String sourceAirport, String sourceAirportId, String destinationAirport, String getDestinationAirportId) {
        this.airlineName = airlineName;
        this.airlineId = airlineId;
        this.sourceAirport = sourceAirport;
        this.sourceAirportId = sourceAirportId;
        this.destinationAirport = destinationAirport;
        this.getDestinationAirportId = getDestinationAirportId;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public String getSourceAirportId() {
        return sourceAirportId;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getGetDestinationAirportId() {
        return getDestinationAirportId;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public void setSourceAirportId(String sourceAirportId) {
        this.sourceAirportId = sourceAirportId;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public void setGetDestinationAirportId(String getDestinationAirportId) {
        this.getDestinationAirportId = getDestinationAirportId;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "airlineName='" + airlineName + '\'' +
                ", airlineId='" + airlineId + '\'' +
                ", sourceAirport='" + sourceAirport + '\'' +
                ", sourceAirportId='" + sourceAirportId + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", getDestinationAirportId='" + getDestinationAirportId + '\'' +
                '}';
    }
}
