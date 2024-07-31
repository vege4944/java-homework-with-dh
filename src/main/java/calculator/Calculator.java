package calculator;

public class Calculator {
    public int calculate(int a, int b, char operator) { // 괄호안은 매개변수: 수행되는데 필요한 변수를 선언해서 넣어주는 것
// 사람, 인자, args 라는 이름으로 불림 = 매개변수
//        int result1 = a + b;
//        int result2 = a - b;
//        int result3 = a * b;
//        int result4 = a / b;
//        return 0; //이 자리는 원시값(primitive) 넣기: 호출하면 무조건 0을 호출할거야! 라는 의미
        // = << 변수에다 값을 넣어줄 때만 사용하니 여기서는 사용x (나중에 절차언어?에 대해서 배워보기)
        int result = 0;


        switch (operator){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("연산을 할 수 없는 값을 넣으셨습니다.");
        }
        return result;
    }

}
// 절차적인 부분/ 기본문법/ 프로그래밍을 더 공부해보기
