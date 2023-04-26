package sem3.homeworks.view;

import java.util.Scanner;

public class GetString {
    public static String GetRowAboutPerson() {
        Scanner in = new Scanner(System.in);
        System.out.print("--> ");
        return in.nextLine();
    }
}
