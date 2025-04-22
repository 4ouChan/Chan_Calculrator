package chan.calculrator.lv3;

public enum OperatorType {
        PLUS, MINUS, MULTIPLY, DIVIDE;

         public static OperatorType checkOper(char operator) {
             try {
                 return switch (operator) {
                     case '+' -> PLUS;
                     case '-' -> MINUS;
                     case '*' -> MULTIPLY;
                     case '/' -> DIVIDE;
                     default -> throw new RuntimeException();
                 };
             } catch (RuntimeException e) {
                 return null;
             }
         }
}
