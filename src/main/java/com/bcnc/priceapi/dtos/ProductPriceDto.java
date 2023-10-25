package com.bcnc.priceapi.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductPriceDto {
  private Long id;
  private Long brandId;
  private String startDate;
  private String endDate;
  private Long priceList;
  private Integer priority;
  private BigDecimal price;
  private String curr;
}
