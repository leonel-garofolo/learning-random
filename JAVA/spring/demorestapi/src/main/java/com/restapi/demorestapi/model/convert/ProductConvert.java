package com.restapi.demorestapi.model.convert;

import com.restapi.demorestapi.api.dto.ProductRequest;
import com.restapi.demorestapi.api.dto.ProductResponse;
import com.restapi.demorestapi.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductConvert {

    List<ProductResponse> asProductsResponse(List<Product> Products);

    ProductResponse asProductResponse(Product Product);

    Product asProduct(ProductRequest ProductRequest);
}
