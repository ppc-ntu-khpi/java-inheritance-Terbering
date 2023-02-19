package domain;

public class Dog extends Hunter {

    private String kind;

    public Dog(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Dog() {
        this("Charlie",4,"just a dog");
    }

    public Dog(String name) {
        this(name,4,"just a dog");
    }
        public void sleep() {
        System.out.println("Dog very sleepy...");
    }

   public void curse() {
        System.out.println("They demand food or get angry...");
    }

  
    public void play() {
        System.out.println("Dog is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Dog hunting for a enemies...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Dog!";
    }

    @Override
    public void speak() {
        System.out.println("Woof woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat...");
    }
    
    
}
