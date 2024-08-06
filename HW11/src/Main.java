public class Main {
    public static void main(String[] args) {
        Phone Ivan = new Phone("45345345", "sdsdsd", 256 );
        Phone.receiveCall("Ivan", Ivan.phoneNumber);
        System.out.println(Ivan.countryCreate);
    }
}