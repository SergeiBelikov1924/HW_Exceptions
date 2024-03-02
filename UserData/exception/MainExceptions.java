package UserData.exception;

public class MainExceptions extends ArrayIndexOutOfBoundsException{
    public MainExceptions() {
        super("Указаны не все значения.");
    }

    public MainExceptions(String s) {
        super("Указаны не все значения.");
    }

    public MainExceptions(int index) {
        super("Указаны не все значения." + index);
    }
}