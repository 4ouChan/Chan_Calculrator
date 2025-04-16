package chan.calculrator.lv1;

import java.util.Scanner;

public class CalculratorLv1 {

    public static void main(String[] args) {

        // 스캐너 기능을 활용할 수 있는 변수 생성.
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 정수를 입력받는 코드
        System.out.print("첫 번째 정수를 입력하세요: ");
        long indexOne = scanner.nextLong();

        // 두 번째 정수를 입력받는 코드
        System.out.print("두 번째 정수를 입력하세요: ");
        long indexTwo = scanner.nextLong();
        scanner.nextLine();


        // 사칙연산 기호를 입력받는 코드
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operationSign = scanner.nextLine();




        // 입력받은 문자열이 사칙연산의 기호가 맞는지 구분하는 조건문 사칙연산의 기호가 아닐시 메시지를 출력해 예외처리
        if (operationSign.equals("+")) {
            long indexSum = indexOne + indexTwo;
            System.out.println("계산 결과: " + indexOne + " " +  operationSign + " " + indexTwo + " = " + indexSum);
        } else if (operationSign.equals("-")) {
            long indexSub = indexOne - indexTwo;
            System.out.println("계산 결과: " + indexOne + " " +  operationSign + " " + indexTwo + " = " + indexSub);
        } else if (operationSign.equals("*")) {
            long indexMul = indexOne * indexTwo;
            System.out.println("계산 결과: " + indexOne + " " + operationSign + " " + indexTwo + " = " + indexMul);
        } else if (operationSign.equals("/")) {
            if (indexTwo == 0) {
                System.out.println("나눗셈 연산 시, 두 번째 정수에 0을 입력할 수 없습니다.");
            } else {
                double indexDiv = (double) indexOne / (double) indexTwo;
                System.out.println("계산 결과: " + indexOne + " " + operationSign + " " + indexTwo + " = " + indexDiv);
            }
        } else {
            System.out.println("사칙연산의 기호가 아닙니다.");
        }

    }
}
