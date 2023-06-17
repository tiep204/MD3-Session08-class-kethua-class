import ra.Animal;
import ra.Cat;
import ra.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("con vat");
        Dog dog = new Dog("con cho1","mau nau");
        Dog dog1 = new Dog("con cho xau xi","mau den");
        Cat cat = new Cat("con meo");
        Cat cat1 = new Cat("con meo den thui");
        System.out.println(animal.getName());
        animal.setName("tiep");
        System.out.println(animal.getName());
        System.out.println("day la con cho:----------> "+dog.getName()+  "\nDay la mau cua con cho:-------- "+dog.getColor() +"\n tieng keu cua cho:--------->"+dog.makeSound());
        System.out.println("day la con cho1:--------->"+dog1.getName()+ "\nday la mau con cho1: -----------"+dog1.getColor()+"\n tieng keu cua cho:--------->"+dog1.makeSound());
        System.out.println("day la con meo:----------> "+cat.getName()+"\n tieng keu cua meo:--------->"+cat.makeSound());
        System.out.println("day la con meo1:--------->"+cat1.getName()+"\n tieng keu cua meo:--------->"+cat1.makeSound());
    }
}