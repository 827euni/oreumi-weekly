public class BusinessContact extends Contact{
    String company;
    BusinessContact(String name, String phoneNumber, String company){
        super(name, phoneNumber);
        this.company = company;
    }

    public void print(){
        System.out.println("이름: " + name + ", 전화번호: " + phoneNumber + ", 회사명: " + company);
    }
}

