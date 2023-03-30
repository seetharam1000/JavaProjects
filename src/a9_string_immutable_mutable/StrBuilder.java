package a9_string_immutable_mutable;

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
