

public class Main {
    public static void main(String[] args) {

        //задание 1

        //Напишите программу, которая выводит в консоль сумму накоплений.
        //Василий решил положить деньги на накопительный счет,
        // где каждый месяц к сумме его вклада добавляется ещё 7%.
        //Первоначальная сумма вклада Василия составляет 15 тысяч рублей.

        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от
        // накоплений не меняется, а всегда равен 7%. Выведите в консоль результат программы
        // с указанием суммы накоплений по каждому месяцу.

        int collect = 12_000_000;    // нужно собрать сумму 12 000 000, процент от накоплений не меняется
        int sum = 15000;             // первоначальная сумма вклада Василия
        int percent = 7;             // каждый месяц к сумме добавляется 7%
        int division = 100;
        int i = 0;

        while (sum <= collect) {
            sum = sum + sum / division * percent;
            i++;
            System.out.println(i + " " + sum);
        }



        }



    }
