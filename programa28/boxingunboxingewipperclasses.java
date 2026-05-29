package programa28;

public class boxingunboxingewipperclasses {
    public static void main(String[] args) {
        // Boxing
        int num = 10;
        Integer boxedNum = Integer.valueOf(num); // Boxing using valueOf method
        System.out.println("Boxed Integer: " + boxedNum);

        // Unboxing
        Integer anotherBoxedNum = 20; // Autoboxing
        int unboxedNum = anotherBoxedNum; // Unboxing using auto-unboxing
        System.out.println("Unboxed Integer: " + unboxedNum);
    }
}
