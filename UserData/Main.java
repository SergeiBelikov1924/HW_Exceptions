package UserData;

import UserData.interfaces.DateValidator;
import UserData.operation.DateCheck;
import UserData.operation.DataChecking;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        String s = "Pupkin Piter Pen 07.03.1975 89083265726 m";
        System.out.println("Введите данные для записи в формате:" +
                " <Фамилия> <Имя> <Отчество> <дата_рождения(dd.mm.yyyy)> <номер_телефона(6 или 11 цифр)>" +
                " <пол(f-женский или m-мужской)>\nДанные вводить через пробел.");
        String s = sc.nextLine();

        DataChecking testString = new DataChecking();
        DateValidator validator = new DateCheck("dd.mm.yyyy");
        testString.isTheDataEnteredCorrect(s);
        String[] arrayTestString = testString.devideStringToArray(s);
        System.out.println(testString.getName(arrayTestString));
        System.out.println(validator.okDate(validator.isValid(testString.getDate(arrayTestString))));
        testString.isNumber(testString.getPhoneNumber(arrayTestString));
        testString.isSex(testString.getSex(arrayTestString));
        FileWriter fileWriter = new FileWriter(testString.getSurname(arrayTestString), true);
        fileWriter.write(s + "\n");
        fileWriter.close();
        sc.close();

    }

}