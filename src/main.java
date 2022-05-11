class Main {
    public static void main ( String[] args ) {
        int account = 100;
        int amount = 1700;
        int bonus;
        int summ;
        if (amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        summ = account + amount + bonus;
        System.out.println ( " Сумма счета: " + summ );
    }
}