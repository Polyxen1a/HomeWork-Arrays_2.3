import static java.time.Year.isLeap;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "является високосным");
        } else {
            System.out.println("не является високосным");
        }
        class Methods {
            public void printIsLeapYear(int year) {
                boolean yearIsLeap = isLeap(year);
                printIsLeapYear(year, yearIsLeap);
            }

            private void printIsLeapYear(int year, boolean yearIsLeap) {
                if (yearIsLeap) {
                    System.out.println(year + " високосный");
                } else {
                    System.out.println(year + " не високосный");
                }
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2016;
        int clientOS = 0;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        class Methods_1 {
            public void recommendApplicationVersion(int clientOS, int deviceYear) {
                boolean deviceIsOld = isDeviceOld(deviceYear);
                System.out.println("Установите ");
                if (deviceIsOld) {
                    System.out.println("lite ");
                }
                System.out.println("версию для ");
                if (clientOS == 0) {
                    System.out.println("iOS");
                } else {
                    System.out.println("Android");
                }
            }
            private boolean isDeviceOld(int deviceYear) {
                return false;
            }

        }
        // Задание 3
        System.out.println("Задание 3");
        class Methods_2 {
            public void printIsLeapYear(int year) {
                boolean yearIsLeap = isLeap(year);
                printIsLeapYearResult(year, yearIsLeap);
            }

            private boolean isLeap(int year) {
                return year % 4 == 0 && year % 100 != 0 || (year & 400) == 0;
            }

            private void printIsLeapYearResult(int year, boolean yearIsLeap) {
                if (yearIsLeap) {
                    System.out.println(year + " високосный");
                } else {
                    System.out.println(year + " не високосный");
                }
            }

        }
    }
}

