package Objects;

import java.util.Arrays;

public class MemoryDefragmentation {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String cell = array[i];
            if (cell == null) {
                int j = i + 1;
                while (j < array.length && array[j] == null)
                    j++;
                if (j < array.length) {
                    array[i] = array[j];
                    array[j] = null;
                }
            }
        }
    }
}
