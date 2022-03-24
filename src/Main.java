public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();

        //First
        int creditSum = 1_000_000;
        int creditTime = 1;
        int monthPayment = credit.calculate(creditSum, creditTime);
        System.out.println("Сумма ежемесячного платежа: " + monthPayment + " рублей");

        //Second
        int creditSum1 = 1_000_000;
        int creditTime1 = 2;
        int monthPayment1 = credit.calculate(creditSum1, creditTime1);
        System.out.println("Сумма ежемесячного платежа: " + monthPayment1 + " рублей");

        //Third
        int creditSum2 = 1_000_000;
        int creditTime2 = 3;
        int monthPayment2 = credit.calculate(creditSum2, creditTime2);
        System.out.println("Сумма ежемесячного платежа: " + monthPayment2 + " рублей");
    }
}

