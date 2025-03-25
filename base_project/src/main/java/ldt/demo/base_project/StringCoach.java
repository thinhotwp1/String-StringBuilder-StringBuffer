package ldt.demo.base_project;

public class StringCoach {
    /**
     * String using String Iterning (String Pools) to performance system, where String create and store in a string pool, view example to clearly
     */
    public static void main(String[] args) {
        String a = "String";
        String b = "String";
        String c = new String("String");

        // == compare address of objects
        System.out.println("a == b: " + (a == b)); // true because same address in String Interning - String Pools
        System.out.println("a == c: " + (a == c)); // false because create new String -> different object address

        // equals compare value of objects
        System.out.println("a equals b: " + a.equals(b)); // true because same value
        System.out.println("a equals c: " + a.equals(c)); // true because same value

        // Put String c to String Interning - String Pools and compare again
        System.out.println("Put c into String Interning - String Pools...");
        c = c.intern();
        System.out.println("a == c: " + (a == c)); // true because same address in String Pools
    }

}
