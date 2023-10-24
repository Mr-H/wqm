package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WqmQueuesPostRequest
 */

@JsonTypeName("_wqm_queues_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-23T10:21:02.177025-04:00[America/New_York]")
public class WqmQueuesPostRequest {

  private JsonNullable<Object> queueName = JsonNullable.undefined();

  private JsonNullable<Object> queueDesc = JsonNullable.undefined();

  private JsonNullable<Object> queueType = JsonNullable.undefined();

  private JsonNullable<Object> queueStatue = JsonNullable.undefined();

  /**
   * Default constructor
   * @deprecated Use {@link WqmQueuesPostRequest#WqmQueuesPostRequest(Object, Object, Object)}
   */
  @Deprecated
  public WqmQueuesPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WqmQueuesPostRequest(Object queueName, Object queueDesc, Object queueType) {
    this.queueName = JsonNullable.of(queueName);
    this.queueDesc = JsonNullable.of(queueDesc);
    this.queueType = JsonNullable.of(queueType);
  }

  public WqmQueuesPostRequest queueName(Object queueName) {
    this.queueName = JsonNullable.of(queueName);
    return this;
  }

  /**
   * The name of the new work queue
   * @return queueName
  */
  @NotNull 
  @Schema(name = "queue_name", example = "a-queue", description = "The name of the new work queue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queue_name")
  public JsonNullable<Object> getQueueName() {
    return queueName;
  }

  public void setQueueName(JsonNullable<Object> queueName) {
    this.queueName = queueName;
  }

  public WqmQueuesPostRequest queueDesc(Object queueDesc) {
    this.queueDesc = JsonNullable.of(queueDesc);
    return this;
  }

  /**
   * A description of the new work queue
   * @return queueDesc
  */
  @NotNull 
  @Schema(name = "queue_desc", example = "This is my new work queue", description = "A description of the new work queue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queue_desc")
  public JsonNullable<Object> getQueueDesc() {
    return queueDesc;
  }

  public void setQueueDesc(JsonNullable<Object> queueDesc) {
    this.queueDesc = queueDesc;
  }

  public WqmQueuesPostRequest queueType(Object queueType) {
    this.queueType = JsonNullable.of(queueType);
    return this;
  }

  /**
   * The type of the queue (LIFO, FIFO, NONE)
   * @return queueType
  */
  @NotNull 
  @Schema(name = "queue_type", example = "LIFO", description = "The type of the queue (LIFO, FIFO, NONE)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queue_type")
  public JsonNullable<Object> getQueueType() {
    return queueType;
  }

  public void setQueueType(JsonNullable<Object> queueType) {
    this.queueType = queueType;
  }

  public WqmQueuesPostRequest queueStatue(Object queueStatue) {
    this.queueStatue = JsonNullable.of(queueStatue);
    return this;
  }

  /**
   * The status of the new work queue
   * @return queueStatue
  */
  
  @Schema(name = "queue_statue", example = "ACTIVE", description = "The status of the new work queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_statue")
  public JsonNullable<Object> getQueueStatue() {
    return queueStatue;
  }

  public void setQueueStatue(JsonNullable<Object> queueStatue) {
    this.queueStatue = queueStatue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WqmQueuesPostRequest wqmQueuesPostRequest = (WqmQueuesPostRequest) o;
    return Objects.equals(this.queueName, wqmQueuesPostRequest.queueName) &&
        Objects.equals(this.queueDesc, wqmQueuesPostRequest.queueDesc) &&
        Objects.equals(this.queueType, wqmQueuesPostRequest.queueType) &&
        equalsNullable(this.queueStatue, wqmQueuesPostRequest.queueStatue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueName, queueDesc, queueType, hashCodeNullable(queueStatue));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WqmQueuesPostRequest {\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueDesc: ").append(toIndentedString(queueDesc)).append("\n");
    sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
    sb.append("    queueStatue: ").append(toIndentedString(queueStatue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

