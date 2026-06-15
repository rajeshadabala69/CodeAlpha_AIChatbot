import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("hello")) {
                System.out.println("Bot: Hi! How can I help you?");
            } else if (input.equals("how are you")) {
                System.out.println("Bot: I'm fine. Thank you!");
            } else if (input.equals("what is java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");
            } else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            } else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}