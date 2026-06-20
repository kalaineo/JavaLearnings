interface Animal{
    public void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class InterfaceEx3 {
    public static void main(String args[]) {
        // Upcasting: Parent reference pointing to a Dog object
        Animal ani = new Dog();
        ani.makeSound();

        // Same parent reference now pointing to a Cat object
        // this is called RUNTIME POLYMORPHISM
        ani = new Cat();
        ani.makeSound();
    }
}