package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WqmQueuesQueueIdItemsPostRequest
 */

@JsonTypeName("_wqm_queues__queue_id__items_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-23T10:21:02.177025-04:00[America/New_York]")
public class WqmQueuesQueueIdItemsPostRequest {

  private JsonNullable<Object> itemName = JsonNullable.undefined();

  private JsonNullable<Object> itemDesc = JsonNullable.undefined();

  private JsonNullable<Object> itemStatus = JsonNullable.undefined();

  /**
   * Default constructor
   * @deprecated Use {@link WqmQueuesQueueIdItemsPostRequest#WqmQueuesQueueIdItemsPostRequest(Object, Object, Object)}
   */
  @Deprecated
  public WqmQueuesQueueIdItemsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WqmQueuesQueueIdItemsPostRequest(Object itemName, Object itemDesc, Object itemStatus) {
    this.itemName = JsonNullable.of(itemName);
    this.itemDesc = JsonNullable.of(itemDesc);
    this.itemStatus = JsonNullable.of(itemStatus);
  }

  public WqmQueuesQueueIdItemsPostRequest itemName(Object itemName) {
    this.itemName = JsonNullable.of(itemName);
    return this;
  }

  /**
   * The name of the new queue item
   * @return itemName
  */
  @NotNull 
  @Schema(name = "item_name", example = "a-new-queue-item", description = "The name of the new queue item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_name")
  public JsonNullable<Object> getItemName() {
    return itemName;
  }

  public void setItemName(JsonNullable<Object> itemName) {
    this.itemName = itemName;
  }

  public WqmQueuesQueueIdItemsPostRequest itemDesc(Object itemDesc) {
    this.itemDesc = JsonNullable.of(itemDesc);
    return this;
  }

  /**
   * A description of the new queue item
   * @return itemDesc
  */
  @NotNull 
  @Schema(name = "item_desc", example = "This is a new work queue item", description = "A description of the new queue item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_desc")
  public JsonNullable<Object> getItemDesc() {
    return itemDesc;
  }

  public void setItemDesc(JsonNullable<Object> itemDesc) {
    this.itemDesc = itemDesc;
  }

  public WqmQueuesQueueIdItemsPostRequest itemStatus(Object itemStatus) {
    this.itemStatus = JsonNullable.of(itemStatus);
    return this;
  }

  /**
   * Work item status (OPEN, LOCKED, PROCESSED, DELETED)
   * @return itemStatus
  */
  @NotNull 
  @Schema(name = "item_status", example = "OPEN", description = "Work item status (OPEN, LOCKED, PROCESSED, DELETED)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_status")
  public JsonNullable<Object> getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(JsonNullable<Object> itemStatus) {
    this.itemStatus = itemStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WqmQueuesQueueIdItemsPostRequest wqmQueuesQueueIdItemsPostRequest = (WqmQueuesQueueIdItemsPostRequest) o;
    return Objects.equals(this.itemName, wqmQueuesQueueIdItemsPostRequest.itemName) &&
        Objects.equals(this.itemDesc, wqmQueuesQueueIdItemsPostRequest.itemDesc) &&
        Objects.equals(this.itemStatus, wqmQueuesQueueIdItemsPostRequest.itemStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemName, itemDesc, itemStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WqmQueuesQueueIdItemsPostRequest {\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemDesc: ").append(toIndentedString(itemDesc)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
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

