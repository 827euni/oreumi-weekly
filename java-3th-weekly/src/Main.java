import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int menu = 0;
        while (menu != 5) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");
            menu = sc.nextInt();
            sc.nextLine(); //엔터 하나 제거
            switch (menu) {
                case 1: //비즈니스 연락처 추가
                    System.out.print("이름을 입력하세요: ");
                    String name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String phoneNum = sc.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    String companyName = sc.nextLine();
                    AddressBook.addBusiness(name, phoneNum, companyName);
                    break;
                case 2: //개인 연락처 추가
                    System.out.print("이름을 입력하세요: ");
                    name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    phoneNum = sc.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String relationName = sc.nextLine();
                    AddressBook.addPersonal(name, phoneNum, relationName);
                    break;

                case 3: //연락처 출력
                    AddressBook.displayContacts();
                    break;

                case 4: //연락처 검색
                    System.out.print("검색할 이름을 입력하세요: ");
                    name = sc.nextLine();
                    AddressBook.searchContact(name);
                    break;

                case 5: //종료
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("다시 선택해주세요.");
                    break;
            }
        }
    }
}