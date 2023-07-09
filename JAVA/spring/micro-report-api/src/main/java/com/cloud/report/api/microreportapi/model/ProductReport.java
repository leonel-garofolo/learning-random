package com.cloud.report.api.microreportapi.model;

import java.util.Date;

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

	private Date soldDated;
	private String name;
	private String description;
	private Integer sold;

	public ProductReport(Date soldDated, String name, String description, Integer sold) {
		this.soldDated = soldDated;
		this.name = name;
		this.description = description;
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "ProductReport{" + "id='" + id + '\'' + ", soldDated=" + soldDated + ", name='" + name + '\'' + ", description='" + description + '\'' + ", sold=" + sold + '}';
	}
}
