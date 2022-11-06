package io.roach.movrapi.events;

import com.fasterxml.jackson.annotation.JsonProperty;

// {"after": {"event_data": {"ride_id": "1ac7ea6d-c5b1-4cbe-ac18-880583a96b7b", "start_time": null, "user_email": "igor.dfb@hotmail.es", "vehicle_id": "c7092d4f-228d-4570-aa64-576574e7f2ee"}, "event_type": "RideStarted", "id": "cad831ab-81b9-4a87-bdd3-a4b6b53e0dc3", "ts": "2022-11-06T04:20:03.845127"}}
public class KafkaMessage {
    @JsonProperty(value = "after")
    private EventEnvelope eventEnvelope;

    public EventEnvelope getEventEnvelope() {
        return eventEnvelope;
    }

    public void setEventEnvelope(EventEnvelope eventEnvelope) {
        this.eventEnvelope = eventEnvelope;
    }
}
