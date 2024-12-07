package dec03_2024_Exceptions.Passwords;

public class Passwords {
    private static final String PASSWORD_LENGTH = "Длинна пароля должна быть от 8 до 20 символов";
    private static final String BIG_LETTER = "Пароль должен содержать хотя бы одну большую букву";
    private static final String SMALL_LETTER = "Пароль должен содержать хотя бы одну маленькую букву";
    private static final String NUMBER = "Пароль должен содержать хотя бы одну цифру";
    private static final String SPACELESS = "В пароле не должно быть пробелов";

    public static void main(String[] args) {
        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020" };
        passwordChecking(passwords);
    }

    public static void passwordChecking(String[] passwords) {
        String finalPassword = "";

        for (String password : passwords) {
            StringBuilder sb = new StringBuilder();
            if (!(password.length() > 8 && password.length() < 20)) {
                sb.append(PASSWORD_LENGTH).append(", ");
            }
            if (password.toLowerCase().equals(password)) {
                sb.append(BIG_LETTER).append(", ");
            }
            if (password.toUpperCase().equals(password)) {
                sb.append(SMALL_LETTER).append(", ");
            }
            if (password.replaceAll("[^1-9]", "").isBlank()) {
                sb.append(NUMBER).append(", ");
            }
            if (!(password.replaceAll(" ", "").length() == password.length())) {
                sb.append(SPACELESS).append(", ");
            }
            if (sb.isEmpty()) {
                System.out.println("Пароль успешно сохранён!");
            } else {
                System.out.println("Пароль не соответствует нашим требованиям. Пожалуйста, поменяйте его.");
            }
        }
    }
}
