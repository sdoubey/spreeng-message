package com.spreeng.message.organization.notification;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spreeng.message.organization.OrganizationAddress;
import com.spreeng.message.organization.OrganizationStatus;
import com.spreeng.message.organization.OrganizationStyle;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
public class OrganizationUpdatedNotification extends OrganizationNotification {

  public static final String SUBJECT = "ORGANIZATION_UPDATED_NOTIFICATION";

  public static OrganizationUpdatedNotificationBuilder<?, ?> builder(
      @NonNull UUID id,
      @NonNull Long updateDateTime,
      @NonNull Long creationDateTime,
      @NonNull String name,
      @NonNull OrganizationStatus status,
      Float fees,
      @NonNull OrganizationStyle style,
      @NonNull OrganizationAddress address) {
    return new OrganizationUpdatedNotificationBuilderImpl()
        .id(id)
        .creationDateTime(creationDateTime)
        .updateDateTime(updateDateTime)
        .name(name)
        .status(status)
        .fees(fees)
        .style(style)
        .address(address);
  }

  protected OrganizationUpdatedNotification() {
    super();
  }

  @Override
  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
