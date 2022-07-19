package lecturesHomework.L21.E22;


public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Fish("Rubik","swimming");
        animal[1] = new Dog("Doggy", "running");
        animal[2] = new Duck("Duckky","flying");

        for(Animal animals: animal) {
            System.out.println(animals.toString());
        }

    }
}
