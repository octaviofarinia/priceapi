package com.bcnc.priceapi.services;

import com.bcnc.priceapi.dtos.ProductPriceDto;
import com.bcnc.priceapi.mappers.ProductPriceMapper;
import com.bcnc.priceapi.repositories.ProductPriceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPriceService {

  private final ProductPriceRepository productPriceRepository;

  private final ProductPriceMapper productPriceMapper;

  public ProductPriceService(ProductPriceRepository productPriceRepository, ProductPriceMapper productPriceMapper) {
    this.productPriceRepository = productPriceRepository;
    this.productPriceMapper = productPriceMapper;
  }

  public List<ProductPriceDto> findAll() {
    return productPriceMapper.toDTOsList(productPriceRepository.findAll());
  }

}
