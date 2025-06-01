public class Main {
    public static void main(String[] args) {

        //Task1

byte a =  120;
short b = 15600;
int c = 1000000;
long d = 39487203293847209L;
float e = 36.567f;
double f = 23.78903;

System.out.println("Значение переменной a с типом byte равно " + a);
System.out.println("Значение переменной b с типом short равно " +b);
System.out.println("Значение переменной c с типом int равно " + c);
System.out.println("Значение переменной d с типом long равно " + d);
System.out.println("Значение переменной e с типом float равно " + e);
System.out.println("Значение переменной f с типом double равно " + f);

         //Task2

        byte aa =  67;
        short bb = 569;
        short bb1 = -159;
        short bb2 = 27897;
        long dd = 987678965549L;
        float ee = 27.12f;
        float ee1 = 2.786f;

        //Task3

        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short AllPep = 480;
        short StudPep = (short) (AllPep / (LP + AS + EA));

        System.out.println("На каждого ученика рассчитано " + StudPep + " листов бумаги.");

        //Task4

        byte WorkMash = 16;
        byte PerTime = 2;
        short PerTwenMin = (short) (WorkMash * 10);
        short PerDay = (short) (PerTwenMin * 72);
        int PerThDays = (PerDay * 3);
        int PerMonth = (PerDay * 30);

        System.out.println("За 20 минут машина произвела " + PerTwenMin + " штук бутылок.");
        System.out.println("За день машина произвела " + PerDay + " штук бутылок.");
        System.out.println("За три дня машина произвела " + PerThDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + PerMonth + " штук бутылок.");

        //Task5

        byte AllColor = 120;
        byte Brown = 4;
        byte White = 2;
        byte AllClass = (byte) (AllColor / (Brown + White)); //20
        byte AllBrown = (byte) (Brown * AllClass);
        byte AllWhite = (byte) (White * AllClass);

        System.out.println("В школе, где " + AllClass + " классов, нужно " + AllWhite + " банок белой краски и " + AllBrown + " банок коричневой краски.");

        //Task6

         byte Banan = 5;
         byte BananGram = 80;
         short MilkGram = 210;
         byte IceCr = 2;
         byte IceCrGram = 100;
         byte Eggs = 4;
         byte EggsGram = 70;
         short AllWeightGram = (short) (Banan * BananGram + IceCr * IceCrGram + Eggs * EggsGram + MilkGram);
         float AllWrightKg = ((float) AllWeightGram / 1000);

            System.out.println("Вес завтрака спортсмена равняется " + AllWeightGram + " грамм или " + AllWrightKg + " килограмм.");


         //Task7

         short NewRat1 =  250;
         short NewRat2 =  500;
         short MustLost = 7000;
         short IfNewRat1 = (short) (MustLost / NewRat1);
         short IfNewRat2 = (short) (MustLost / NewRat2);


         System.out.println("При диете в щадящем режиме потребуется " + IfNewRat1 + " дней и в усиленном " + IfNewRat2 + " дней.");

         //Task8

            int Masha = 67760;
            int Denis = 83690;
            int Kris = 76230;
            int CashUpM = Masha / 10;
            int CashUpD = Denis / 10;
            int CashUpK = Kris / 10;
            int AllCashNowM = CashUpM + Masha;
            int AllCashNowD = CashUpM + Denis;
            int AllCashNowK = CashUpM + Kris;
            short ProcOfM = (short) (AllCashNowM % Masha);
            short ProcOfD = (short) (AllCashNowD % Masha);
            short ProcOfK = (short) (AllCashNowK % Masha);

            System.out.println("Маша теперь получает " + AllCashNowM + " рублей. Годовой доход вырос на " + ProcOfM + " рублей.");
            System.out.println("Денис теперь получает " + AllCashNowD + " рублей. Годовой доход вырос на " + ProcOfD + " рублей.");
            System.out.println("Кристина теперь получает " + AllCashNowK + " рублей. Годовой доход вырос на " + ProcOfK + " рублей.");

















    }
    }