package exercises.objectoriented;

public class InheritancePartOne {

    class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }

    public void solve() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

}
