import java.util.ArrayList;
public abstract class Event extends ScheduledItem {
    public static final String UPCOMING = "UPCOMING";
    public static final String DONE = "DONE";
    public static final String CANCELLED = "CANCELLED";


    private String location;
    private String description;
    private String status;

    public Event(String title, String date, String time,
                 String location, String description) {
        super(title, date, time);
        this.location = location;
        this.description = description;
        this.status = UPCOMING;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }


    public void setLocation(String location) {
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty");
        }

        this.location = location.trim();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("Status cannot be empty");
        }

        String upperStatus = status.trim().toUpperCase();

        if (!upperStatus.equals(UPCOMING)
                && !upperStatus.equals(DONE)
                && !upperStatus.equals(CANCELLED)) {

            throw new IllegalArgumentException(
                    "Status must be UPCOMING, DONE, or CANCELLED");
        }

        this.status = upperStatus;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return super.toString()
                + "\nLocation: " + location
                + "\nDescription: " + description
                + "\nStatus: " + status;
    }

}
