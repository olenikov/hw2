public class Main {
    public static void main(String[] args) {
        int total = 0;
        int depoMounth = 15000;
        int mounthCount = 1;
        while (total < 2_459_000) {
            total = total + depoMounth + (total / 100);
            mounthCount = mounthCount + 1;
            System.out.println("Месяц " + mounthCount + " сумма накоплений равна " + total + " рублей");
        }

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }

        System.out.println();
        int population = 12_000_000;
        int born = population / 1000 * 17;
        int death = population / 1000 * 8;
        int start = 0;
        while (start < 10) {
            population = population + (born - death) * 12;
            start = start + 1;
            System.out.println("Год " + start + " численность населения составляет " + population);

        }


        double tDepo = 15_000;
        int mCount = 0;
        while (tDepo < 12_000_000) {
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            mCount = mCount + 6;
            System.out.println("Месяц " + mCount + " Сумма накоплений " + tDepo);


        }
        tDepo = 15_000;
        mCount = 0;
        while (mCount < 108) {
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            tDepo = (tDepo + (tDepo * 0.07) + 15_000);
            mCount = mCount + 6;
            System.out.println("Месяц " + mCount + " сумма " + tDepo);
        }

        int friday = 2;
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        while (friday < 31) {
            friday = friday + 7;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        int comStart = 79;
        int now = 2022;
        int startTime = now - 200;
                int endTime = now + 100;
        while (comStart <= startTime) {
            comStart = comStart +79;
        }
        while (comStart <= endTime){
            comStart = comStart +79;
            System.out.println(comStart);
        }
    }
}
