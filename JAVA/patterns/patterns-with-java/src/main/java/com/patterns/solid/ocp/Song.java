package com.patterns.solid.ocp;

final class Song implements Measurable {
    private Double totalLength;
    private Double sentLength;

    public Song(Double totalLength, Double sentLength) {
        this.totalLength = totalLength;
        this.sentLength = sentLength;
    }

    @Override
    public Double getTotalLength() {
        return totalLength;
    }
    
    @Override
    public Double getSentLength() {
        return sentLength;
    }
}