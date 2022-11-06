package io.roach.movrapi.events;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

  private final EventRepository eventRepository;

  private final ObjectMapper objectMapper;

  @Autowired
  public EventPublisher(EventRepository eventRepository, ObjectMapper objectMapper) {
    this.eventRepository = eventRepository;
    this.objectMapper = objectMapper;
  }

  public void publish(String eventType, Event event) {
    Map<String, Object> data = objectMapper.convertValue(event, Map.class);

    EventEnvelope eventEnvelope = new EventEnvelope();
    eventEnvelope.setEventType(eventType);
    eventEnvelope.setEventData(data);

    eventRepository.save(eventEnvelope);
  }
}
