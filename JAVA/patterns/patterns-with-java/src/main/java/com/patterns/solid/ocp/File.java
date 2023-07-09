package com.patterns.solid.ocp;

final class File implements Measurable{
  private Double totalLength;
  private Double sentLength;

  public File(Double totalLength, Double sentLength) {
    this.totalLength = totalLength;
    this.sentLength = sentLength;
  }

  public Double getSentLengthPercentage() {
    return sentLength * 100 / totalLength;
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