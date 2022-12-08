public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");

        int valueOfVariableInt = 1000000;
        System.out.println("Значение переменной valueOfVariableInt с типом int равно " + valueOfVariableInt);

        byte valueOfVariableByte = 100;
        System.out.println("Значение переменной valueOfVariableByte с типом byte равно " + valueOfVariableByte);

        short valueOfVariableShort = 10000;
        System.out.println("Значение переменной valueOfVariableShort с типом short равно " + valueOfVariableShort);

        long valueOfVariableLong = 1_000_000_000L;
        System.out.println("Значение переменной valueOfVariableLong с типом long равно " + valueOfVariableLong);

        float valueOfVariableFloat = 5.5f;
        System.out.println("Значение переменной valueOfVariableFloat с типом float равно " + valueOfVariableFloat);

        double valueOfVariableDouble = 555555555.55555555;
        System.out.println("Значение переменной valueOfVariableDouble с типом double равно " + valueOfVariableDouble);

        // Задача №2
        System.out.println("Задача №2");

        int a = 27897 ;
        short c = 67;
        long d = 987_678_965_549L;
        short e = -159;
        double f = 2.786;
        float j = 27.12f;
        boolean k = false;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(j);
        System.out.println(k);

        // Задача №3
        System.out.println("Задача №3");

        int classOne = 23;
        int classTwo = 27;
        int classThree = 30;
        int totalSheetsOfPaper = 480;
        int SheetsOfPaperToStudent = totalSheetsOfPaper/(classOne + classTwo +classThree);

        System.out.println("На каждого ученика рассчитано " + SheetsOfPaperToStudent + " листов бумаги");

        // Задача №4
        System.out.println("Задача №4");

        byte productivityPerMinute = 16/2;
        int twentyMinutes = 20;
        int day = 60 * 24;
        int threeDays = day * 3;
        int oneMonth = day * 31;

        int bottlesInTwentyMinutes = productivityPerMinute*twentyMinutes;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesInTwentyMinutes + " штук");

        int bottlesInOneDay = productivityPerMinute*day;
        System.out.println("За сутки машина произвела бутылок " + bottlesInOneDay + " штук");

        int bottlesInTreeDays = productivityPerMinute*threeDays;
        System.out.println("За три дня машина произвела бутылок " + bottlesInTreeDays + " штук");

        int bottlesInOneMonth = productivityPerMinute*oneMonth;
        System.out.println("За один месяц машина произвела бутылок " + bottlesInOneMonth + " штук");

        // Задача №5
        System.out.println("Задача №5");

        byte classesAtSchool = 120/(4 + 2);
        int amountOfWhitePaint = classesAtSchool * 2;
        int amountOfBrownPaint = classesAtSchool * 4;

        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " +
                amountOfWhitePaint + " банок белой краски и " + amountOfBrownPaint + " банок коричневой краски");

        // Задача №6
        System.out.println("Задача №6");

        int weightOfBananas = 5 * 80;
        int weightOfMilk = 2 * 105;
        int weightOfIceCream = 2 * 100;
        int weightOfEggs = 4 * 70;
        double oneKilogram = 1000.0;

        double breakfastWeight = (weightOfBananas + weightOfMilk +weightOfIceCream + weightOfEggs)/oneKilogram;

        System.out.println("Вес одного спорт-завтрака составляет: " + breakfastWeight + " кг");

        // Задача №7
        System.out.println("Задача №7");

        int reductionWeight = 7 * 1000; // общий вес уменьшения в граммах
        int reductionWeight250 = 250;
        int reductionWeight500 = 500;
        int numberOfDays250 = reductionWeight/reductionWeight250;
        int numberOfDays500 = reductionWeight/reductionWeight500;
        int averageNumberOfDays = (numberOfDays250 + numberOfDays500)/2;

        System.out.println("При потере 250 грамм спортсмен похудеет за : " + numberOfDays250 + " дней");
        System.out.println("При потере 500 грамм спортсмен похудеет за : " + numberOfDays500 + " дней");
        System.out.println("Спортсмен похудеет в среднем за : " + averageNumberOfDays + " дней");

        // Задача №8
        System.out.println("Задача №8");

        int salaryMonthMasha = 67760;
        int salaryMonthMashaNew = (salaryMonthMasha * 110)/100;
        int annualIncomeGrowthMasha = (salaryMonthMashaNew * 12) % (salaryMonthMasha * 12);
        System.out.println("Маша теперь получает: " + salaryMonthMashaNew + " рублей. Годовой доход вырос на " +
                annualIncomeGrowthMasha + " рублей");

        int salaryMonthDenis = 83690;
        int salaryMonthDenisNew = (salaryMonthDenis * 110)/100;
        int annualIncomeGrowthDenis = (salaryMonthDenisNew * 12) % (salaryMonthDenis * 12);
        System.out.println("Денис теперь получает: " + salaryMonthDenisNew + " рублей. Годовой доход вырос на " +
                annualIncomeGrowthDenis + " рублей");

        int salaryMonthChristina = 76230;
        int salaryMonthChristinaNew = (salaryMonthChristina * 110)/100;
        int annualIncomeGrowthChristina = (salaryMonthChristinaNew * 12) % (salaryMonthChristina * 12);
        System.out.println("Кристина теперь получает: " + salaryMonthChristinaNew + " рублей. Годовой доход вырос на " +
                annualIncomeGrowthChristina + " рублей");




























    }
}