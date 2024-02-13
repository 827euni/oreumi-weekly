import java.util.ArrayList;

public class AddressBook{
    static ArrayList<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }
    public static void addBusiness(String name, String phoneNumber, String company){
        contacts.add(new BusinessContact(name, phoneNumber, company));
    }

    public static void addPersonal(String name, String phoneNumber, String relationship){
        contacts.add(new PersonalContact(name, phoneNumber, relationship));
    }

    public static void displayContacts(){
        if (contacts.isEmpty()){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
        else{
            for (Contact c : contacts){
                c.print();
            }
        }
    }

    public static void searchContact(String name){

        for (Contact c : contacts){
            if (c.getName().equals(name)) {
                c.print();
            }

            else{
                System.out.println("연락처를 찾을 수 없습니다.");
            }
        }
    }
}
