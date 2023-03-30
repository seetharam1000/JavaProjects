package a9_string_immutable_mutable;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this")
                .append(" ")
                .append("java")
                .append(" ")
                .append("world")
                .append(" ")
                .append("StringBuffer");

        System.out.println(sb);
    }
}
