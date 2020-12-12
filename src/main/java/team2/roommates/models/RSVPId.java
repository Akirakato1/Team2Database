package team2.roommates.models;

import java.io.Serializable;

public class RSVPId implements Serializable {
    private int eventId;
    private int apartmentId;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RSVPId))
            return false;
        RSVPId id = (RSVPId) o;
        return id.eventId == this.eventId && id.apartmentId == this.apartmentId;
    }
}
