package sep16_2024_hw;

public class second_task {
    public static void main(String[] args) {
        double Dianassalary = 66660;
        double Andreyssalary = 77770;
        double Marinassalary = 88880;
        double increasePercent = 15.0;

        double DianasNewSalary = Dianassalary + (Dianassalary * increasePercent / 100);
        double DianasAnnualDiff = (DianasNewSalary - Dianassalary) * 1;

        double AndreysNewSalary = Andreyssalary + (Andreyssalary * increasePercent / 100);
        double AndreysAnnualDiff = (AndreysNewSalary - Andreyssalary) * 1;

        double MarinasNewSalary = Marinassalary + (Marinassalary * increasePercent / 100);
        double MarinasAnnualDiff = (MarinasNewSalary - Marinassalary) * 1;

        System.out.println("Диана теперь получает " + (int) DianasNewSalary + " руб" + ". Годовой доход вырос на " + (int) DianasAnnualDiff + " рублей");
        System.out.println("Андрей теперь получает " + (int) AndreysNewSalary + " руб" + ". Годовой доход вырос на " + (int) AndreysAnnualDiff + " рублей");
        System.out.println("Марина теперь получает " + (int) MarinasNewSalary + " руб" + ". Годовой доход вырос на " + (int) MarinasAnnualDiff + " рублей");
    }
}
