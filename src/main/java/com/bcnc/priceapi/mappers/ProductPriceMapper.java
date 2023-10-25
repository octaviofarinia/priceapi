package com.bcnc.priceapi.mappers;

import com.bcnc.priceapi.dtos.ProductPriceDto;
import com.bcnc.priceapi.entities.ProductPrice;
import com.bcnc.priceapi.mappers.utils.StringDateMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = StringDateMapper.class)
public interface ProductPriceMapper {
  ProductPriceDto toDTO(ProductPrice source);
  ProductPrice toEntity(ProductPriceDto source);

  List<ProductPriceDto> toDTOsList(List<ProductPrice> source);
  List<ProductPrice> toEntitiesList(List<ProductPriceDto> source);
}
