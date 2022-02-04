package Functions;

public class Welcome {
    public static void main(String[] args) {

    }

    public static void signIn(String username){
        //напишите тут ваш код
        if (username == "user") {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
