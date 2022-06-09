public class Main {

    public static void main(String[] args) {
        int a = 10;
        a++;
        int b = 9;
        b += 1;
        float rez = a * b;
        System.out.println(rez);
        String tekstas = "pavarde";
        System.out.println(tekstas.charAt(2));
        System.out.println(tekstas.length());

        String s = "Mano vardas Vaidotas";
        System.out.println(s.substring(12));
        System.out.println(s.substring(0, 4));

    }
}