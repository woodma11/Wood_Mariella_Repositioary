// ===== File: /mnt/data/java_project_new/JunitAssignment2/src/main/java/org/example/Main.java =====
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        mariBakery bakery = new mariBakery();
        int total = bakery.addSweets(10,10);
        System.out.println("Total sweets: " + total);
    }
    static class mariBakery {
        public int addSweets(int cupcakes, int brownies) {
            return cupcakes + brownies;
        }

        public int subtractSweets(int cupcakes, int brownies) {
            return cupcakes - brownies;
        }

        public boolean equals(int cupcakes, int brownies) {
            return cupcakes == brownies;
        }
    }
}


// ===== File: /mnt/data/java_project_new/JunitAssignment2/src/test/java/org/example/MariBakeryTest.java =====
package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MariBakeryTest {
    Main.mariBakery bakery = new Main.mariBakery();
        @Test
        void testAddSweets() {
            assertEquals(14,bakery.addSweets(6,4));
        }
        @Test
        void testSubtractSweets() {
            assertEquals(30,bakery.subtractSweets(8,4));
        }
        @Test
        void testEqualsSweets() {
            assertFalse(bakery.equals(9,-3));
        }
    }

