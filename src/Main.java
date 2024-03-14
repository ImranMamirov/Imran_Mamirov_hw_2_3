public class Main {
    public static void main(String[] args) {
        BankAccount clientAccount = new BankAccount();
        clientAccount.deposit(15000);

        double currentAmount = clientAccount.getAmount();
        System.out.println("Текущий остаток на счете клиента: " + currentAmount);


        while (true) {
            try {
                clientAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println("Превышен лимит. Снято доступное количество средств: " + e.getRemainingAmount());
                break;
            }
        }
    }
}