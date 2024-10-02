package sep29_2024_hw;

public class third_task {
    public static void main(String[] args) {
        char[] ch = new char[]{'d', 'N', 'X', 't', 'm', 'H'};
        byte b = 0;
        for (char c : ch) {
            char vChar = Character.valueOf(c);
            if (vChar != Character.valueOf(c)) {
                b++;
            }
        }
        System.out.println("Количество гласных букв: " + b);
    }
}
