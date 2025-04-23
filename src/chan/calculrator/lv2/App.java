package chan.calculrator.lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long indexOne; // 첫 번째 정수를 담을 변수
        long indexTwo; // 두 번째 정수를 담을 변수
        char operator; // 사칙연산 기호를 담을 변수
        String userText; //종료 및 삭제를 위한 문자열을 입력받을 변수

        // Calculrator 클래스를 이용할 수 있게 인스턴스화
        Calculrator calculrator = new Calculrator();

        // 게터를 이용해 컬렉션에 접근
        ArrayList<Long> calcResult = calculrator.getResult();

        // 반복문
        while (true) {

           // 첫 번째 양의 정수 입력
            System.out.print("첫 번째 정수를 입력하세요: ");
            indexOne = scanner.nextLong();
            if (indexOne < 0) {
                System.out.println("양의 정수만 입력할 수 있습니다.");
                continue;
            }

            // 두 번째 양의 정수 입력
            System.out.print("두 번째 정수를 입력하세요: ");
            indexTwo = scanner.nextLong();
            if (indexTwo < 0) {
                System.out.println("양의 정수만 입력할 수 있습니다.");
                continue;
            }

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            operator = scanner.next().charAt(0);
            scanner.nextLine();
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("사칙연산의 기호가 아닙니다.");
                continue;
            } else if (operator == '/' && indexTwo == 0) {
                System.out.println("나눗셈 연산 시 두 번째 정수에 0을 입력할 수 없습니다.");
                continue;
            }

            // calculate 메서드를 불러오며, 매개변수로 입력받은 값 할당
            calculrator.calculate(indexOne, indexTwo, operator);

            // 연산이 끝나고 컬렉션에 저장한 값을 호출
            calculrator.setResult();

            // .get(.size() -1 을 이용해 방금 계산한 결과를 출력
            System.out.println("계산 결과: " + indexOne + " " + operator + " " + indexTwo + " = " + calcResult.get(calcResult.size() -1) );

            // 현재 컬렉션에 저장된 값을 모두 출력
            System.out.println(calcResult);

            // exit 입력 시 프로그램을 종료하고, remove 입력 시 제일 처음 저장된 값을 삭제.
            System.out.print("더 계산하시겠습니까? (exit입력 시 종료, remove입력 시 오래된 결과 삭제): ");
            userText = scanner.nextLine();
            if (userText.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (userText.equals("remove")) {
                calculrator.removeResult();
                System.out.println("가장 오래된 결과를 삭제했습니다.");
                System.out.println(calcResult);
                continue;
            }
        }
    }
}

//lv2