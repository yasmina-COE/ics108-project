public class Exams {

    private String date; // DD/MM/YYYY
    private int time; //24 format
    private Course course;
    private String examType;
    private String priority;

    public Exams(Course course, String examType, String date, int time, String priority) {
        this.course = course;
        this.examType = examType;
        this.date = date;
        this.time = time;
        this.priority = priority;
    }

    public Course getCourseName() {
        return course;
    }
    public String getExamType() {
        return examType;
    }
    public String getDate() {
        return date;
    }
    public int getTime() {
        return time;
    }
    public String getPriority() {
        return priority;
    }


    public void setCourseName(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course can't be empty");
        }
        this.course = course;
    }

    public void setExamType(String examType) {
        if (examType == null || examType.trim().isEmpty()) {
            throw new IllegalArgumentException("Exam type cannot be empty");
        }
        String ExamType = examType.trim().toUpperCase();

        if (!ExamType.equals("MAJOR") && !ExamType.equals("FINAL") && !ExamType.equals("QUIZ") && !ExamType.equals("MIDTERM")) {
            throw new IllegalArgumentException("Exam types must be: FINAL, MIDTERM, MAJOR, or QUIZ");
        }
        this.examType = ExamType;
    }

    public void setDate(String date) {
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException("Date can't be empty (format: DD/MM/YYYY)");
        }
        this.date = date.trim();
    }

    public void setTime(int time) {
        if (time > 24 || time < -1) {
            throw new IllegalArgumentException("Time can't be out of 24 hour range");
        }
        this.time = time;
    }

    public void setPriority(String priority) {
        if (priority == null || priority.trim().isEmpty()) {
            throw new IllegalArgumentException("Priority can't be empty");
        }
        String Priority = priority.trim().toUpperCase();
        if (!Priority.equals("HIGH") && !Priority.equals("MID") && !Priority.equals("LOW")) {
            throw new IllegalArgumentException("Priority must be: HIGH, MID, or LOW");
        }
        this.priority = Priority;
    }
    @Override
    public String toString() {
        return "Exam: " + course + "\n" + "Exam Type: " + examType + "\n" + "Date: " + date + "\n" + "Time: " + time + "\n" + "Priority: " + priority;
    }
}