import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Операции над double/float");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");

            int operation = scanner.nextInt();
            switch (operation){
                case 1:{
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
                case 2:{
                    System.out.println("введите число");
                    double numb = scanner.nextDouble();
                        System.out.println( Math.round(numb));
                    break;
                }
                case 3:{
                    System.out.println("введите число");
                    double numb = scanner.nextDouble();
                    long numb3 = (long) numb;
                    System.out.println(numb3);


                    break;
                }
                default:
                    System.out.println("нет такой команды");
            }
        }
    }
}
