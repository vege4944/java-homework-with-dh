package main.java.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // true를 쓰면 while문을 조건없이 무한으로 반복한다는 의미
            System.out.println("첫 번째 숫자를 입력하세요: ");//알림을 주는 메세지 역할
            int num1 = sc.nextInt(); //숫자를 입력을 받는 구간
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: "); //알림 메세지 주기
            char operator = sc.next().charAt(0); //사칙연산을 입력받는 구간

            int result = 0; // 모든값을 result에 저장
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default: //사칙연산이 아닐경우 뜨는 에러 메세지
                    System.out.println("연산이 불가합니다.");
            }
            System.out.println(result);

            System.out.println("더 계산을 원하시면 enter 버튼을 누르세요. 'exit' 입력 시 종료!");
            sc.nextLine();
            String end = sc.nextLine(); //콘솔창에서 입력을 받는 것
            if (end.equals("exit")) { //exit라는 단어를 받으면 break를 하겠다
                break;
            }
        }

    }
}
