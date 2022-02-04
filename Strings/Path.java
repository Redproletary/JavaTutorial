package Strings;

public class Path {public static void main(String[] args) {
    String path = "/usr/java/jdk1.8/bin";

    String jdk13 = "jdk-13";
    System.out.println(changePath(path, jdk13));
}

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
    }

}
