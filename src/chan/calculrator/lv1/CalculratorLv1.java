package chan.calculrator.lv1;

import java.util.Scanner;

public class CalculratorLv1 {

    public static void main(String[] args) {

        // 스캐너 기능을 활용할 수 있는 변수 생성.
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 정수를 입력받는 코드
        System.out.print("첫 번째 정수를 입력하세요: ");
        int indexOne = scanner.nextInt();

        // 두 번째 정수를 입력받는 코드
        System.out.print("두 번째 정수를 입력하세요: ");
        int indexTwo = scanner.nextInt();
        scanner.nextLine();

        // 사칙연산 기호를 입력받는 코드
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operationSign = scanner.nextLine();
        System.out.println("계산 내용: " + indexOne + " " + operationSign + " " + indexTwo);

    }
}
