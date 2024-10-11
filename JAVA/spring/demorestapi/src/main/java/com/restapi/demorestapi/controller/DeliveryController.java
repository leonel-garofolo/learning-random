package com.restapi.demorestapi.controller;


import com.restapi.demorestapi.api.DeliveriesApi;
import com.restapi.demorestapi.api.dto.DeliveryRequest;
import com.restapi.demorestapi.api.dto.DeliveryResponse;
import com.restapi.demorestapi.model.convert.DeliveryConvert;
import com.restapi.demorestapi.service.DeliveryService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DeliveryController implements DeliveriesApi {

    DeliveryService deliveryService;
    DeliveryConvert deliveryConvert;

    @Override
    public ResponseEntity<List<DeliveryResponse>> findAllDelivery() {
        return ResponseEntity.ok(deliveryConvert.asDeliveriesResponse(deliveryService.findAll()));
    }

    @Override
    public ResponseEntity<DeliveryResponse> findDelivery(Long id) {
        return deliveryService.findById(id)
                .map(delivery -> ResponseEntity.ok(deliveryConvert.asDeliveryResponse(delivery)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Void> createDelivery(DeliveryRequest deliveryRequest) {
        deliveryService.save(deliveryConvert.asDelivery(deliveryRequest));
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> deleteDelivery(Long id) {
        var delivery = deliveryService.findById(id);
        if (delivery.isPresent()) {
            deliveryService.delete(delivery.get());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
