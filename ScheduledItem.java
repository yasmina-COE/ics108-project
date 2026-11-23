public abstract class  ScheduledItem {
    private String title;
    private String date;
    private String time;

    public ScheduledItem(String title, String date, String time) {

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Date cannot be empty (format: DD/MM/YYYY)");
        }

        if (time == null || time.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Time cannot be empty (format: HH:MM AM/PM)");
        }

        this.title = title.trim();
        this.date = date.trim();
        this.time = time.trim();
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        this.title = title.trim();
    }

    public void setDate(String date) {
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Date cannot be empty (format: DD/MM/YYYY)");
        }

        this.date = date.trim();
    }

    public void setTime(String time) {
        if (time == null || time.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Time cannot be empty (format: HH:MM AM/PM)");
        }

        this.time = time.trim();
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Type: " + getType() + "\n"
                + "Title: " + title + "\n"
                + "Date: " + date + "\n"
                + "Time: " + time;
    }
}
