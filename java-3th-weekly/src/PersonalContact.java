public class PersonalContact extends Contact{
    String relationship;
    PersonalContact(String name, String phoneNumber, String relationship){
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public void print(){
        System.out.println("이름: " + name + ", 전화번호: " + phoneNumber + ", 관계: " + relationship);
    }
}
