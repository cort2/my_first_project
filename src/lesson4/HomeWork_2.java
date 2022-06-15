package lesson4;

import java.sql.Array;

public class HomeWork_2 {
    public static void main(String[] args) {
        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        int i = 1;
        for( i = 1; i<101; i++){
            System.out.print(i + "a" + " ");
        }

        System.out.println();

        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren < 6){
            System.out.print("пошел в сад");
        } else if (ageChildren < 11) {
            System.out.print("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.print("пошел в среднюю школу");
        } else {
            System.out.print("пошел в универмитет");
        }

        System.out.println();

        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if(chicken && vegetables && sour && toast){
            System.out.println("сделаю Цезарь");
        } else if (vegetables && (sausage||chicken) && eggs) {
            System.out.println("сделаю Оливье");
        } else if (vegetables) {
            System.out.println("сделаю Овощной салат");
        }else {
            System.out.println("У меня ничего нет");
        }

        System.out.println();

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        Animal pig = new Animal("Pumba", 45);
        System.out.println(pig.getInfo());
        String name = pig.getName();
        System.out.println(name);
        pig.setWeight(50);
        int newWeight = pig.getWeight();
        System.out.println("Прибавил вес до" + " " + newWeight);

        Snake kaa = new Snake("Kaa", 10);
        System.out.println(kaa.getInfo());
        kaa.setLength(15);
        int newLength = kaa.getLength();
        System.out.println("Вырос до" + " " + newLength);

        System.out.println();

        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        int count = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        while (result < 1000000){
            if(increment < 0){
                break;
            }
            result += increment;
            count++;
        }
        System.out.println(count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] myArray = new  int[]{1,1,1,1,1,};
        for ( i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                myArray[i] = 0;
            }
            System.out.print(myArray[i] + " ");
        }

        System.out.println();

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        int check = 0;
        if(!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            check += 1000;
        }
        if(hasMotorProblem){
            check += 10000;
        }
        if(hasElectricsProblem){
            check += 5000;
        }
        if(hasTransmissionProblem){
            check += 4000;
        }
        if(hasWheelsProblem){
            check += 2000;
        }
        if(hasWheelsProblem && (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem)
            || (hasElectricsProblem && hasMotorProblem)){
            check = (int)(check * 0.9);
        } else if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            check = (int)(check * 0.8);
        }
        System.out.println(check);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        Storage shop = new Storage ("Pyaterochka", 100);

        Workers man = new Workers("Kolya", 0);
        System.out.println(man.getInfo());
        man.setBottle( 10, shop);
        System.out.println("Ура я испортил водку. Kolya" + " " + man.getBottle());

        Workers man2 = new Workers("Petya", 0);
        System.out.println(man2.getInfo());
        man2.setBottle(20, shop);
        System.out.println("Ура я испортил водку. Petya" + " " + man2.getBottle());

        Workers man3 = new Workers("Vasya", 0);
        System.out.println(man3.getInfo());
        man3.setBottle(5, shop);
        System.out.println("Ура я испортил водку. Vasya" + " " + man3.getBottle());

        System.out.println(shop.getInfo());
    }
}
