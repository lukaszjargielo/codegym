package pl.codegym.task.task13.task1327;

public class Person implements TurnipItem {
    private String name;

    public Person(String name) {

        this.name = name;
    }



    public void pull(Person second) {

        System.out.println(String.format("%s behind %s", name, second.getPrivateName()));
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getPrivateName() {

        return name;
    }

    public void setPrivateName(String name) {

        this.name = name;
    }
}

