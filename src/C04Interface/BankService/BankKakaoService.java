package C04Interface.BankService;

//비지니스 로직이 동작하는 코드 Service 코드


public class BankKakaoService implements BankService {

    public void deposit(int money, BankAccount bankAccount){
        int total = bankAccount.getBalance() + money;
        System.out.println(money+"원 카카오뱅크로 입금되었습니다.");
        bankAccount.updateBalance(total);
        System.out.println("현재 잔액은 " + total);
    }
    public void withdraw(int money, BankAccount bankAccount){
        if(bankAccount.getBalance() < money) {
            System.out.println("잔액 부족입니다.");
        }else {
            int total = bankAccount.getBalance() - money;
            bankAccount.updateBalance(total);
            System.out.println(money + "원 카카오뱅크로 출금되었습니다.");
            System.out.println("현재 잔액은 " + total);
        }
    }
}
