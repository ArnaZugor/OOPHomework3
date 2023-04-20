package Task1;

public class Person {
    private final String name;

    public Person (final String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return name;
    }
}
