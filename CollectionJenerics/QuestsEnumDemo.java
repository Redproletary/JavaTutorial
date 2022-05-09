package CollectionJenerics;

public class QuestsEnumDemo {
    public static void main(String[] args) {
        // massive of Variable enum

        QuestsEnum[] values = QuestsEnum.values();

        // enumeration of values
        for (QuestsEnum value : values) {
            System.out.println(value);
        }

        // enumeration of numbers of values
        for (QuestsEnum value : values) {
            System.out.println(value.ordinal());
        }
    } // main(String[]) method

} // QuestsEnumDemo class
