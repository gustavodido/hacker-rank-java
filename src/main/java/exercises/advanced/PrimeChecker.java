package exercises.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;
import static java.lang.System.out;

public class PrimeChecker {

     private class Prime {

        void checkPrime(int... values) {
            for (int value : values) {
                if (isPrime(value)) {
                    out.format("%s ", value);
                }
            }
            out.println();
        }

        private boolean isPrime(int value) {
            if (value == 1) return false;
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public void solve() {
        // Given code

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());

            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);

            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            out.println(e);
        }

    }
}
