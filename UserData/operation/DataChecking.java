package UserData.operation;

import UserData.exception.MainExceptions;
import UserData.exception.PhoneExseption;
// import UserData.interfaces.DateValidator;
import UserData.interfaces.StringToArray;

public class DataChecking implements StringToArray{


    public DataChecking() {
    }

    @Override
    public String[] devideStringToArray(String enterString) {
        String[] arrayString;
        arrayString = enterString.split(" ");
        return arrayString;
    }
    
    @Override
    public String getSurname(String[] array) {
        if (array.length == 0 || array[0] == null) throw new RuntimeException("Недопустимое значение");
        return array[0];
    }

    @Override
    public String getName(String[] array) {
        if (array.length == 0 || array[1] == null) throw new RuntimeException("Недопустимое значение");
        return array[1];
    }

    @Override
    public String getOtchestvo(String[] array) {
        if (array.length == 0 || array[2] == null) throw new RuntimeException("Недопустимое значение");
        return array[2];
    }

    @Override
    public String getDate(String[] array) {
        if (array.length == 0 || array[3] == null) throw new RuntimeException("Недопустимое значение");
        return array[3];
    }

    @Override
    public String getPhoneNumber(String[] array) {
        if (array.length == 0 || array[4] == null) throw new RuntimeException("Недопустимое значение");
        return array[4];
    }

    @Override
    public String getSex(String[] array) {
        if (array.length == 0 || array[5] == null) throw new RuntimeException("Недопустимое значение");
        return array[5];
    }

    public void isTheDataEnteredCorrect(String str){
        String[] array = devideStringToArray(str);
        if(array.length != 6){
            throw new MainExceptions();
        }
        else{
            System.out.println("Все данные введены корректно.");
        }
    }

    public void isNumber(String str) {
        if ((str.length() == 6 || str.length() == 11) && isRealNumber(str) ) {
            System.out.println("Номер телефона введен корректно");
        } else {
            throw new PhoneExseption();
        }

    }
    private boolean isRealNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public void isSex(String str){
        if (str.equals("m") || str.equals("M") || str.equals("F") || str.equals("f")){
            System.out.println("Пол введён корректно.");
        }
        else throw new RuntimeException("Пожалуйтста, введите корректно пол 'f' - женский, 'm' - мужской");
    }

}

