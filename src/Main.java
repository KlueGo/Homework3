public class Main {
    public static void main(String[] args) {

        //Task1

        byte a = 120;
        short b = 15600;
        int c = 1000000;
        long d = 39487203293847209L;
        float e = 36.567f;
        double f = 23.78903;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //Task2

        byte aa = 67;
        short bb = 569;
        short bb1 = -159;
        short bb2 = 27897;
        long dd = 987678965549L;
        float ee = 27.12f;
        float ee1 = 2.786f;

        //Task3

        byte ludPav = 23;
        byte annSerge = 27;
        byte ekaAndre = 30;
        short allPep = 480;
        short studPep = (short) (allPep / (ludPav + annSerge + ekaAndre));

        System.out.println("На каждого ученика рассчитано " + studPep + " листов бумаги.");

        //Task4

        byte workMash = 16;
        byte perTime = 2;
        short perTwenMin = (short) (workMash * 10);
        short perDay = (short) (perTwenMin * 72);
        int perThDays = (perDay * 3);
        int perMonth = (perDay * 30);

        System.out.println("За 20 минут машина произвела " + perTwenMin + " штук бутылок.");
        System.out.println("За день машина произвела " + perDay + " штук бутылок.");
        System.out.println("За три дня машина произвела " + perThDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок.");

        //Task5

        byte allColor = 120;
        byte brown = 4;
        byte white = 2;
        byte allClass = (byte) (allColor / (brown + white)); //20
        byte allBrown = (byte) (brown * allClass);
        byte allWhite = (byte) (white * allClass);

        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски.");

        //Task6

        byte banan = 5;
        byte bananGram = 80;
        short milkGram = 210;
        byte iceCr = 2;
        byte iceCrGram = 100;
        byte eggs = 4;
        byte eggsGram = 70;
        short allWeightGram = (short) (banan * bananGram + iceCr * iceCrGram + eggs * eggsGram + milkGram);
        float allWrightKg = ((float) allWeightGram / 1000);

        System.out.println("Вес завтрака спортсмена равняется " + allWeightGram + " грамм или " + allWrightKg + " килограмм.");


        //Task7

        short newRat1 = 250;
        short newRat2 = 500;
        short mustLost = 7000;
        short ifNewRat1 = (short) (mustLost / newRat1);
        short ifNewRat2 = (short) (mustLost / newRat2);


        System.out.println("При диете в щадящем режиме потребуется " + ifNewRat1 + " дней и в усиленном " + ifNewRat2 + " дней.");

        //Task8

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int cashUpM = masha / 10;
        int cashUpD = denis / 10;
        int cashUpK = kris / 10;
        int allCashNowM = cashUpM + masha;
        int allCashNowD = cashUpM + denis;
        int allCashNowK = cashUpM + kris;
        short procOfM = (short) (allCashNowM % masha);
        short procOfD = (short) (allCashNowD % masha);
        short procOfK = (short) (allCashNowK % masha);

        System.out.println("Маша теперь получает " + allCashNowM + " рублей. Годовой доход вырос на " + procOfM + " рублей.");
        System.out.println("Денис теперь получает " + allCashNowD + " рублей. Годовой доход вырос на " + procOfD + " рублей.");
        System.out.println("Кристина теперь получает " + allCashNowK + " рублей. Годовой доход вырос на " + procOfK + " рублей.");


    }
}