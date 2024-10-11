package com.restapi.demorestapi.service.impl;

import com.restapi.demorestapi.model.Delivery;
import com.restapi.demorestapi.repository.dao.DeliveryDao;
import com.restapi.demorestapi.service.DeliveryService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DeliveryServiceImpl implements DeliveryService {

	DeliveryDao deliveryDao;

	@Override
	public List<Delivery> findAll() {
		return (List<Delivery>) deliveryDao.findAll();
	}

	@Override
	public Optional<Delivery> findById(Long id) {
		return deliveryDao.findById(id);
	}

	@Override
	public void save(Delivery Delivery) {
		deliveryDao.save(Delivery);
	}

	@Override
	public Boolean delete(Delivery Delivery) {
		try {
			deliveryDao.delete(Delivery);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
