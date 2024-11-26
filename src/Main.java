//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадача 1:");
        byte clientOS = 0;
        String nameOS = "Вашей системы";
        if (clientOS == 0) {
            nameOS = "iOS";
        } else if (clientOS == 1) {
            nameOS = "Android";
        }
        System.out.println("clientOS = " + clientOS + "\nУстановите версию приложения для " + nameOS + " по ссылке");

        //Задача 2
        System.out.println("\nЗадача 2:");
        clientOS = 1;
        short clientDeviceYear = 1856;
        String lightVersion = "";
        if (clientOS == 0) {
            nameOS = "iOS";
        } else if (clientOS == 1) {
            nameOS = "Android";
        }
        if (clientDeviceYear < 2015) {
            lightVersion = "облегченную ";
        }
        System.out.println("clientOS = " + clientOS + "\nclientDeviceYear = " + clientDeviceYear + "\nУстановите " + lightVersion + "версию приложения для " + nameOS + " по ссылке");

        //Задача 3
        System.out.println("\nЗадача 3:");
        short year = 21200;
        String isLeap = "";
        if (year % 4 != 0 || year <= 1584 || ((year % 100 == 0) && (year % 400 != 0))) {
            isLeap = "не ";
        }
        System.out.println(year + " год " + isLeap + "является високосным");

        //Задача 4
        System.out.println("\nЗадача 4:");
        int deliveryDistance = 95;
        System.out.println("Расстояние от офиса до адреса доставки - " + deliveryDistance + " км");
        int deliveryDays = (int) 1 + (deliveryDistance + 19) / 40;
        if (deliveryDistance<=100) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Задача 5
        System.out.println("\nЗадача 5:");
        int monthNumber = 12;
        String season = "";
        switch (monthNumber) {
            case 1,2,12:
                season = "зима";
                break;
            case 3,4,5:
                season = "весна";
                break;
            case 6,7,8:
                season = "лето";
                break;
            case 9,10,11:
                season = "осень";
                break;
            default:
                season = "не определено";
                break;
        }
            System.out.println("monthNumber = " + monthNumber + "\nВремя года - " + season);
    }
}