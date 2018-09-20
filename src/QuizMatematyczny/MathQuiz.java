package QuizMatematyczny;

import java.util.Scanner;


public class MathQuiz {
    static boolean answer1;
    static boolean answer2;
    static boolean answer3;
    static int licznik;

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MathQuiz quiz = new MathQuiz();
        answer1 = quiz.question1();
        answer2 = quiz.question2();
        answer3 = quiz.question3();
        System.out.println("Twoje odpowiedzi: \nODP1: " + answer1  + "\nODP2: " + answer2  + "\nODP3: " + answer3  + "\n" );
        System.out.println("Ilość poprawnych odpowiedzi " + licznik + "/3" );
    }


    boolean question1() {
        System.out.println("Podaj wynik mnożenia 3 i 5.");
        double odp = this.scan.nextDouble();

        if (odp == 15) {
            this.licznik++;
            return true;
        } else {
            return false;
        }
    }


    boolean question2() {
        System.out.println("Jakie jest pole kwadratu o boku 12?");
        double odp = this.scan.nextDouble();
        if (odp == 144) {
            this.licznik++;
            return true;
        } else {
            return false;
        }
    }


    boolean question3() {
        System.out.println("Podaj pierwiastek kwadratowy liczby 15129.");
        double odp = this.scan.nextDouble();
        if (odp == 123) {
            this.licznik++;
            return true;
        } else {
            return false;
        }
    }


}
