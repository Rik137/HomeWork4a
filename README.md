# Задача 2. Сравнение double
## Описание
Напишем программу для сравнения double, float и округления этих типов

#### Функционал программы
- Ввод номера желаемой операции (сравнить/округлить/отбросить дробную часть);
- Ввод двух чисел для сравнения (одно double, другое float) или одного (для округления или отброса дробной части);
- Вывод результата.
___Пример___
~~~
Операции над double/float
1. Сравнить
2. Округлить
3. Отбросить дробную часть

1 <enter>
Введите первое число:
0.33 <enter>
Введите второе число:
0.33 <enter>
Результат:
числа равны
~~~
### Процесс реализации
1. Я импортировал класс `Scanner` и создал объект типа `scanner` для общения с пользователем
~~~
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
~~~
2. При запуске программы вывел возможные операции над числами в бесконечном цыкле
~~~
   while(true){
            System.out.println("Операции над double/float");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");
~~~
3. Далее пользователь выбирает операцию которые оформлены при помощи условного оператора switch, после чего просим пользователя ввести два числа над которыми и будет производится выбронная операция
~~~
          int operation = scanner.nextInt();
            switch (operation){
                case 1:{//для сравнения — вычесть одно число из другого и проверить разницу с учётом погрешности; если они оказываются не равны, то указать какое из них больше;
                    System.out.println("введите число");
                    double numb = scanner.nextDouble();
                    System.out.println("введите второе число");
                    double numb2 = scanner.nextDouble();
                    double numb3 = numb - numb2;
                    if(numb3 == 0){
                        System.out.println("числа равны");
                    }else {
                        System.out.println("числа не равны");
                    }
                    break;
                }
                case 2:{//для округления — воспользуемся Math.round(value).
                    System.out.println("введите число");
                    double numb = scanner.nextDouble();
                        System.out.println( Math.round(numb));
                    break;
                }
                case 3:{//для отброса дробной части — можно привести к типу long;
                    System.out.println("введите число");
                    double numb = scanner.nextDouble();
                    long numb3 = (long) numb;
                    System.out.println(numb3);
                    break;
                }
                default:
                    System.out.println("нет такой команды");
~~~                    

4 .Выведем результат.
