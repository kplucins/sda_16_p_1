package pl.old;

import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        new Math().calc();
    }

    public void calc() {
        Scanner scanner = new Scanner(System. in);
        System.out.println("Podaj działanie:");
        String input = scanner. nextLine();
        System.out.println(plus(input));//2+2+2+2
//        String[] split = input.split(" * ");
//        System.out.println(split[0] + " " + split[1]);
    }

    private double calc(String var) {
        return plus(var);
    }

    private double multiply(String s) {
        String[] split = s.split("\\*");
        double v = 1;
        for (int i = 0; i < split.length; i++) {
            String t = split[i].trim();
            v = Double.valueOf(t) * v;
        }
        return v;
    }

    private double minus(String s) {
        String[] split = s.split("\\-");
        double v = 0;
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                if ("".equals(split[i].trim())) {
                    continue;
                }
                v = Double.valueOf(split[i].trim());
            } else {
                if (split[i].trim().contains("*")) {
                    v += multiply(split[i].trim());
                } else {
                    v -= Double.valueOf(split[i].trim());
                }
            }
        }
        return v;
    }

    private double plus(String input) {
        String[] split = input.split("\\+");
        double v = 0;
        for (int i = 0; i < split.length; i++) {
            String t = split[i];
            if (t.contains("-")) {
                v += minus(t);
            } else if (t.contains("*")) {
                v += multiply(t);
            } else {
                v += Double.valueOf(t.trim());
            }
        }
        return v;
    }





    private double divide(String s) {
        String[] split = s.split("\\/");
        double v = 0.0;
        for (int i = 0; i < split.length; i++) {
            String t = split[i].trim();
            if (i == 0) {
                v = Double.valueOf(t);
            } else {
                v = v / Integer.valueOf(t);
            }
        }
        return v;

    }

}
