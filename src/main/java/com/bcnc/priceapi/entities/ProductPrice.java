package com.bcnc.priceapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRICES")
@Data
public class ProductPrice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private Long brandId;

  @NotNull
  private Date startDate;

  @NotNull
  private Date endDate;

  @NotNull
  private Long priceList;

  @NotNull
  private Integer priority;

  @NotNull
  private BigDecimal price;

  @NotNull
  private String curr;

}
