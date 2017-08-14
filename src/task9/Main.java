package task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Main {

    private static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbe userow ktorych chcesz wpisac: ");
        int n = Integer.parseInt(scanner.nextLine());


        String username;
        String password;
        String name;
        String surname;

        for(int i = 0; i <= n; i++) {
            System.out.print("Wpisz username: ");
            username = scanner.nextLine();

            System.out.println();

            System.out.print("Wpisz password: ");
            password = scanner.nextLine();

            System.out.println();

            System.out.print("Wpisz name: ");
            name = scanner.nextLine();

            System.out.println();

            System.out.print("Wpisz surname: ");
            surname = scanner.nextLine();

            userList.add(new User(username, password, surname, name));        }

        System.out.println("Lista userów: ");
        getAllUser();
    }

    private static void getAllUser(){
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
