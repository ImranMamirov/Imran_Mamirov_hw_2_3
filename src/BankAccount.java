public class BankAccount {
    private double amount;

    public double getAmount() {
        return this.amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            this.amount += sum;
            System.out.println("Пополнено " + sum + " сомов. Остаток на счете: " + this.amount + " Сом");
        } else {
            System.out.println("Некорректная сумма для пополнения.");
        }
    }

    public void withDraw(int sum) throws LimitException {
            if (sum > 0 && sum <= this.amount) {
                this.amount -= sum;
                System.out.println("Снято: " + sum + " Сом. Остаток: " + this.amount);
            } else {
                throw  new LimitException("Недостаточно средств на счете.", this.amount);
            }
    }
}
