package CollectionJenerics;

public class AutoboxingDemo {

    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueBox = Byte.valueOf((byte) 4);
    Short shortValueBox = Short.valueOf((short) 4);
    Integer integerValueBox = Integer.valueOf(4);
    Long longValueBox = Long.valueOf(254L);

    Float floatValueBox = Float.valueOf(2.4f);
    Double doubleValueBox = Double.valueOf(2.45);

    Character characterValueBox = Character.valueOf('w');
    Boolean booleanValueBox = Boolean.valueOf(true);


    public static void main(String[] args) {

    } // main(String[]) method

} // AutoboxingDemo class
