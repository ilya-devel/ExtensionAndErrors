package sem3.homeworks.controlApp;

import sem3.homeworks.appClass.Person;
import sem3.homeworks.view.GetString;
import sem3.homeworks.view.ShowMsg;

public class RunApplication {

    public static void RunApp() {
        while (true) {
            ShowMsg.ShowMainMsg();
            String data = GetString.GetRowAboutPerson();
            Person tmp = null;
            if (data.equals("exit")) {
                break;
            } else {
                try {
                    tmp = new Person(data);
                } catch (Exception e) {
                    ShowMsg.ShowErr(e.getMessage());
                }
            }
            if (tmp != null) {
                try {
                    WriteToFile.RecData(tmp);
                } catch (Exception e) {
                    ShowMsg.ShowErr(e.getMessage());
                }
            }
        }
        System.out.println("Пока-пока");
    }
}

