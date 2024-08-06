public class Phone {
    static String countryCreate = "China";
    String phoneNumber;
    String phoneModel;
    double phoneWeight;


    public Phone(String phoneNumber, String phoneModel, double phoneWeight) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }

    public Phone() {
    }

    public static void receiveCall(String name){
        receiveCall(name, "");
    }

    public static void receiveCall(String name, String phoneNumber){
        System.out.println("Звонит абонент по имени " + name + (phoneNumber.equals("") ? "" : " номер: " + phoneNumber));
    }
}
