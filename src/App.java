import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        greet(scanner);
        String rememberName = remindName(scanner);
        int age = guessAge(scanner);
        countTillNumber(scanner);
        displayProgrammingQuestion(scanner);
        tellAStory(scanner, rememberName, age);
    }

    public static void greet(Scanner scanner) {
        System.out.println("Hello! My name is Feven ");
        System.out.println("Can i get you name please ?");
    }

    public static String remindName(Scanner scanner) {
        System.out.println("Can you confirm your name please ?");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        return name;
    }

    public static int guessAge(Scanner scanner) {
        System.out.println("Let me guess your age.");
        System.out.println("Multiply the first number of your age by 5");
        int rem3 = Integer.parseInt(scanner.nextLine());
        int age = (rem3 + 3) * 2;
        System.out.println("Enter the second number of your age");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        age = age + secondNumber;
        age = age - 6;
        System.out.println("Your age is " + age );
        return age;
    }

    public static void countTillNumber(Scanner scanner) {
        System.out.println("Till which number would you like me to count?");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Counting...");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void displayProgrammingQuestion(Scanner scanner) {
        int answer;
        System.out.println(
                "How will you describe Java? (Choose from 1 to 4)");
        System.out.println("1. Both Programming Language and Platform");
        System.out.println("2. Platform");
        System.out.println("3. abstract Machine");
        System.out.println("4. Programming Language");
        do {
            answer = Integer.parseInt(scanner.nextLine());
            if (answer != 1) {
                System.out.println("Please try again!");
            }
        } while (answer != 1); 
            System.out.println("Correct Answer");
        
    }

    public static void tellAStory(Scanner scanner, String name, int age) {
        System.out.println("Hey there " + name + "! I see that you are " + age + " years old!");
        System.out.println("You must really know a lot about Java becuase you answered the question");
        System.out.println("that I asked correctly!");
    }
}