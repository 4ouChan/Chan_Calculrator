package chan.calculrator.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticCalculrator {

    Scanner scanner = new Scanner(System.in);

    // 계산 결과를 담을 컬렉션 필드
    private ArrayList<Long> Result = new ArrayList<>();

    // 계산 결과를 담을 변수
    private long calcResult;


    // 연산을 수행하는 기능
    public void calculate(long indexOne, long indexTwo, OperatorType operator) {
        switch (operator) {
            case PLUS -> calcResult = (indexOne + indexTwo);
            case MINUS -> calcResult = (indexOne - indexTwo);
            case MULTIPLY -> calcResult = (indexOne * indexTwo);
            case DIVIDE -> calcResult = (indexOne / indexTwo);
        }
    }

    // 캡슐화한 컬렉션에 접근할 수 있는 게터
    ArrayList<Long> getResult() {
        return this.Result;
    }

    // 컬렉션 필드에 결과 값을 담을 세터
    ArrayList<Long> setResult() {
        Result.add(calcResult);
        return this.Result;
    }

    // 제일 처음 입력된 값을 삭제하는 기능
    public void removeResult() {
        Result.remove(0);
    }
}

//lv3 포기.





