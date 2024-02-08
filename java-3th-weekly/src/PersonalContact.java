public class PersonalContact extends Contact{
    String relationship;
    PersonalContact(String name, String phoneNumber, String relationship){
        super(name, phoneNumber);
        this.relationship = relationship;
    }
}
