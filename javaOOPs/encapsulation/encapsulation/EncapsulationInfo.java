package encapsulation;

public class EncapsulationInfo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(5000);
        System.out.println("Price is: " + l1.getPrice());
    }

    // If we cann't give any access specifier then it is "default" access
    // specifier(it can visible only in same package or in their sub-packages)
    // public specifier it can visible in same and other packages also
    // private specifier it can access only by same class only in same package
    // protected specifier :any variable or fuction if it is protected in a parent
    // class then it can access only by their child classess only
    // its children may be present in other packages also

    public void doWork() {
        System.out.println("Encapsulation Work.");
    }

}

class Laptop {
    int ram;
    // we add encapsulation on price variable.So, we make it private
    // here we hide the data.
    private int price;

    // to access price variable we make getter and setter

    public void setPrice(int price) {
        // apply validation on price
        // boolean isAdmin = false;
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("You Cann't set the price.");
        } else {

            this.price = price;
        }
    }

    public int getPrice() {
        return this.price;
    }

}
