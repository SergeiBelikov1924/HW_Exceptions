package UserData.exception;

public class PhoneExseption extends RuntimeException{
    public PhoneExseption() {
        super("Введен неправильный номер телефона. Пожалуйста, введите номер в формате 6 или 11 цифр.");
    }

    public PhoneExseption(String message) {
        super(message);
    }
}