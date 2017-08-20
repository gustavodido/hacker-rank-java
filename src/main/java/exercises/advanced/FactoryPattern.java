package exercises.advanced;

import java.util.Scanner;

import static java.lang.System.out;

public class FactoryPattern {

    interface Food {
        public String getType();
    }

    class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    private class FoodFactory {
        public Food getFood(String s) {
            if (s.equals("cake")) {
                return new Cake();
            }

            return new Pizza();
        }
    }

    public void solve() {
        // Given code
        Scanner sc = new Scanner(System.in);

        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(sc.nextLine());

        out.println("The factory returned " + food.getClass());
        out.println(food.getType());
    }
}
