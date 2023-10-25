package com.bcnc.priceapi.controllers;

import com.bcnc.priceapi.dtos.ProductPriceDto;
import com.bcnc.priceapi.services.ProductPriceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product-price")
public class ProductPriceController {

  private final ProductPriceService productPriceService;

  public ProductPriceController(ProductPriceService productPriceService) {
    this.productPriceService = productPriceService;
  }

  @GetMapping("")
  public ResponseEntity<List<ProductPriceDto>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(productPriceService.findAll());
  }

}
