package com.restapi.demorestapi.model.convert;

import com.restapi.demorestapi.api.dto.DeliveryRequest;
import com.restapi.demorestapi.api.dto.DeliveryResponse;
import com.restapi.demorestapi.model.Delivery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeliveryConvert {

    List<DeliveryResponse> asDeliveriesResponse(List<Delivery> deliveries);

    DeliveryResponse asDeliveryResponse(Delivery delivery);

    Delivery asDelivery(DeliveryRequest deliveryRequest);
}
