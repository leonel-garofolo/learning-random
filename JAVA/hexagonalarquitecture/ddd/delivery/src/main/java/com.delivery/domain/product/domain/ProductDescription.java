package com.delivery.domain.product.domain;

import java.util.Objects;

public final class ProductDescription {

	private final String description;

	public ProductDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ProductDescription that = (ProductDescription) o;

		return Objects.equals(description, that.description);
	}

	@Override
	public int hashCode() {
		return description != null ? description.hashCode() : 0;
	}
}
