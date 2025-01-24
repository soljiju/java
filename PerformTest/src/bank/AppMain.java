package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Account> accounts = new ArrayList<>();
    
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo = Integer.parseInt(scanner.nextLine());
            if (selectNo == 1) {
                createAccount(); // 계좌 생성
            } else if(selectNo == 2) {
                accountList(); // 계좌 목록 출력
            } else if(selectNo == 3) {
                deposit(); // 예금
            } else if(selectNo == 4) {
                withdraw(); // 출금
            } else if(selectNo == 5) {
                isRunning = false; // 종료
            }  
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성 메소드
    private static void createAccount() {
        System.out.print("계좌 번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        accounts.add(newAccount);
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }

    // 계좌 목록 출력 메소드
    private static void accountList() {
        if (accounts.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
        } else {
            System.out.println("-----------계좌 목록---------------");
            for (Account account : accounts) {
                System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance() );
            }
        }
    }

    // 예금 메소드
    private static void deposit() {
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        Account account = findAccount(ano);

        if (account != null) {
            System.out.print("예금액: ");
            int amount = Integer.parseInt(scanner.nextLine());
            int newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println("결과 : 예금이 성공되었습니다.");
        }
    }

    // 출금 메소드
    private static void withdraw() {
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        Account account = findAccount(ano);

        if (account != null) {
            System.out.print("출금액: ");
            int amount = Integer.parseInt(scanner.nextLine());

            if (amount <= account.getBalance()) {
                int newBalance = account.getBalance() - amount;
                account.setBalance(newBalance);
                System.out.println("결과 : 출금이 성공되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }

    // 계좌 찾기 메소드
    private static Account findAccount(String ano) {
        for (Account account : accounts) {
            if (account.getAno().equals(ano)) {
                return account;
            }
        }
        System.out.println("계좌를 찾을 수 없습니다.");
        return null;
    }
}