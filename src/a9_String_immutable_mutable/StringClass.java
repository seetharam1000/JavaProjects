package a9_String_immutable_mutable;

public class StringClass {
    public static void main(String[] args) {
        String department = "Production";
        department.concat("Quality");

        System.out.println("Immutable ==>   " + department);


        department = department.concat("Quality");
        System.out.println("After concatination ==>   " + department);
    }
}
