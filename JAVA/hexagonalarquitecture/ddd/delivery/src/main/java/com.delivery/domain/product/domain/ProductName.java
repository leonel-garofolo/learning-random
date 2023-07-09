package com.delivery.domain.product.domain;

import java.util.Objects;

public final class ProductName {

	private final String name;

	public ProductName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ProductName that = (ProductName) o;

		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
