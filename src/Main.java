public class Main {
    public static void main (String[] args) {
        for (int i = 0; i < 11; i = i + 1) {
            System.out.println (i);
        }


        for (int a = 10; a > 0; a = a - 1) {
            System.out.println (a);
            }

        for (int b = 2; b < 17; b = b +2 ) {
            System.out.println (b);
        }

        for (int c = 10; c > -11; c = c - 1) {
            System.out.println (c);
        }

        for (int d = 1904; d < 2097; d = d + 4 ) {
            System.out.println ( d + " год високосный");
        }

        for (int e = 7; e < 99; e = e + 7 ) {
        System.out.println (e);
        }

        for (int j = 1; j < 513; j = j * 2 ) {
            System.out.println (j);
        }

        int moneySaved = 29000;
        int total = 0;

        for (int l = 1; l < 13; l = l + 1) {
            total = total + moneySaved;
            System.out.println ( "Месяц " + l + " денег накоплено " + total);
        }

        int totalMoney = 0 ;
        for (int g = 1; g < 13; g = g + 1) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + moneySaved;
            System.out.println ( "Месяц " + g + " денег накоплено с процентами " + totalMoney);
        }


        for ( int x = 1; x < 11; x = x + 1) {
            int result = x * 2;
            System.out.println (result);


        }





    }
}