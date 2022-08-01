public class Main {
    public static void main(String[] args) {
        int age = 19;
        int salary = 58_000;

        if (age >= 23 && salary >= 50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.2 + " рублей");
        } else if (age >= 23 && salary >= 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.5 + " рублей");
        } else if (age < 23 && salary >= 50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " рублей");
        } else if (age < 23 && salary >= 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5 + " рублей");
        } else if (age >= 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей");
        } else if (age < 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " рублей");
        }

        int newAge = 25;
        int newSalary = 60_000;
        int wantedSum = 330_000;
        int recommendSumForYoung = (wantedSum / 100 * 11 + wantedSum) / 12;
        double recommendSumForOlder = (wantedSum / 100 * 10.5 + wantedSum) / 12;
        double recommendSumForRichOlder = (wantedSum / 100 * 9.8 + wantedSum) / 12;
        double recommendSumForRichYoung = (wantedSum / 100 * 10.3 + wantedSum) / 12;
        String agreeCredit = "Одобрено";
        String falseCredit = "Отказано ";


        if (newAge < 23 && recommendSumForRichYoung > newSalary / 2 && newSalary > 80000) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForRichYoung + " рублей." + falseCredit);
        } else if (newAge < 23 && recommendSumForRichYoung < newSalary / 2 && newSalary > 80000) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForRichYoung + " рублей." + agreeCredit);
        } else if (newAge < 30 && newAge > 23 && recommendSumForRichOlder > newSalary / 2 && newSalary > 80000) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForRichOlder + " рублей." + falseCredit);
        } else if (newAge < 30 && newAge > 23 && recommendSumForRichOlder < newSalary / 2 && newSalary > 80000) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForRichOlder + " рублей." + agreeCredit);
        } else if (newAge < 23 && recommendSumForYoung < newSalary / 2) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForYoung + " рублей." + agreeCredit);
        } else if (newAge < 30 && newAge > 23 && recommendSumForOlder > newSalary / 2) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForOlder + " рублей." + falseCredit);
        } else if (newAge < 30 && newAge > 23 && recommendSumForOlder < newSalary / 2) {
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForOlder + " рублей." + agreeCredit);
        } else
            System.out.println("Максимальный платеж при ЗП " + newSalary + " равен " + newSalary / 2 + " рублей. " + " Платеж по кредиту " + recommendSumForYoung + " рублей." + falseCredit);
    }

}

