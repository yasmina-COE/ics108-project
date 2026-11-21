public class StudySession {
    public static final String PLANNED = "PLANNED";
    public static final String DONE = "DONE";
    public static final String MISSED = "MISSED";

    private static final int MAX_DURATION_MINUTES = 600;

    private String title;
    private Course course;
    private int durationMinutes;
    // Date format: DD/MM/YYYY
    private String date;
    // Time format: HH:MM AM/PM
    private String time;
    private String status;

    public StudySession(String title, Course course,int durationMinutes, String date, String time, String status) {


        this.title = title;
        this.course = course;
        this.durationMinutes = durationMinutes;
        this.date = date;
        this.time = time;
        this.status = PLANNED;
    }

    public String getTitle() {
        return title;
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public String getCourseCode() {
        return course.getCourseCode();
    }

    public int getDurationMinutes(){
        return durationMinutes;
    }

    public String getDate(){
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }


    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        this.title = title.trim();
    }

    public void setCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null");
        }

        this.course = course;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes <= 0 ||
                durationMinutes > MAX_DURATION_MINUTES) {
            throw new IllegalArgumentException(
                    "Duration must be between 1 and "
                            + MAX_DURATION_MINUTES + " minutes");
        }

        this.durationMinutes = durationMinutes;
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

    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("Status cannot be empty");
        }

        String upperStatus = status.trim().toUpperCase();

        if (!upperStatus.equals(PLANNED)
                && !upperStatus.equals(DONE)
                && !upperStatus.equals(MISSED)) {
            throw new IllegalArgumentException(
                    "Status must be PLANNED, DONE, or MISSED");
        }

        this.status = upperStatus;
    }

    @Override
    public String toString() {
        return "Study Session: " + title + "\n"
                + "Course Name: " + course.getCourseName() + "\n"
                + "Course Code: " + course.getCourseCode() + "\n"
                + "Duration: " + durationMinutes + " minutes\n"
                + "Date: " + date + "\n"
                + "Time: " + time + "\n"
                + "Status: " + status;
    }

}
