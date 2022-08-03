public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
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
}