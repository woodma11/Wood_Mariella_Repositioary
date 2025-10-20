// ===== File: /mnt/data/java_project/JunitAssignment/src/main/java/org/example/Main.java =====
package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a new grade: ");
        int grade = scanner.nextInt();

        String gradeLetter = determineGrade(grade);
        System.out.println("Your grade is: " + gradeLetter);
	}
        public static String determineGrade(int grade) {
            if (grade < 0) {
                throw new IllegalArgumentException("Grade cannot be negative");
            } else if (grade <= 60) {
                return "F";
            } else if (grade < 70) {
                return "D";
            } else if (grade < 80) {
                return "C";
            } else if (grade < 90) {
                return "B";
            } else {
                return "A";
            }
        }
    }



// ===== File: /mnt/data/java_project/JunitAssignment/src/test/java/org/example/determinegradetest.java =====
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class determinegradetest {
    @Test
    void testDetermineGrade() {
        assertEquals("A", Main.determineGrade(99));
    }

    @Test
    void testDetermineGrade2() {
        assertNotEquals("A", Main.determineGrade(89));
    }
}


