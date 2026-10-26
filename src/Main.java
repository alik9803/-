import java.util.Scanner;

void main(String[] args) {
    //task1();
     // task2();
     // task3();
        task4();
}
      // Задание 1 Линейный расчёт
public static void task1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество страниц (n):");
        int n = scanner.nextInt();

        System.out.println("Введите цену одной страницы в рублях (p):");
        double p = scanner.nextInt();

        System.out.println("Введите стоимость подготовки файла в рублях (b):");

        double b = scanner.nextInt();
        double baseCost = n * p;
        double discount = baseCost * 0.10;
        double totalCost = (baseCost - discount) + b;

        System.out.println("Основная стоимость:" + baseCost + "руб.");
        System.out.println("Скидка в рублях:" + discount + "руб.");
        System.out.println("Итог к оплате:" + totalCost + "руб.");
    }

    // Задание 2 Полное условие if и else
public static void task2(){
            double S = 400;
            int status = 0;

            if (S >= 500 || status == 0) {
                double total = S * 0.95;
                System.out.println("Скидка предоставлена. Сумма к оплате: " + total + " руб.");
            } else {
                double total = S;
                System.out.println("Скидки нет. Сумма к оплате: " + total + " руб.");
            }
        }

// Задание 3 Цепочка условий
public static void task3(){
    Scanner scanner = new Scanner(System.in);
    if (!scanner.hasNextInt()) {
        System.out.println("Ошибка диапазона");
        scanner.close();
        return;
    }

    int x = scanner.nextInt();
    if (x < 0 || x > 1000) {
        System.out.println("Ошибка диапазона");

    } else if (x >= 0 && x <= 99) {
        System.out.println("Малый заказ");

    } else if (x >= 100 && x <= 499) {
        System.out.println("Средний заказ");

    } else {
        System.out.println("Крупный заказ");
    }
}

// Задание 4 Выбор тарифа switch
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступные тарифы:");
        System.out.println("1 — Чёрно-белая печать, 5 руб.");
        System.out.println("2 — Цветная печать, 20 руб.");
        System.out.println("3 — Фотопечать, 60 руб.");

        System.out.print("Введите код тарифа: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Неизвестный код");
            return;
        }
        int code = scanner.nextInt();

        System.out.print("Введите количество страниц (1–1000): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Неизвестный код");
            return;
        }
        int n = scanner.nextInt();
        if (n < 1 || n > 1000) {
            System.out.println("Неизвестный код");
            return;
        }

        double pricePerUnit;
        switch (code) {
            case 1 -> pricePerUnit = 5.0;
            case 2 -> pricePerUnit = 20.0;
            case 3 -> pricePerUnit = 60.0;
            default -> {
                System.out.println("Неизвестный код");
                return;
            }
        }

        double total = n * pricePerUnit;
        System.out.println(" Цена за единицу: " + pricePerUnit + " руб");
        System.out.println(" Итого: " + total + " руб");

    }