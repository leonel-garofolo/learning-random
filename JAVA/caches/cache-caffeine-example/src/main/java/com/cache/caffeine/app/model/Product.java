package com.cache.caffeine.app.model;

public class Product implements ID {

  private Long id;

  private String description;

  private Boolean activated;

  public Product(Long id, String description, Boolean activated) {
    this.id = id;
    this.description = description;
    this.activated = activated;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getActivated() {
    return activated;
  }

  public void setActivated(Boolean activated) {
    this.activated = activated;
  }

  @Override
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Product{");
    sb.append("id=").append(id);
    sb.append(", description='").append(description).append('\'');
    sb.append(", activated=").append(activated);
    sb.append('}');
    return sb.toString();
  }
}
