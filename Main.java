public class Main {
    public static void main(String[] args) {

        Course course = new Course(
                "Java Programming",
                "ICS108",
                "Dr. Ahmed",
                3
        );

        try {
            StudySession session = new StudySession(
                    "Review Classes",
                    course,
                    700,
                    "25/11/2026",
                    "10:30 AM",
                    "PLANNED"
            );

            System.out.println(session);



            System.out.println("\nAfter marking as done:");
            System.out.println(session);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Exams exam = new Exams(course, "MAJOR", "30/11/2026", 10,"HIGH");

            System.out.println("\n");
            System.out.println(exam);

            exam.setExamType("FINAL");
            exam.setDate("05/12/2026");
            exam.setTime(14);
            exam.setPriority("MID");

            System.out.println("\nAfter updating exam:");
            System.out.println(exam);

        } catch (IllegalArgumentException e) {
            System.out.println("Exam Error: " + e.getMessage());
        }
        try {
            Deadlines deadline = new Deadlines("Submit Java Project", course, "PLANNED", "28/11/2026", "HIGH");
            System.out.println("\n");
            System.out.println(deadline);

            deadline.setPriority("LOW");
            deadline.setStatus("DONE");

            System.out.println("\nAfter updating deadline:");
            System.out.println(deadline);

        } catch (IllegalArgumentException e) {
            System.out.println("Deadline Error: " + e.getMessage());
        }
    }
}
