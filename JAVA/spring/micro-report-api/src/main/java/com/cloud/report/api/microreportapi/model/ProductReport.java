package com.cloud.report.api.microreportapi.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductReport {
	@Id
	public String id;
	private String name;
	private String description;
	private Integer sold;

	public ProductReport(String name, String description, Integer sold) {
		this.name = name;
		this.description = description;
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "ProductReport{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", sold=" + sold + '}';
	}
}
