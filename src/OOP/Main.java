package OOP;

public class Main {
    public static void main(String[] args){
        Dog rex = new Dog();
        Dog.dogCreated();
        rex.name = "Rex";
        rex.age = 4;
        rex.breed = "German shepherd";

        Dog ben = new Dog();
        Dog.dogCreated();
        ben.name = "Ben";
        ben.age = 5;
        ben.breed = "Pug";

        rex.showAttributes();
        ben.showAttributes();

        rex.barks();
        rex.plays();
        ben.barks();
        ben.plays();

        System.out.println(Dog.counter);
    }
}
