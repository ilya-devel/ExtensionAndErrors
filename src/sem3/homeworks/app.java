package sem3.homeworks;


import sem3.homeworks.controlApp.RunApplication;
import sem3.homeworks.view.ShowMsg;

public class app {
    public static void main(String[] args) throws Exception {
        try {
            RunApplication.RunApp();
        } catch (Exception e) {
            ShowMsg.ShowErr(e.getMessage());
        }
    }
}
