package chan.calculrator.lv1;

import java.util.Scanner;

public class CalculratorLv1 {

    public static void main(String[] args) {

        // 스캐너 기능을 활용할 수 있는 변수 생성.
        Scanner scanner = new Scanner(System.in);

        long indexOne; // 첫 번째 정수를 담을 변수
        long indexTwo; // 두 번째 정수를 담을 변수
        String operationSign; // 사칙연산 기호를 담을 변수
        String checkIndex; // 정수를 문자열로 변환하여 음수인지 확인할 수 있게 도와주는 변수
        String exit; // 종료 관련 문자를 입력받을 변수


        // 반복문을 사용해 프로그램 무한 반복
        while (true) {
            // 첫 번째 정수를 입력받는 코드
            System.out.print("첫 번째 정수를 입력하세요: ");
            indexOne = scanner.nextLong();

            // 정수를 문자열로 변환
            checkIndex = Long.toString(indexOne);

            // 입력값의 첫 글자가 '-'가=일 경우 메시지 출력 후 반복문 종료
            if (checkIndex.charAt(0) == '-') {
                System.out.println("양의 정수만 입력할 수 있습니다.");
                break;
            }

            // 두 번째 정수를 입력받는 코드
            System.out.print("두 번째 정수를 입력하세요: ");
            indexTwo = scanner.nextLong();
            scanner.nextLine();

            // 정수를 문자열로 변환
            checkIndex = Long.toString(indexTwo);

            // 입력값의 첫 글자가 '-'일 경우 메시지 출력 후 반복문 종료
            if (checkIndex.charAt(0) == '-') {
                System.out.println("양의 정수만 입력할 수 있습니다.");
                break;
            }


            // 사칙연산 기호를 입력받는 코드
            System.out.print("사칙연산 기호를 입력하세요: ");
            operationSign = scanner.nextLine();


            // 입력받은 문자열이 사칙연산의 기호가 맞는지 구분하는 조건문 사칙연산의 기호가 아닐시 메시지를 출력해 예외처리
            if (operationSign.equals("+")) {
                long indexSum = indexOne + indexTwo;
                System.out.println("계산 결과: " + indexOne + " " + operationSign + " " + indexTwo + " = " + indexSum);
            } else if (operationSign.equals("-")) {
                long indexSub = indexOne - indexTwo;
                System.out.println("계산 결과: " + indexOne + " " + operationSign + " " + indexTwo + " = " + indexSub);
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

            // 입력받은 문자가 exit라면 프로그램을 종료하고, exit가 아니라면 계속 실행하는 코드
            System.out.println("계속 하시겠습니까? (exit를 입력하여 종료.)");
            exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
