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
 * WorkItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-23T10:21:02.177025-04:00[America/New_York]")
public class WorkItem {

  private JsonNullable<Object> itemId = JsonNullable.undefined();

  private JsonNullable<Object> itemName = JsonNullable.undefined();

  private JsonNullable<Object> itemDesc = JsonNullable.undefined();

  private JsonNullable<Object> itemStatus = JsonNullable.undefined();

  private JsonNullable<Object> itemLock = JsonNullable.undefined();

  public WorkItem itemId(Object itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * The unique identifier for the work queue item
   * @return itemId
  */
  
  @Schema(name = "item_id", example = "1", description = "The unique identifier for the work queue item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_id")
  public JsonNullable<Object> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<Object> itemId) {
    this.itemId = itemId;
  }

  public WorkItem itemName(Object itemName) {
    this.itemName = JsonNullable.of(itemName);
    return this;
  }

  /**
   * The name of the work item
   * @return itemName
  */
  
  @Schema(name = "item_name", example = "work-item", description = "The name of the work item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_name")
  public JsonNullable<Object> getItemName() {
    return itemName;
  }

  public void setItemName(JsonNullable<Object> itemName) {
    this.itemName = itemName;
  }

  public WorkItem itemDesc(Object itemDesc) {
    this.itemDesc = JsonNullable.of(itemDesc);
    return this;
  }

  /**
   * A description of the work item
   * @return itemDesc
  */
  
  @Schema(name = "item_desc", example = "This is a work item", description = "A description of the work item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_desc")
  public JsonNullable<Object> getItemDesc() {
    return itemDesc;
  }

  public void setItemDesc(JsonNullable<Object> itemDesc) {
    this.itemDesc = itemDesc;
  }

  public WorkItem itemStatus(Object itemStatus) {
    this.itemStatus = JsonNullable.of(itemStatus);
    return this;
  }

  /**
   * The status of the work item
   * @return itemStatus
  */
  
  @Schema(name = "item_status", example = "OPEN", description = "The status of the work item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_status")
  public JsonNullable<Object> getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(JsonNullable<Object> itemStatus) {
    this.itemStatus = itemStatus;
  }

  public WorkItem itemLock(Object itemLock) {
    this.itemLock = JsonNullable.of(itemLock);
    return this;
  }

  /**
   * The work item lock
   * @return itemLock
  */
  
  @Schema(name = "item_lock", example = "UNLOCKED", description = "The work item lock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_lock")
  public JsonNullable<Object> getItemLock() {
    return itemLock;
  }

  public void setItemLock(JsonNullable<Object> itemLock) {
    this.itemLock = itemLock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItem workItem = (WorkItem) o;
    return equalsNullable(this.itemId, workItem.itemId) &&
        equalsNullable(this.itemName, workItem.itemName) &&
        equalsNullable(this.itemDesc, workItem.itemDesc) &&
        equalsNullable(this.itemStatus, workItem.itemStatus) &&
        equalsNullable(this.itemLock, workItem.itemLock);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(itemId), hashCodeNullable(itemName), hashCodeNullable(itemDesc), hashCodeNullable(itemStatus), hashCodeNullable(itemLock));
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
    sb.append("class WorkItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemDesc: ").append(toIndentedString(itemDesc)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    itemLock: ").append(toIndentedString(itemLock)).append("\n");
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

