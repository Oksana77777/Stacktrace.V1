import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("★☆★★☆★ ★☆★★☆★ ★☆★★☆★ ★☆★★☆★ ★☆★★☆");
        String[] products = {"№-1 \uD83C\uDF5E Хлеб   \uD83D\uDC49 ", "№-2 \uD83C\uDF4F Яблоки \uD83D\uDC49 ", "№-3 \uD83C\uDF76 Молоко \uD83D\uDC49 "};
        int[] prices = {100, 200, 300};

        int[] sum1 = new int[]{0, 0, 0};
        int[] count = new int[]{0, 0, 0};

        int productNumber = 0;
        int productCount = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + " рублей за штуку \uD83D\uDE0B ");
        }

        while (true) {
            System.out.println("★☆★★☆★ ★☆★★☆★ ★☆★★☆★ ★☆★★☆★ ★☆★★☆");
            System.out.println("Введите номер и количество товара через пробел или end для выхода из программы:");
            String input = scanner.nextLine();
            if ("end".equals(input)) {

                break;
            }
            try {
                String[] split = input.split(" ");

                if (split.length != 2) { // внесла исправление
                    System.out.println("Введен недопустимый номер товара!");
                    continue;
                }
                String a = split[0];//до пробела, чтобы получить номер продукта
                productNumber = Integer.parseInt(a) - 1;


                String b = split[1];//после пробела, чтобы получить количество
                productCount = Integer.parseInt(b);


                sum1[productNumber] = prices[productNumber] * productCount;
                count[productNumber] = productCount;

            } catch (NumberFormatException e) {
                System.out.println("Введите целое число!");
                continue;
            }
            if (productNumber > products.length) {
                System.out.println("Вы ввели неверный номер товара");
            }
        }
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(
                        products[i] + " " +
                                prices[i] + " рублей за " +
                                count[i] + " шт \uD83D\uDC49  " +
                                (count[i] * prices[i]) + " рублей "
                );
                sum += count[i] * prices[i];
            }
        }

        System.out.println("Итого: " + sum + " рублей.");
        System.out.println("Программа завершена.");
    }
}
