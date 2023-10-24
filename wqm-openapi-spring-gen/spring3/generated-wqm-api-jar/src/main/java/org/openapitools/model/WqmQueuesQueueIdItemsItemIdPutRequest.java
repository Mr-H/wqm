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
 * WqmQueuesQueueIdItemsItemIdPutRequest
 */

@JsonTypeName("_wqm_queues__queue_id__items__item_id__put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-23T10:21:02.177025-04:00[America/New_York]")
public class WqmQueuesQueueIdItemsItemIdPutRequest {

  private JsonNullable<Object> itemName = JsonNullable.undefined();

  private JsonNullable<Object> itemDesc = JsonNullable.undefined();

  private JsonNullable<Object> itemStatus = JsonNullable.undefined();

  /**
   * Default constructor
   * @deprecated Use {@link WqmQueuesQueueIdItemsItemIdPutRequest#WqmQueuesQueueIdItemsItemIdPutRequest(Object)}
   */
  @Deprecated
  public WqmQueuesQueueIdItemsItemIdPutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WqmQueuesQueueIdItemsItemIdPutRequest(Object itemStatus) {
    this.itemStatus = JsonNullable.of(itemStatus);
  }

  public WqmQueuesQueueIdItemsItemIdPutRequest itemName(Object itemName) {
    this.itemName = JsonNullable.of(itemName);
    return this;
  }

  /**
   * The new name of the work queue item
   * @return itemName
  */
  
  @Schema(name = "item_name", example = "updated-queue-item", description = "The new name of the work queue item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_name")
  public JsonNullable<Object> getItemName() {
    return itemName;
  }

  public void setItemName(JsonNullable<Object> itemName) {
    this.itemName = itemName;
  }

  public WqmQueuesQueueIdItemsItemIdPutRequest itemDesc(Object itemDesc) {
    this.itemDesc = JsonNullable.of(itemDesc);
    return this;
  }

  /**
   * The new description of the work queue item
   * @return itemDesc
  */
  
  @Schema(name = "item_desc", example = "This is my updated work queue item", description = "The new description of the work queue item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_desc")
  public JsonNullable<Object> getItemDesc() {
    return itemDesc;
  }

  public void setItemDesc(JsonNullable<Object> itemDesc) {
    this.itemDesc = itemDesc;
  }

  public WqmQueuesQueueIdItemsItemIdPutRequest itemStatus(Object itemStatus) {
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
    WqmQueuesQueueIdItemsItemIdPutRequest wqmQueuesQueueIdItemsItemIdPutRequest = (WqmQueuesQueueIdItemsItemIdPutRequest) o;
    return equalsNullable(this.itemName, wqmQueuesQueueIdItemsItemIdPutRequest.itemName) &&
        equalsNullable(this.itemDesc, wqmQueuesQueueIdItemsItemIdPutRequest.itemDesc) &&
        Objects.equals(this.itemStatus, wqmQueuesQueueIdItemsItemIdPutRequest.itemStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(itemName), hashCodeNullable(itemDesc), itemStatus);
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
    sb.append("class WqmQueuesQueueIdItemsItemIdPutRequest {\n");
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

