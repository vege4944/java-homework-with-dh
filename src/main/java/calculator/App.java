package main.java.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] results = new int[10]; //int 배열로 먼저 만들기
//        int count = 0;
        ArrayList<Integer> results = new ArrayList<>();

        while (true) { // true를 쓰면 while문을 조건없이 무한으로 반복한다는 의미
            System.out.println("첫 번째 숫자를 입력하세요: ");//알림을 주는 메세지 역할
            int num1 = sc.nextInt(); //숫자를 입력을 받는 구간
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: "); //알림 메세지 주기
            char operator = sc.next().charAt(0); //사칙연산을 입력받는 구간
            sc.nextLine(); //위에 next만 있어서 바로 아래 nextLine추가해주기->문자열도 받아가고 엔터도 자동으로 입력해줌
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
//            if (count == 10) {
//                for (int i = 1; i < 10; i++) { // 0부터 돌려야하는데 한칸씩 땡길거라
//                    results[i - 1] = results[i];
//                }
//                results[9] = result;
//            } else {
//                results[count++] = result;
//            }

            results.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
            if(sc.nextLine().equals("remove")) {
                results.remove(0);
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")) {
                for (Integer i : results) { //iter 치면 자동완성
                    System.out.println(i);
                }
            }


            System.out.println("더 계산을 원하시면 enter 버튼을 누르세요. 'exit' 입력 시 종료!");
            String end = sc.nextLine(); //콘솔창에서 입력을 받는 것
            if (end.equals("exit")) { //exit라는 단어를 받으면 break를 하겠다
                break;
            }



        }

    }
}
