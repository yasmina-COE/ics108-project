public class PersonalEvent extends Event {
    public static final String HEALTH = "HEALTH";
    public static final String FAMILY = "FAMILY";
    public static final String ERRAND = "ERRAND";
    public static final String HOBBY = "HOBBY";

    private String category;

    public PersonalEvent(String title, String date, String time,
                         String location, String description,
                         String category) {
        super(title, date, time, location, description);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Category cannot be empty");
        }

        String upperCategory = category.trim().toUpperCase();

        if (!upperCategory.equals(HEALTH)
                && !upperCategory.equals(FAMILY)
                && !upperCategory.equals(ERRAND)
                && !upperCategory.equals(HOBBY)) {
            throw new IllegalArgumentException(
                    "Category must be HEALTH, FAMILY, ERRAND, or HOBBY");
        }

        this.category = upperCategory;
    }

    @Override
    public String getType() {
        return "PERSONAL EVENT";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCategory: " + category;
    }

}
