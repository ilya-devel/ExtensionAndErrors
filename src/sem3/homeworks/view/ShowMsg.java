package sem3.homeworks.view;

public class ShowMsg {
    public static void ShowMainMsg() {
        System.out.println("\nВведите ФИО, ДР, телефонный номер и пол сотрудника");
        System.out.println("Все элементы разделены пробелами, день рождения вводится в формате ДД.ММ.ГГГГ");
        System.out.println("Телефонный номер содержит только числа, пол указываются латинские буквы: m (муж), f (жен)");
        System.out.println("Данные должны соблюдать следующий формат:");
        System.out.println("\tФамилия Имя Отчество дата_рождения телефонный_номер пол");
        System.out.println("P.S.: Для выхода введите exit\n");
    }

    public static void ShowErr(String msg) {
        System.out.println(msg);
    }
}
