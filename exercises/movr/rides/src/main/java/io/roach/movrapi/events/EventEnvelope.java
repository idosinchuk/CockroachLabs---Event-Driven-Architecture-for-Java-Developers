package io.roach.movrapi.events;

import java.util.Map;
import java.util.UUID;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "events")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class EventEnvelope {

  @Id
  @GeneratedValue
  private UUID id;

  @Column(name = "event_type")
  private String eventType;

  @Column(name = "event_data")
  @Type(type = "jsonb")
  private Map<String, Object> eventData;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Map<String, Object> getEventData() {
    return eventData;
  }

  public void setEventData(Map<String, Object> eventData) {
    this.eventData = eventData;
  }
}
