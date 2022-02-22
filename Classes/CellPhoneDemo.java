package Classes;

import java.util.Objects;

public class CellPhoneDemo {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");
        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("телефоны одинаковые");
        }
    }
}

class CellPhone {
    String vendor;
    String model;

    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CellPhone)) return false;
        CellPhone cellPhone = (CellPhone) o;
        return vendor.equals(cellPhone.vendor) && model.equals(cellPhone.model);
    }


    @Override
    public int hashCode() {
        return Objects.hash(vendor, model);
    }
}
