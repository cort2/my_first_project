package lesson5;

import java.io.*;
import java.util.Random;

public class HomeWork_3 {
    public static void main(String[] args) throws IOException {
        //Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        Vaz vaz = new Vaz();
        Toyota toyota = new Toyota();
        Cars[] cars = {vaz, toyota};
        for (Cars car : cars) {
            car.run();
            car.stop();
            car.light();
            if(car instanceof Vaz) {
                Vaz notMyVaz = (Vaz) car;
                notMyVaz.breaksDown();
            } else if (car instanceof Toyota) {
                Toyota myToyota = (Toyota) car;
                myToyota.turnsOnMusic();
            }
        }
        //Задача №2
        //Необходимо:
        // 1. Создать папку resource, пометить ее как папку Resourсe root.
        // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        FileReader fileReader = new FileReader("D:\\java\\repos\\my_first_project\\resource\\my_first_file.txt");
        String result = "";
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            String readLine = bufferedReader.readLine();
            result += readLine + " ";
        }
        System.out.println(result);
        fileReader.close();

        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300
        Financialrecord financialrecord = new Financialrecord(500,300);
        FileWriter fileWriter = new FileWriter("D:\\java\\repos\\my_first_project\\resource\\report.txt");
        fileWriter.write( financialrecord.getIncomes() + ";" + financialrecord.getOutcomes() + ";");
        fileWriter.close();

        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.

        Cars[] cars1 = new Cars[40];
        for (int i = 0; i < 20; i++) {
            cars1[i] = CarFactory.createVaz();
            cars1[i + 20] = CarFactory.createToyota();
            }
        for (int i = 0; i < cars1.length; i++) {
            if(cars1[i] instanceof Vaz) {
                ((Vaz) cars1[i]).breaksDown();
            } else if (cars1[i] instanceof Toyota) {
                ((Toyota) cars1[i]).turnsOnMusic();
            }
        }

        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt() )
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        Random random = new Random(1);
        Financialrecord[] financialrecord1 = new Financialrecord[10];
        FileWriter fileWriter1 = new FileWriter("D:\\java\\repos\\my_first_project\\resource\\report.txt",
                true);
        for (int i = 0; i < financialrecord1.length; i++) {
            financialrecord1[i] = new Financialrecord(random.nextInt(200), random.nextInt(100));
            fileWriter1.write( financialrecord1[i].getIncomes() + ";" + financialrecord1[i].getOutcomes() + ";");
        }
        fileWriter1.close();
        FileReader fileReader1 = new FileReader("D:\\java\\repos\\my_first_project\\resource\\report.txt");
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        String myResult = bufferedReader1.readLine();
        fileReader1.close();
        String[] arrayResult = myResult.split(";");
        int income = 0;
        int outcome = 0;
        for (int i = 0; i < arrayResult.length - 1; i += 2) {
            income += Integer.parseInt(arrayResult[i]);
            outcome += Integer.parseInt(arrayResult[i + 1]);
        }
        System.out.println("Общие доходы " + income + " Общие расходы " + outcome);

    }
}






