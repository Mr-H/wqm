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
 * WqmQueuesQueueIdPutRequest
 */

@JsonTypeName("_wqm_queues__queue_id__put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-23T10:21:02.177025-04:00[America/New_York]")
public class WqmQueuesQueueIdPutRequest {

  private JsonNullable<Object> queueName = JsonNullable.undefined();

  private JsonNullable<Object> queueDesc = JsonNullable.undefined();

  private JsonNullable<Object> queueType = JsonNullable.undefined();

  private JsonNullable<Object> queueStatus = JsonNullable.undefined();

  public WqmQueuesQueueIdPutRequest queueName(Object queueName) {
    this.queueName = JsonNullable.of(queueName);
    return this;
  }

  /**
   * The new name of the work queue
   * @return queueName
  */
  
  @Schema(name = "queue_name", example = "an-updated-queue", description = "The new name of the work queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_name")
  public JsonNullable<Object> getQueueName() {
    return queueName;
  }

  public void setQueueName(JsonNullable<Object> queueName) {
    this.queueName = queueName;
  }

  public WqmQueuesQueueIdPutRequest queueDesc(Object queueDesc) {
    this.queueDesc = JsonNullable.of(queueDesc);
    return this;
  }

  /**
   * The new description of the work queue
   * @return queueDesc
  */
  
  @Schema(name = "queue_desc", example = "This is an updated work queue", description = "The new description of the work queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_desc")
  public JsonNullable<Object> getQueueDesc() {
    return queueDesc;
  }

  public void setQueueDesc(JsonNullable<Object> queueDesc) {
    this.queueDesc = queueDesc;
  }

  public WqmQueuesQueueIdPutRequest queueType(Object queueType) {
    this.queueType = JsonNullable.of(queueType);
    return this;
  }

  /**
   * The type of the queue (LIFO, FIFO, NONE)
   * @return queueType
  */
  
  @Schema(name = "queue_type", example = "LIFO", description = "The type of the queue (LIFO, FIFO, NONE)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_type")
  public JsonNullable<Object> getQueueType() {
    return queueType;
  }

  public void setQueueType(JsonNullable<Object> queueType) {
    this.queueType = queueType;
  }

  public WqmQueuesQueueIdPutRequest queueStatus(Object queueStatus) {
    this.queueStatus = JsonNullable.of(queueStatus);
    return this;
  }

  /**
   * The new status of the work queue
   * @return queueStatus
  */
  
  @Schema(name = "queue_status", example = "ACTIVE", description = "The new status of the work queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_status")
  public JsonNullable<Object> getQueueStatus() {
    return queueStatus;
  }

  public void setQueueStatus(JsonNullable<Object> queueStatus) {
    this.queueStatus = queueStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WqmQueuesQueueIdPutRequest wqmQueuesQueueIdPutRequest = (WqmQueuesQueueIdPutRequest) o;
    return equalsNullable(this.queueName, wqmQueuesQueueIdPutRequest.queueName) &&
        equalsNullable(this.queueDesc, wqmQueuesQueueIdPutRequest.queueDesc) &&
        equalsNullable(this.queueType, wqmQueuesQueueIdPutRequest.queueType) &&
        equalsNullable(this.queueStatus, wqmQueuesQueueIdPutRequest.queueStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(queueName), hashCodeNullable(queueDesc), hashCodeNullable(queueType), hashCodeNullable(queueStatus));
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
    sb.append("class WqmQueuesQueueIdPutRequest {\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueDesc: ").append(toIndentedString(queueDesc)).append("\n");
    sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
    sb.append("    queueStatus: ").append(toIndentedString(queueStatus)).append("\n");
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

