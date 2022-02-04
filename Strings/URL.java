package Strings;

public class URL {
    public static void main(String[] args) {
        String[] urls = {"https://vk.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        String protocol1 = "https";
        String protocol2 = "http";

        if (url.startsWith(protocol1)) {
            return protocol1;
        } else if (url.startsWith(protocol2)) {
            return protocol2;
        }
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        String domain1 = "com";
        String domain2 = "net";
        String domain3 = "org";
        String domain4 = "ru";

        if (url.endsWith(domain1)) {
            return domain1;
        } else if (url.endsWith(domain2)) {
            return domain2;
        } else if (url.endsWith(domain3)) {
            return domain3;
        } else if (url.endsWith(domain2)) {
            return domain4;
        } else if (url.endsWith(domain4)) {
            return domain4;
        }
        return "неизвестный";
    }
}
