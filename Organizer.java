import java.util.ArrayList;
public class Organizer {
    private final ArrayList<ScheduledItem> items;

    public Organizer() {
        items = new ArrayList<>();
    }

    public void addItem(ScheduledItem item) {
        if (item == null) {
            throw new IllegalArgumentException(
                    "Item cannot be null");
        }

        items.add(item);
    }

    public boolean removeItem(ScheduledItem item) {
        if (item == null) {
            throw new IllegalArgumentException(
                    "Item cannot be null");
        }

        boolean removed = items.remove(item);

        if (!removed) {
            throw new IllegalArgumentException(
                    "Item was not found");
        }

        return true;
    }

    public ArrayList<ScheduledItem> getItemsForDate(String date) {
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Date cannot be empty");
        }

        date = date.trim();

        ArrayList<ScheduledItem> result =
                new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getDate().equals(date)) {
                result.add(items.get(i));
            }
        }

        return result;
    }

    public ArrayList<ScheduledItem> getAllItems() {
        return new ArrayList<>(items);
    }

}
