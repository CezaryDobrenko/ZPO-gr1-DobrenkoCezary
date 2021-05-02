package ZPO.lab09.zadanie3;

public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (String month : months) {
            System.out.println(month + ": " +FinancialData.getInstance(month).getValue());
        }
    }
}