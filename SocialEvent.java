import java.util.ArrayList;
public class SocialEvent extends Event {
    private ArrayList<String> people;

    public SocialEvent(String title, String date, String time, String location, String description) {

        super(title, date, time, location, description);
        people = new ArrayList<>();
    }
    public ArrayList<String> getPeople() {
        return people;
    }

    public void addPerson(String person) {
        if (person == null || person.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Person name cannot be empty");
        }

        String cleanPerson = person.trim();

        if (people.contains(cleanPerson)) {
            throw new IllegalArgumentException(
                    "This person is already added");
        }

        people.add(cleanPerson);
    }

    public void removePerson(String person) {
        if (!people.contains(person)) {
            throw new IllegalArgumentException(
                    "This person is not in the event");
        }

        people.remove(person);
    }

    public int getNumberOfPeople() {
        return people.size();
    }

    @Override
    public String getType() {
        return "SOCIAL EVENT";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPeople: " + people
                + "\nNumber of People: " + getNumberOfPeople();
    }
}


