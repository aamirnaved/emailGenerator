package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email emObj = new Email("Aamir", "Naved");
        emObj.setAlternateEmail("aamirnaved@gmail.com");
//        System.out.println(emObj.getAlternateEmail());
        System.out.println(emObj.showInfo());
    }
}
