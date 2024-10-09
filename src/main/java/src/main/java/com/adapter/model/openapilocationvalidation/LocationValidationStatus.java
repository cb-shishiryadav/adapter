package com.adapter.model.openapilocationvalidation;

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
 * The validation status of the location if a single country is identifiable.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-09T13:23:40.511864+05:30[Asia/Kolkata]")
public enum LocationValidationStatus {
  
  VALID("VALID"),
  
  INVALID("INVALID");

  private String value;

  LocationValidationStatus(String value) {
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
  public static LocationValidationStatus fromValue(String value) {
    for (LocationValidationStatus b : LocationValidationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

