import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        /**
         * примитивы
         */
        int age = 13;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        /**
         * Ссылочные типы данных
         */
        String name = "Alice";
        //System.out.println(name.length());

        /**
         * Операторы
         */
        // Арифметические
        int a = 10;
        int b = 3;
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3 (целочисленное деление)
        System.out.println(a % b); // 1 (остаток от деления)

        // Операторы сравнения
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // true
        System.out.println(a <= b); // false

        // Логические операторы
        boolean x = true;
        boolean y = false;
        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x); // false

        System.out.println(2 == 2 && 3 != 2); // true
        System.out.println(2 == 2 && 3 != 3); // false
        System.out.println(!((2 + 2) == 4)); // false
        System.out.println(!((2 + 2) == 4) || true); // true

        /**
         * Вывод в консоль
         */
        System.out.println("Привет, мир!");
        System.out.print("А это ");
        System.out.print("будет на одной строке");
        System.out.println();
        System.out.println("А еще " + "можно так " + x);
        System.out.printf("Привет, меня зовут %s и я люблю %s\n", name, "маму");

        int oddNumber = 3;
        System.out.printf("Число четное? %s\n", oddNumber % 2 == 0);

        System.out.println("* * *");
        System.out.println("*   *");
        System.out.println("* * *");

        /**
         * Комментарии
         */

        // Однострочный комментарий
        // вторая строка

        /*
        многострочный
        комментарий
         */

        /**
         * Складывает два числа
         *
         * @param a первое число
         * @param b второе число
         * @return сумму чисел a и b
         */

        /**
         * Условные операторы
         * if-else
         */

        boolean isRain = true;
        /*
        if (isRain) {
            System.out.println("Надеть куртку");
            System.out.println("Надеть обувь");
            System.out.println("Взять зонт");
        } else {
            System.out.println("Надеть куртку");
            System.out.println("Надеть обувь");
        }
         */

        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        if (isRain) {
            System.out.println("Взять зонт");
        }

        String animal = "fish";
        if (animal.equals("cat")) {
            System.out.println("Маяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Буль");
        }

        int floor = 1;
        double price = 3000;
        if (floor == 1 && price < 5000) {
            System.out.println("Подходит для аренда");
        }

        a = 0;
        String result = a > 0 ? "a положительное число" : "а отрицательное число";
        System.out.println(result);

        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль!");
                break;
            case "bear":
                System.out.println("рр");
                break;
            default:
                System.out.println("Привет!");
        }

        /**
         * Циклы
         */

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while
        int z = 0;
        while (z < 10) {
            System.out.println(z);
            z++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Выход из цикла
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // пропуск
            }
            System.out.println(i);
        }

        // Home Work

        // 1. Напишите функциональность, которая вычисляет площадь круга
        double pi = 3.14;
        double r = 5;
        System.out.println("1. Площадь круга = " + pi*r*r);

        // 2. Переведите температуру в градусах Цельсия в Фаренгейты
        double cel = 25;
        System.out.println("2. "+cel+" градусов Цельсия = "+(cel * 9 / 5 + 32)+" градусам Фаренгейта");

        // 3. Проверьте, является ли длина сроки "Hello" равной длине другой строки
        String s1 = "Hello";
        String s2 = "Bye";
        String compare =  (s1.length() == s2.length()) ? "Да" : "Нет";
        System.out.println("3. Длина строки Hello равна длинне строки " + s2 +"? - " + compare);

        // 4. Напишите функциональность, которая определяет, является ли год високосным
        int year = 2000;
        String leap_year = ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ) ? "Да" : "Нет";
        System.out.println("4. Год " + year + " високосный? - " + leap_year);

        // 5. Напишите калькулятор ИМТ
        double height = 1.75;  // в метрах
        double weight = 105;   // в кг
        double imt =  weight / (height * height);
        String diagnos;

        if (imt < 16) {
            diagnos = "Выраженный дефицит массы тела";
        } else if (imt < 18.5 ) {
            diagnos = "Недостаточная масса тела";
        } else if (imt < 25 ) {
            diagnos = "Норма";
        } else if (imt < 30 ) {
            diagnos = "Избыточная масса тела";
        } else if (imt < 35 ) {
            diagnos = "Ожирение первой степени";
        } else if (imt < 40 ) {
            diagnos = "Ожирение второй степени";
        } else {
            diagnos = "Ожирение третьей степени";
        }
        System.out.println("5. ИМТ = " + String.format("%.2f", imt) + " Диагноз: "+diagnos);

        // 6. Выведите в консоль таблицу истинности для операторов && и ||
        boolean c = true;
        boolean d = true;
        System.out.println("6. a     b      &&      || ");
        System.out.println("   "+c+"  "+d+"   "+(c && d)+"   "+(c || d));
        c = true;
        d = false;
        System.out.println("   "+c+"  "+d+"   "+(c && d)+"   "+(c || d));
        c = false;
        d = true;
        System.out.println("   "+c+"  "+d+"   "+(c && d)+"   "+(c || d));
        c = false;
        d = false;
        System.out.println("   "+c+"  "+d+"   "+(c && d)+"   "+(c || d));

        // 7. Выведите в консоль квадрат
        System.out.println("7. квадрат");
        for (int i = 1; i <= 6; i++) {
            System.out.println("XXXXXXXXXXXXXXXX");
        }

        // 8. Выведите в консоль полый квадрат
        System.out.println("8. полый квадрат");
        System.out.println("XXXXXXXXXXXXXXXX");
        for (int i = 1; i <= 4; i++) {
            System.out.println("X              X");
        }
        System.out.println("XXXXXXXXXXXXXXXX");

        // 9. Выведите в консоль ромб
        System.out.println("9. ромб");
        System.out.println("\u2666");

        // 10. Выведите в консоль смайлик
        System.out.println("10. смайлик");
        System.out.println("\u263a");

        /**
         * if-else
         */
        System.out.println("*********** if-else");

        // 1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
        System.out.println("1. четное или нечетное");
        int i = 10;
        if (i % 2 == 0) {
            System.out.println(d + " - четное");
        }
        else {
            System.out.println(d + " - нечетное");
        }

        // 2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
        System.out.println("2. «Первое больше», «Второе больше» или «Равны»");
        int i1 = 25;
        int i2 = 25;
        if (i1 > i2) {
            System.out.println("Первое больше");
        }
        else if (i1 < i2) {
            System.out.println("Второе больше");
        }
        else {
            System.out.println("Равны");
        }

        // 3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
        System.out.println("3. «Положительное», «Отрицательное» или «Равно нулю»");
        i1 = -100;
        if (i1 > 0) {
            System.out.println("Положительное");
        }
        else if (i1 < 0) {
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Равно нулю");
        }

        // 4. Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен»
        System.out.println("4. «Доступ разрешен», «Доступ запрещен»");
        i1 = 18;
        if (i1 >= 18) {
            System.out.println("Доступ разрешен");
        }
        else {
            System.out.println("Доступ запрещен");
        }

        /**
         * 5. Придумать задачу самим
         *  Определяет часть суток по часам
         *  0-5 - "ночь"
         *  6-11 - "утро"
         *  12-17 - "день"
         *  18-24 - "день"
          */
        System.out.println("5. Часть суток по текущему времени");
        int hour = LocalTime.now().getHour();
        if (hour < 6) {
            System.out.println("Ночь");
        }
        else if (hour < 12) {
            System.out.println("Утро");
        }
        else if (hour < 18) {
            System.out.println("День");
        }
        else
        {
            System.out.println("Вечер");
        }

        /**
         * Тернарный оператор
         */
        System.out.println("*********** Тернарный оператор");
        // 1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
        System.out.println("1. Положительное, отрицательное или нулевое");
        i1 = 0;
        result = (i1 > 0) ? "Положительное" : (i1 < 0) ? "Отрицательное" : "Нулевое";
        System.out.println(result);

        // 2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
        System.out.println("2. Делится ли оно на 3 и 5 одновременно");
        i1 = 13;
        result = ( ((i1 % 3) == 0) && ((i1 % 5) == 0))  ? "Кратно" : "Не кратно";
        System.out.println(result);

        // 3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.
        System.out.println("3. «Четное» или «Нечетное»");
        i1 = 24;
        result = ((i1 % 2) == 0) ? "Четное" : "Нечетное";
        System.out.println(result);

        /**
         * switch
         */
        System.out.println("*********** Тернарный оператор");
        // 1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
        System.out.println("1. Выведите название дня недели");
        i1 = 7;
        switch (i1) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }

        // 2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
        System.out.println("2. Выведите описание оценки");
        i1 = 4;
        switch (i1) {
            case 1:
                System.out.println("Совсем не поперло");
                break;
            case 2:
                System.out.println("Не поперло");
                break;
            case 3:
                System.out.println("Шатко, валко");
                break;
            case 4:
                System.out.println("Ну, почти получилось");
                break;
            case 5:
                System.out.println("Нормально");
                break;
            default:
                System.out.println("Такого не может БЫТЬ! Oooooo");
        } ;

        /**
         * for
         */
        System.out.println("*********** for");
        // 1. Дан список чисел. Посчитайте сумму всех четных элементов
        System.out.println("1. Cумма всех четных элементов");
        int sum = 0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int index = 0; index < nums.length; index++){
            if (index % 2 == 0) {
                sum = sum + nums[index];
            }
        }
        System.out.println("Сумма равна " + sum);


        // 2. Дан список чисел. Найдите максимальное значение
        System.out.println("2. Найдите максимальное значение");
        int[] nums2 = { -100, -39, 1, 2, 3, 4, 5, 500, 6, 7, 8, 9, 10 };
        if (nums2.length > 1) {
          int max= nums2[0];
          for (int index = 1; index < nums2.length; index++){
              if (max < nums2[index]) {
                  max = nums2[index];
              }
            }
          System.out.println("Максимальное значение = " + max);
        }
        else {
            System.out.println("Список не задан");
        }

        // 3. Дано число n. Выведите таблицу умножения для n от 1 до 10
        System.out.println("3. Выведите таблицу умножения для n");
        int n = 34;
        for (int index = 1; index < 11; index++) {
            System.out.println(index + "*" + n + " = " + n * index);
        }

        // 4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке
        System.out.println("4. Числа от 10 до 1 в обратном порядке");
        for (int index = 10; index > 0; index--) {
            System.out.print(index + " ");
        }

        // 5. Найдите количество четных чисел в диапазоне от 1 до 50
        System.out.println("5. Количество четных чисел");
        int Count = 0;
        for (int index = 1; index <= 50; index++) {
             if (index % 2 == 0) {
                    Count = Count + 1;
                }
        }
        System.out.println("Четных чисел = " + Count);

        /**
         * while
         */
        System.out.println("*********** for");
        // 1. Найдите наименьшее число больше 100, которое делится на 7
        System.out.println("1. Число больше 100, которое делится на 7");
        n = 100;
        while (n % 7 != 0) {
            n++;
        }
        System.out.println(n);

        // 2. Дано число n. Вычислите его факториал через цикл while
        n = 10;
        System.out.println("2. Факториал числа " + n);
        i = 1;
        double factorial = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);

        // 3. Дано число. Определите, является ли оно простым
        n = 11;
        System.out.println("3. является ли число " + n + " простым ?");
        boolean prime = true;
        i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
               prime = false;
               break;
            }
            i ++;
        }
        if (prime) {
            System.out.println("Простое число");
        }
        else {
            System.out.println("Составное число");
        }

        /**
         * 4. Придумать задачу самим
         * Найти на каком элементе, сумма чисел арифметической прогрессии с основанием 1 превысит 567
         */
        System.out.println("4. На каком элементе, сумма чисел превысит 567 ?");
        int max = 567;
        i = 1;
        sum = 0;
        while (sum <= max) {
            sum = sum + i;
            i ++;
        }
        System.out.println(i);

        /**
         * break & continue
         */
        System.out.println("*********** break & continue");
        // 1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3
        System.out.println("1. Числа от 1 до 20, кроме тех, что делятся на 3");
        for (int index = 1; index <= 20; index++) {
            if ( (index % 3) == 0 ) {
                continue;
            }
            System.out.print(index + " ");
        }

        // 2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число
        System.out.println("2. Сумма элементов, до отрицательного числа");
        int[] nums3 = new int[] { 1, 3, 5, 10, 20, -15, -4, 5 };
        sum  = 0;
        for (int index = 0; index < nums3.length; index++){
            if (nums3[index] < 0) {
                break;
            }
            sum = sum + nums3[index];
        }
        System.out.println(sum);


        // 3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100
        int[] nums4 = new int[] { 1, 3, 5, 10, 20, -25, -4, 5, 10, 20, 30, 40, 50, 60 };
        System.out.println("2. Сумма элементов, до 100");
        sum  = 0;
        for (int index = 0; index < nums4.length; index++){
            sum = sum + nums4[index];
            if (sum > 100) {
                break;
            }
        }
        System.out.println(sum);

    }
}
