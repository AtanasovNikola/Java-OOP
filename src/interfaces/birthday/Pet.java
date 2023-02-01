package interfaces.birthday;

public class Pet implements Birthable {
    private String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String getBirthDate() {
        return birthday;
    }
}
