package a9_String_immutable_mutable;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("this")
                .append(" ")
                .append("java")
                .append(" ")
                .append("world")
                .append(" ")
                .append("StringBuilder");

        System.out.println(sb);
    }
}
