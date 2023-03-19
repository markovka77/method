public class Main {
    public static boolean isYearLong(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void printLinkApp(int os , int clientDeviceYear) {
        if (os == 0){
            if (  clientDeviceYear<=2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите приложение для iOS по ссылке");
            }
        }else{
            if (  clientDeviceYear>2015 ){
                System.out.println("Установите приложение для Android по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

    }
    public static int calDaysDelivery(int distance){
        if ( distance<20){
            return 1;
        } else if (distance<60) {
            return 2;
            
        } else if (distance<100) {
            return 3;
            
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int distance = 30;
        calDaysDelivery(distance);
        if (calDaysDelivery(distance) == 1){
            System.out.println("Потребуется дней "+calDaysDelivery(distance));
        } else if (calDaysDelivery(distance)==2) {
            System.out.println("Потребуется дней "+calDaysDelivery(distance));
        } else if (calDaysDelivery(distance)==3) {
            System.out.println("Потребуется дней "+calDaysDelivery(distance));

        }else {
            System.out.println("Доставки нет");
        }

    }

    private static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int clientDeviceYear= 2017;
        printLinkApp(os,clientDeviceYear);
    }

    private static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        if (isYearLong(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
