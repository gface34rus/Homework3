public class Main {
    public static void main(String[] args) {
       // Задача 1
        byte b = -7;
        short s = 31;
        int i = 100;
        long l = 250L;
        float f = 3.5f;
        double d = 120.75;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();

        // Задача 2
        float f1 = 27.12f;
        long l1 = 987678965549L;
        double d1 = 2.786;
        short s1 = 569;
        short s2 = -159;
        int i1 = 27897;
        byte b1 = 67;

        // Задача 3
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int allSheets = 480;
        int sheetForChild = allSheets/(lP+aS+eA);
        System.out.println("На каждого ученика рассчитано "+sheetForChild+" листов бумаги");
        System.out.println();
        // Задача 4
        int bottlePer2Minutes = 16;
        int bottlePer20Minutes = bottlePer2Minutes/2*20;
        int bottlePer24Hours = (bottlePer20Minutes*3)*24;
        int bottlePer3Days = bottlePer24Hours*3;
        int bottlePerMonth  = bottlePer3Days*10;
        System.out.println("За 2 минуты машина произвела " + bottlePer2Minutes + " штук бутылок");
        System.out.println("За 20 минут машина произвела "+bottlePer20Minutes+" штук бутылок");
        System.out.println("За 24 часа машина произвела "+bottlePer24Hours+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+bottlePer3Days+" штук бутылок");
        System.out.println("За месяц машина произвела "+bottlePerMonth+" штук бутылок");
        System.out.println();

        // Задача 5
        int allDyeJar = 120;
        int whiteDyeJarFor1Class = 2;
        int brownDyeJarFor1Class = 4;
        int allDyeJarFor1Class = whiteDyeJarFor1Class+brownDyeJarFor1Class;
        int howManyClasses = allDyeJar/allDyeJarFor1Class;
        int totalWhiteDyeJar = howManyClasses*whiteDyeJarFor1Class;
        int totalBrownDyeJar = howManyClasses*brownDyeJarFor1Class;
        System.out.println("В школе где "+howManyClasses+" классов, нужно "+totalWhiteDyeJar+" банок белой краски и "+totalBrownDyeJar+" банок коричневой краски");
        System.out.println();

        // Задача 6
        int bananaWeight = 5*80;
        int milkWeight = 2*105;
        int iceCreamWeight = 2*100;
        int eggWeight = 4*70;
        int breakfastWeight = bananaWeight+milkWeight+iceCreamWeight+eggWeight;
        float inKg = (float)breakfastWeight/1000;
        System.out.println("Вес завтрака спортсмена составляет "+breakfastWeight+" граммов, в килограммах это  "+inKg+" киллограмм");
        System.out.println();

        // Задача 7
        int firstDiet = (7*1000)/250;
        int secondDiet = (7*1000)/500;
        int middleDiet = (firstDiet+secondDiet)/2; //Здесь тоже использую int, так как нелогичным выглядит результат с дробным числом
        System.out.println("Если спортсмен будет сбрасывать каждый день по 250 грамм, то он похудеет до нужного веса за "+firstDiet+" дней.");
        System.out.println("Если спортсмен будет сбрасывать каждый день по 500 грамм, то он похудеет до нужного веса за "+secondDiet+" дней.");
        System.out.println("В среднем чтобы согнать нужный вес понадобится "+middleDiet+" день");
        System.out.println();

        // Задача 8
        int masha = 67760;
        int mashaRaise = ((masha/100)*10)+masha;
        int mashaDiff = (mashaRaise-masha)*12;
        System.out.println("Маша теперь получает "+mashaRaise+" рублей. Годовой доход вырос на "+mashaDiff+" рублей");
        int denis = 83690;
        int denisRaise = ((denis/100)*10)+denis;
        int denisDiff = (denisRaise-denis)*12;
        System.out.println("Денис теперь получает "+denisRaise+ " рублей. Годовой доход вырос на "+denisDiff+" рублей");
        int kristina = 76230;
        int kristinaRaise = ((kristina/100)*10)+kristina;
        int kristinaDiff = (kristinaRaise-kristina)*12;
        System.out.println("Кристина теперь получает "+kristinaRaise+" рублей. Годовой доход вырос на "+kristinaDiff+" рублей");
    }
}