public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    public  static void task1(){
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static  void task2(){
        int clientOS = 0;
        int clientDeviceYear = 2004;
        boolean deviceIsOld = clientDeviceYear < 2015;
        if (clientOS == 1 && deviceIsOld){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && !deviceIsOld) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && deviceIsOld) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && !deviceIsOld) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3(){
        int year = 2024;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if(isLeapYear){
            System.out.println(year + " год является високосным");
        } else{
            System.out.println(year + " год не является високоснм");
        }
    }

    public  static  void  task4(){
        int deliveryDistance = 95;
        int dayStep = 1;
        float distanceStep = 40f;
        int deliveryDays = dayStep * ((int)Math.ceil((deliveryDistance - 20) / distanceStep)) + 1;
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}