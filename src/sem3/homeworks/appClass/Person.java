package sem3.homeworks.appClass;

import sem3.homeworks.appExceptions.InvalidDateException;
import sem3.homeworks.appExceptions.InvalidGenderException;
import sem3.homeworks.appExceptions.NotDigitInPhoneException;
import sem3.homeworks.appExceptions.SizeArrayException;

import java.text.SimpleDateFormat;


public class Person implements AutoCloseable {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public Person(String str) throws Exception {
        this.ParseString(str);

    }

    private void ParseString(String str) throws Exception {
        String[] data = str.strip().split(" ");
        if (data.length != 6) {
            throw new SizeArrayException();
        }
        this.surname = data[0];
        this.name = data[1];
        this.patronymic = data[2];
        if (CheckCalendar(data[3])) {
            this.birthday = data[3];
        } else {
            throw new InvalidDateException();
        }
        if (!CheckPhone(data[4])) {
            throw new NotDigitInPhoneException();
        } else {
            this.phoneNumber = data[4];
        }
        if (!CheckGender(data[5])) {
            throw new InvalidGenderException();
        } else {
            this.gender = data[5];
        }
    }

    private boolean CheckCalendar(String dateStr) {
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        date.setLenient(false);
        try {
            date.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean CheckPhone(String phone) {
        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private boolean CheckGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        return surname + ';' + name + ';' + patronymic + ';' + birthday + ';' + phoneNumber + ";" + gender + '\n';
    }

    @Override
    public void close() {
        this.surname = null;
        this.name = null;
        this.patronymic = null;
        this.birthday = null;
        this.phoneNumber = null;
        this.gender = null;
    }
}
