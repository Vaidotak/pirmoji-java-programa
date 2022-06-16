public class Main {

    public static void main(String[] args) {
        int a = 1;
        a++;
        int b = 1;
        b += 1;
        float rez = a * b;
        System.out.println(rez);
        String tekstas = "pavarde";
        System.out.println(tekstas.charAt(2));
        System.out.println(tekstas.length());
        System.out.println(tekstas);

        String s = "Mano vardas Vaidotas";
        System.out.println(s.substring(12));
        System.out.println(s.substring(0, 4));

        //3 paskaita
        Figura figura = new Figura();
        figura.setPavadinimas("Kvadratas");
        figura.setPlotis(20);
        figura.setAukstis(30);
        System.out.println(figura.toString());

        Figura figura1 = new Figura();
        figura1.setPavadinimas("Staciakampis");
        figura1.setPlotis(50);
        figura1.setAukstis(10);
        System.out.println(figura1);
    }

}