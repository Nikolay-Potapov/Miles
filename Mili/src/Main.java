public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли
     int ticketPrice = 11_000;
     int oneMiles = 1;
        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int total = ticketPrice / 20 * oneMiles;
        System.out.println("Начисленные мили = " + total);
    }
}
