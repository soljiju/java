package bank;

public class Account {
    // 속성
    private String ano;      // 계좌번호
    private String owner;    // 입금주
    private int balance;     // 잔고

    // 생성자: 계좌번호, 입금주, 잔고 초기화
    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // Getter 메서드: 계좌번호
    public String getAno() {
        return ano;
    }

    // Getter 메서드: 입금주
    public String getOwner() {
        return owner;
    }

    // Getter 메서드: 잔고
    public int getBalance() {
        return balance;
    }

    // Setter 메서드: 잔고
    public void setBalance(int balance) {
        this.balance = balance;
    }
}