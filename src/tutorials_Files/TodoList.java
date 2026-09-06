import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        TodoList obj = new TodoList();
        System.out.print(
            "Enter number to following action :) \n 1)fetch a task \n 2)delete a task \n 3)create a task \n 4)exit"
        );
        Scanner input = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner task = new Scanner(System.in);
        int taskNum = input.nextInt();
        boolean isTrue = true;

        while (isTrue) {
            if (taskNum == 1) {
                obj.fetchTask(num.nextInt());
            } else if (taskNum == 2) {
                obj.deleteTask(num.nextInt());
            } else if (taskNum == 3) {
                obj.createTask(task.nextLine());
            } else if (taskNum == 4) {
                isTrue = false;
            } else {
                System.out.print("you got a error");
            }
        }
    }

    void fetchTask(int num) {
        list.get(num);
    }

    void deleteTask(int num) {
        list.remove(num);

        System.out.println("task is deleted");
    }

    void createTask(String task) {
        list.add(task);

        System.out.println("task is created");
    }
}
