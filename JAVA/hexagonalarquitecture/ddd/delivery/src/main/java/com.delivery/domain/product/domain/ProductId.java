package com.delivery.domain.product.domain;

import java.util.Objects;

public class ProductId {

	private final Long id;

	public ProductId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ProductId productId = (ProductId) o;

		return Objects.equals(id, productId.id);
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
