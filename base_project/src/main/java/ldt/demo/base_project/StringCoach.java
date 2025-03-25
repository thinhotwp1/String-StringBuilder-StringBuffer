package ldt.demo.base_project;

public class StringCoach {
    /**
     * String using String Iterning (String Pools) to performance system, where String create and store in a string pool, view example to clearly
     */
    public static void main(String[] args) {
        String a = "String";
        String b = "String";
        String c = new String("String");

        System.out.println("1. '==' compare address of 2 objects");
        System.out.println("a == b: " + (a == b)); // true because same address in String Interning - String Pools
        System.out.println("a == c: " + (a == c)); // false because create new String -> different object address

        System.out.println("2. 'equals' compare value of 2 objects");
        System.out.println("a equals b: " + a.equals(b)); // true because same value
        System.out.println("a equals c: " + a.equals(c)); // true because same value

        System.out.println("3. Put String c into String Interning - String Pools and compare with a again");
        c = c.intern();
        System.out.println("a == c: " + (a == c)); // true because same address in String Pools
    }

}
