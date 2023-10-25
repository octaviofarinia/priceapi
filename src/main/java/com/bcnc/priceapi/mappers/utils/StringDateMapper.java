package com.bcnc.priceapi.mappers.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class StringDateMapper {
  public String asString(Date date) {
    return date != null ? new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss").format(date) : null;
  }

  public Date asDate(String strDate) throws ParseException {
    if (strDate != null) {
      return new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss").parse(strDate);
    } else {
      return null;
    }
  }
}
