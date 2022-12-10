public class Main {
    public static void main(String[] args) {
        int total = 0;
        int depoMounth = 15000;
        int mounthCount = 1;
        while (total < 2_459_000 ){
            total = total + depoMounth + (total/100);
            mounthCount = mounthCount + 1;
            System.out.println("Месяц " + mounthCount + " сумма накоплений равна " + total + " рублей");
        }

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (;number > 0; number-- ){
            System.out.print(number + " ");
        }



    }

    }

