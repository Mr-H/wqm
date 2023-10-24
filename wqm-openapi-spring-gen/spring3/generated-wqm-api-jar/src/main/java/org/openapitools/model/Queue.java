package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Queue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-23T10:21:02.177025-04:00[America/New_York]")
public class Queue {

  private JsonNullable<Object> queueId = JsonNullable.undefined();

  private JsonNullable<Object> queueName = JsonNullable.undefined();

  private JsonNullable<Object> queueDesc = JsonNullable.undefined();

  private JsonNullable<Object> queueType = JsonNullable.undefined();

  private JsonNullable<Object> queueStatus = JsonNullable.undefined();

  public Queue queueId(Object queueId) {
    this.queueId = JsonNullable.of(queueId);
    return this;
  }

  /**
   * The unique identifier for the queue
   * @return queueId
  */
  
  @Schema(name = "queue_id", example = "1", description = "The unique identifier for the queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_id")
  public JsonNullable<Object> getQueueId() {
    return queueId;
  }

  public void setQueueId(JsonNullable<Object> queueId) {
    this.queueId = queueId;
  }

  public Queue queueName(Object queueName) {
    this.queueName = JsonNullable.of(queueName);
    return this;
  }

  /**
   * The name of the queue
   * @return queueName
  */
  
  @Schema(name = "queue_name", example = "a-queue", description = "The name of the queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_name")
  public JsonNullable<Object> getQueueName() {
    return queueName;
  }

  public void setQueueName(JsonNullable<Object> queueName) {
    this.queueName = queueName;
  }

  public Queue queueDesc(Object queueDesc) {
    this.queueDesc = JsonNullable.of(queueDesc);
    return this;
  }

  /**
   * A description of the queue
   * @return queueDesc
  */
  
  @Schema(name = "queue_desc", example = "This is a work queue", description = "A description of the queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_desc")
  public JsonNullable<Object> getQueueDesc() {
    return queueDesc;
  }

  public void setQueueDesc(JsonNullable<Object> queueDesc) {
    this.queueDesc = queueDesc;
  }

  public Queue queueType(Object queueType) {
    this.queueType = JsonNullable.of(queueType);
    return this;
  }

  /**
   * The queue read order LIFO or FIFO or NONE
   * @return queueType
  */
  
  @Schema(name = "queue_type", example = "FIFO", description = "The queue read order LIFO or FIFO or NONE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue_type")
  public JsonNullable<Object> getQueueType() {
    return queueType;
  }

  public void setQueueType(JsonNullable<Object> queueType) {
    this.queueType = queueType;
  }

  public Queue queueStatus(Object queueStatus) {
    this.queueStatus = JsonNullable.of(queueStatus);
    return this;
  }

  /**
   * The status of the work queue
   * @return queueStatus
  */
  
  @Schema(name = "queue_status", example = "ACTIVE", description = "The status of the work queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Queue queue = (Queue) o;
    return equalsNullable(this.queueId, queue.queueId) &&
        equalsNullable(this.queueName, queue.queueName) &&
        equalsNullable(this.queueDesc, queue.queueDesc) &&
        equalsNullable(this.queueType, queue.queueType) &&
        equalsNullable(this.queueStatus, queue.queueStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(queueId), hashCodeNullable(queueName), hashCodeNullable(queueDesc), hashCodeNullable(queueType), hashCodeNullable(queueStatus));
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
    sb.append("class Queue {\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
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

