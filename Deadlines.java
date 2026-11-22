public class Deadlines {

private String title;
private String dueDate;
private String priority;
private String status;
private Course course;

public Deadlines(String title, Course course, String status, String dueDate, String priority) {
this.title=title;
this.course=course;
this.status=status;
this.dueDate=dueDate;
this.priority=priority;
}
public String getTitle() {
    return title;
}
public Course getCourse() {
    return course;
}
public String getStatus() {
    return status;
}
public String getDueDate() {
    return dueDate;
}
public String getPriority() {
    return priority;
}

    public void setTitle(String title) {
    if(title==null||title.trim().isEmpty()) {
        throw new IllegalArgumentException("Title can't be empty");
    }
        this.title = title.trim();
    }
    public void setCourse(Course course) {
    if(course==null) {
        throw new IllegalArgumentException("Course can't be empty");
    }
        this.course = course;
    }
    public void setStatus(String status) {
    if (status == null || status.trim().isEmpty()) {
        throw new IllegalArgumentException("Status cannot be empty");
    }

    String upperStatus = status.trim().toUpperCase();

    if (!upperStatus.equals("PLANNED")&&!upperStatus.equals("DONE")&&!upperStatus.equals("MISSED")) {
        throw new IllegalArgumentException("Status must be PLANNED, DONE, or MISSED");
    }
    this.status = upperStatus;
    }
    public void setDueDate(String dueDate) {
    if (dueDate == null || dueDate.trim().isEmpty()) {
        throw new IllegalArgumentException("Due date can't be empty (format: DD/MM/YYYY)");
        }
        this.dueDate = dueDate;
    }
    public void setPriority(String priority) {
        if(priority==null || priority.trim().isEmpty()) {
            throw new IllegalArgumentException("Priority can't be empty") ;
        }
        String Priority= priority.trim().toUpperCase();
        if(!Priority.equals("HIGH")&&!Priority.equals("MID")&&!Priority.equals("LOW")) {
            throw new IllegalArgumentException("Priority must be: HIGH, MID, or LOW");
        }
        this.priority=Priority;
    }
    public boolean isDone() {
        return status.equals("DONE");
    }
    @Override
    public String toString() {
        if (isDone()) {
            return "Deadline: " + title + "\n" + "Course: " + course + "\n" + "Status: " + status;
        }
            return "Deadline: " + title + "\n" + "Course: " + course + "\n" + "Status: " + status + "\n" + "Due Date: " + dueDate + "\n" + "Priority: " + priority;
    }
}
