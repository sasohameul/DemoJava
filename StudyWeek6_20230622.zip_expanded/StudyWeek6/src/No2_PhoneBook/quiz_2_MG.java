package No2_PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    private int order;
    private String phoneNumber;

    public Person(int order, String phoneNumber) {
        this.order = order;
        this.phoneNumber = phoneNumber;
    }

    public int getOrder() {
        return order;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class quiz_2_MG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> phoneBook = new HashMap<>();
        
        System.out.println("전화번호 저장입니다. 아래와 같이 입력해주세요.");
        System.out.println("====================================");

        // 5명의 사람에 대해 이름과 번호를 입력받고 전화번호부에 저장
        for (int i = 1; i <= 5; i++) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("전화번호: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("------------------------------------");

            Person person = new Person(i, phoneNumber);
            phoneBook.put(name, person);
        }

        // 검색 기능
        while (true) {
            System.out.print("검색할 이름을 입력하세요 (exit 입력 시 종료): ");
            String searchName = scanner.nextLine();

            if (searchName.equals("exit")) {
                break;
            }

            Person person = phoneBook.get(searchName);

            if (person != null) {
                System.out.println("저장된 순서: " + person.getOrder());
                System.out.println("전화번호: " + person.getPhoneNumber());
            } else {
                System.out.println("해당 이름의 번호를 찾을 수 없습니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
