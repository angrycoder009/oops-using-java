package oops.JavaInterfaces;

public class LearnInterfaces {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();  // Call the method on an instance of Monkey
    }
}

interface Animal {
    void eats();  // Interface method
}

class Monkey implements Animal {
    @Override
    public void eats() {  // Non-static method
        System.out.println("Monkey is eating.");
    }
}

