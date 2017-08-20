package exercises.objectoriented;

public class MethodOverridingSuper {

    class BiCycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    class MotorCycle extends BiCycle {
        String define_me() {
            return "a cycle with an engine.";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());

            String temp = super.define_me();
            System.out.println("My ancestor is a cycle who is " + temp);
        }

    }

    public void solve() {
        // Given Code
        MotorCycle M = new MotorCycle();
    }
}
