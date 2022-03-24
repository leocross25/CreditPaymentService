public class CreditPaymentService {
    public int calculate(int sum, int time) {
        int loanDurationTime = time * 12;
        double percentYear = 9.99;
        double percentMonth = percentYear / 12 / 100;
        double annuityRatio = sum * (Math.pow((1 + percentMonth), loanDurationTime) * percentMonth) / ((Math.pow((1 + percentMonth), loanDurationTime) - 1));
        return (int) annuityRatio;
    }
}
