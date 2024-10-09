package com.adapter.model.openapitax;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of tax jurisdiction.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-09T13:23:41.061895+05:30[Asia/Kolkata]")
public enum TaxJurisdictionType {
  
  COUNTRY("COUNTRY"),
  
  FEDERAL("FEDERAL"),
  
  STATE("STATE"),
  
  COUNTY("COUNTY"),
  
  CITY("CITY"),
  
  SPECIAL("SPECIAL"),
  
  OTHER("OTHER");

  private String value;

  TaxJurisdictionType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaxJurisdictionType fromValue(String value) {
    for (TaxJurisdictionType b : TaxJurisdictionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

