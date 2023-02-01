package interfaces.sayHello;

public abstract class BasePerson implements Person {
    private String name;

    public BasePerson(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }


    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name can not be empty");
        }
        this.name = name;
    }
}
