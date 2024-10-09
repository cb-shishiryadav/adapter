package com.adapter.model.openapitrn;

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
 * Indicates the type of the tax registration number.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-09T13:23:41.894560+05:30[Asia/Kolkata]")
public enum TrnType {
  
  INDIVIDUAL("INDIVIDUAL"),
  
  BUSINESS("BUSINESS"),
  
  GST("GST"),
  
  VAT("VAT"),
  
  ENTITY("ENTITY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  TrnType(String value) {
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
  public static TrnType fromValue(String value) {
    for (TrnType b : TrnType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

