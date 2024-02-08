import java.util.ArrayList;

public class AddressBook{
    ArrayList<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }
    public void addBusiness(String name, String phoneNumber, String company){

    }
    public void displayContacts(){
        if (contacts.isEmpty()){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
        else{
            for (Contact c : contacts){
                c.print();
            }
        }
    }

    public void searchContact(String name){

    }
}
