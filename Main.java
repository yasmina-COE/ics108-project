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
    }
}
