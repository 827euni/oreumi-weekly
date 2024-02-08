public class AddressBook extends Contact{
    String company;
    AddressBook(String name, String phoneNumber, String company){
        super(name, phoneNumber);
        this.company = company;
    }
}
