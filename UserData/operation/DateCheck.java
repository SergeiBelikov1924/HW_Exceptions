package UserData.operation;

import UserData.interfaces.DateValidator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateCheck implements DateValidator {
    private String dateFormat;

    public DateCheck(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public boolean isValid(String dateStr) {
        DateFormat sdf = new SimpleDateFormat(this.dateFormat);
        sdf.setLenient(false);
        try {
            if(dateStr.length() != 10) {
                throw new RuntimeException("Неверный формат даты, пожалуйста введите корректно dd.mm.yyyy");
            }
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    @Override
    public String okDate(boolean valid) {
        if (valid) return "Введенная дата корректна";
        else throw new RuntimeException("Неверный формат даты, пожалуйста введите корректно dd.mm.yyyy");
    }



}
