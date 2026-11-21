public class Course {
    private static final int MIN_CREDIT_HOURS = 1;
    private static final int MAX_CREDIT_HOURS = 6;

    private String courseName;
    private String courseCode;
    private String instructor;
    private int creditHours;

    public Course(String courseName, String courseCode,
                  String instructor, int creditHours) {
        this.courseName = courseName.trim();
        this.courseCode = courseCode.trim().toUpperCase();
        this.instructor = instructor.trim();
        this.creditHours = creditHours;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCreditHours() {
        return creditHours;
    }
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Course name cannot be empty");
        }

        this.courseName = courseName.trim();
    }
    public void setCourseCode(String courseCode) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Course code cannot be empty");
        }

        this.courseCode = courseCode.trim().toUpperCase();
    }
    public void setInstructor(String instructor) {
        if (instructor == null || instructor.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Instructor cannot be empty");
        }

        this.instructor = instructor.trim();
    }
    public final void setCreditHours(int creditHours) {
        if (creditHours < MIN_CREDIT_HOURS ||
                creditHours > MAX_CREDIT_HOURS) {

            throw new IllegalArgumentException(
                    "Credit hours must be between "
                            + MIN_CREDIT_HOURS + " and "
                            + MAX_CREDIT_HOURS);
        }


        this.creditHours = creditHours;
    }
    @Override
    public String toString() {
        return "Course Name: " + courseName + "\n"
                + "Course Code: " + courseCode + "\n"
                + "Instructor: " + instructor + "\n"
                + "Credit Hours: " + creditHours;
    }

}
