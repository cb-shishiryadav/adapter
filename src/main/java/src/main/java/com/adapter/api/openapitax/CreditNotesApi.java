/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.adapter.api.openapitax;

import com.adapter.model.openapitax.BasicErrorResponse;
import com.adapter.model.openapitax.CreditNote;
import com.adapter.model.openapitax.CreditNoteRequest;
import com.adapter.model.openapitax.HealthCheckResponse;
import com.adapter.model.openapitax.ValidationErrorResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-09T13:23:41.061895+05:30[Asia/Kolkata]")
@Validated
@Tag(name = "CreditNote", description = "Endpoints to manage credit notes sent to the Tax Service Provider.")
public interface CreditNotesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /credit-notes/{creditNoteId}/commit : Commit credit note
     * This endpoint is used to mark a credit note as committed. Once committed, the credit note is considered as finalized.
     *
     * @param creditNoteId The unique identifier of the credit note at the Tax Service Adapter or Tax Service Provider. (required)
     * @param invoiceId The unique identifier of the invoice at the Tax Service Adapter or Tax Service Provider. (optional)
     * @return Credit note committed successfully. (status code 204)
     *         or Unauthenticated request. (status code 401)
     *         or Unauthorized request. (status code 403)
     *         or Not found. (status code 404)
     *         or Too many requests. (status code 429)
     *         or Unexpected error while processing request. (status code 500)
     *         or Service is unhealthy. (status code 503)
     */
    @Operation(
        operationId = "commitCreditNote",
        summary = "Commit credit note",
        description = "This endpoint is used to mark a credit note as committed. Once committed, the credit note is considered as finalized.",
        tags = { "CreditNote" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Credit note committed successfully."),
            @ApiResponse(responseCode = "401", description = "Unauthenticated request."),
            @ApiResponse(responseCode = "403", description = "Unauthorized request."),
            @ApiResponse(responseCode = "404", description = "Not found."),
            @ApiResponse(responseCode = "429", description = "Too many requests."),
            @ApiResponse(responseCode = "500", description = "Unexpected error while processing request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BasicErrorResponse.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service is unhealthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/credit-notes/{creditNoteId}/commit",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Void> commitCreditNote(
        @Parameter(name = "creditNoteId", description = "The unique identifier of the credit note at the Tax Service Adapter or Tax Service Provider.", required = true, in = ParameterIn.PATH) @PathVariable("creditNoteId") String creditNoteId,
        @Parameter(name = "invoiceId", description = "The unique identifier of the invoice at the Tax Service Adapter or Tax Service Provider.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "invoiceId", required = false) String invoiceId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /credit-notes : Create credit note
     * This endpoint is used to send a credit note to the Tax Service Adapter. A credit note is used to reduce the amount due on an invoice. If the credit note is issued after payments have been made for the invoice, refunds can be issued to the Customer.
     *
     * @param creditNoteRequest  (optional)
     * @return Credit note created successfully. (status code 201)
     *         or Bad request. (status code 400)
     *         or Unauthenticated request. (status code 401)
     *         or Unauthorized request. (status code 403)
     *         or Too many requests. (status code 429)
     *         or Unexpected error while processing request. (status code 500)
     *         or Service is unhealthy. (status code 503)
     */
    @Operation(
        operationId = "createCreditNote",
        summary = "Create credit note",
        description = "This endpoint is used to send a credit note to the Tax Service Adapter. A credit note is used to reduce the amount due on an invoice. If the credit note is issued after payments have been made for the invoice, refunds can be issued to the Customer.",
        tags = { "CreditNote" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Credit note created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreditNote.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ValidationErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthenticated request."),
            @ApiResponse(responseCode = "403", description = "Unauthorized request."),
            @ApiResponse(responseCode = "429", description = "Too many requests."),
            @ApiResponse(responseCode = "500", description = "Unexpected error while processing request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BasicErrorResponse.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service is unhealthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/credit-notes",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<CreditNote> createCreditNote(
        @Parameter(name = "CreditNoteRequest", description = "") @Valid @RequestBody(required = false) CreditNoteRequest creditNoteRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"seller\" : { \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"taxRegistrationNumber\" : \"taxRegistrationNumber\", \"hasNexus\" : true }, \"taxableAmount\" : 5.962133916683182, \"roundingAmount\" : 7.061401241503109, \"creditNoteCode\" : \"creditNoteCode\", \"discountAmount\" : 0.8008281904610115, \"exemptAmount\" : 1.4658129805029452, \"invoiceCode\" : \"invoiceCode\", \"lineItems\" : [ { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] } ], \"total\" : 2.3021358869347655, \"subtotal\" : 6.027456183070403, \"taxDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"invoiceId\" : \"invoiceId\", \"currency\" : \"currency\", \"creditNoteId\" : \"creditNoteId\", \"taxAmount\" : 5.637376656633329, \"documentDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"customer\" : { \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"name\" : \"name\", \"customerCode\" : \"customerCode\", \"taxRegistrationNumber\" : \"taxRegistrationNumber\", \"hasNexus\" : true, \"locationEvidence\" : { \"paymentCountryCode\" : \"paymentCountryCode\", \"bin\" : \"bin\", \"ip\" : \"ip\" }, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /credit-notes/{creditNoteId} : Retrieve credit note
     * This endpoint is used to retrieve a specific credit note using the unique credit note id.
     *
     * @param creditNoteId The unique identifier of the credit note at the Tax Service Adapter or Tax Service Provider. (required)
     * @param invoiceId The unique identifier of the invoice at the Tax Service Adapter or Tax Service Provider. (optional)
     * @return Credit note retrieved successfully. (status code 200)
     *         or Unauthenticated request. (status code 401)
     *         or Unauthorized request. (status code 403)
     *         or Not found. (status code 404)
     *         or Too many requests. (status code 429)
     *         or Unexpected error while processing request. (status code 500)
     *         or Service is unhealthy. (status code 503)
     */
    @Operation(
        operationId = "fetchCreditNote",
        summary = "Retrieve credit note",
        description = "This endpoint is used to retrieve a specific credit note using the unique credit note id.",
        tags = { "CreditNote" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Credit note retrieved successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreditNote.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthenticated request."),
            @ApiResponse(responseCode = "403", description = "Unauthorized request."),
            @ApiResponse(responseCode = "404", description = "Not found."),
            @ApiResponse(responseCode = "429", description = "Too many requests."),
            @ApiResponse(responseCode = "500", description = "Unexpected error while processing request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BasicErrorResponse.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service is unhealthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/credit-notes/{creditNoteId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<CreditNote> fetchCreditNote(
        @Parameter(name = "creditNoteId", description = "The unique identifier of the credit note at the Tax Service Adapter or Tax Service Provider.", required = true, in = ParameterIn.PATH) @PathVariable("creditNoteId") String creditNoteId,
        @Parameter(name = "invoiceId", description = "The unique identifier of the invoice at the Tax Service Adapter or Tax Service Provider.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "invoiceId", required = false) String invoiceId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"seller\" : { \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"taxRegistrationNumber\" : \"taxRegistrationNumber\", \"hasNexus\" : true }, \"taxableAmount\" : 5.962133916683182, \"roundingAmount\" : 7.061401241503109, \"creditNoteCode\" : \"creditNoteCode\", \"discountAmount\" : 0.8008281904610115, \"exemptAmount\" : 1.4658129805029452, \"invoiceCode\" : \"invoiceCode\", \"lineItems\" : [ { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] }, { \"unitPrice\" : 0.3616076749251911, \"taxableAmount\" : 1.0246457001441578, \"amount\" : 2.027123023002322, \"quantity\" : 0.9301444243932576, \"itemCode\" : \"itemCode\", \"description\" : \"description\", \"isTaxable\" : true, \"discountAmount\" : 1.2315135367772556, \"taxes\" : [ { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 }, { \"number\" : 1, \"taxableAmount\" : 4.965218492984954, \"rate\" : 11.730742509559434, \"jurisdiction\" : { \"code\" : \"code\", \"name\" : \"name\" }, \"name\" : \"GST\", \"taxAmount\" : 5.025004791520295 } ], \"exemptAmount\" : 7.386281948385884, \"number\" : 1, \"total\" : 6.84685269835264, \"subtotal\" : 4.145608029883936, \"isTaxInclusive\" : true, \"taxAmount\" : 1.4894159098541704, \"taxExemptReason\" : \"The customer is exempt from taxes.\", \"isPartialTax\" : true, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] } ], \"total\" : 2.3021358869347655, \"subtotal\" : 6.027456183070403, \"taxDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"invoiceId\" : \"invoiceId\", \"currency\" : \"currency\", \"creditNoteId\" : \"creditNoteId\", \"taxAmount\" : 5.637376656633329, \"documentDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"customer\" : { \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"state\" : \"state\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"name\" : \"name\", \"customerCode\" : \"customerCode\", \"taxRegistrationNumber\" : \"taxRegistrationNumber\", \"hasNexus\" : true, \"locationEvidence\" : { \"paymentCountryCode\" : \"paymentCountryCode\", \"bin\" : \"bin\", \"ip\" : \"ip\" }, \"taxIdentifiers\" : [ { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" }, { \"id\" : \"id\", \"value\" : \"value\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /credit-notes/{creditNoteId}/void : Void credit note
     * This endpoint is used to void the credit note for a specific credit note id. Voiding reverses the credit note, thereby restoring the amount due on the invoice.
     *
     * @param creditNoteId The unique identifier of the credit note at the Tax Service Adapter or Tax Service Provider. (required)
     * @param invoiceId The unique identifier of the invoice at the Tax Service Adapter or Tax Service Provider. (optional)
     * @return Credit note voided successfully. (status code 204)
     *         or Unauthenticated request. (status code 401)
     *         or Unauthorized request. (status code 403)
     *         or Not found. (status code 404)
     *         or Too many requests. (status code 429)
     *         or Unexpected error while processing request. (status code 500)
     *         or Service is unhealthy. (status code 503)
     */
    @Operation(
        operationId = "voidCreditNote",
        summary = "Void credit note",
        description = "This endpoint is used to void the credit note for a specific credit note id. Voiding reverses the credit note, thereby restoring the amount due on the invoice.",
        tags = { "CreditNote" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Credit note voided successfully."),
            @ApiResponse(responseCode = "401", description = "Unauthenticated request."),
            @ApiResponse(responseCode = "403", description = "Unauthorized request."),
            @ApiResponse(responseCode = "404", description = "Not found."),
            @ApiResponse(responseCode = "429", description = "Too many requests."),
            @ApiResponse(responseCode = "500", description = "Unexpected error while processing request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BasicErrorResponse.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service is unhealthy.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HealthCheckResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/credit-notes/{creditNoteId}/void",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Void> voidCreditNote(
        @Parameter(name = "creditNoteId", description = "The unique identifier of the credit note at the Tax Service Adapter or Tax Service Provider.", required = true, in = ParameterIn.PATH) @PathVariable("creditNoteId") String creditNoteId,
        @Parameter(name = "invoiceId", description = "The unique identifier of the invoice at the Tax Service Adapter or Tax Service Provider.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "invoiceId", required = false) String invoiceId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
