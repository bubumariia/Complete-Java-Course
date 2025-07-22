package OOP.Animal;

public class Dog {

    public String name;
    public int age;
    public String breed;
    public static int counter =0;

    public void barks(){
        System.out.println(name + " barks");
    }

    public void plays(){
        System.out.println(name + " plays");
    }

    public void showAttributes(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);

    }

    public static void dogCreated(){
        counter++;

    }
}
