package org.thread.lab.model;

import org.thread.lab.utils.UtilsThreadLab;

import java.util.Date;
import java.util.UUID;

public class Delivery {

	private UUID id;

	private Date startDelivery;

	private String address;

	public Delivery(String address) {
		this.id = UUID.randomUUID();
		this.startDelivery = UtilsThreadLab.getCurrentTimestamp();
		this.address = address;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getStartDelivery() {
		return startDelivery;
	}

	public void setStartDelivery(Date startDelivery) {
		this.startDelivery = startDelivery;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("uuid:%s , address: %s", this.getId(), this.getAddress());
	}
}
