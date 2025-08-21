import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String command;

        System.out.println("Welcome to To-Do List Manager!");
        while (true) {
            System.out.println("\nEnter command: add, remove, view, exit");
            command = sc.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;

                case "remove":
                    System.out.print("Enter task number to remove: ");
                    int index = Integer.parseInt(sc.nextLine());
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case "view":
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Exiting To-Do List Manager. Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}