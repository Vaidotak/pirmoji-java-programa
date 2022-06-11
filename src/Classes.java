public class Classes {
    public static void main(String[] args){


        boolean f = 8>7;
        System.out.println(f);

        Person person1 = new Person();
        person1.name = "Vaidotas";
        person1.age = 46;
        //System.out.println("Mano vardas " + person1.name + " ir man " + person1.age + " metai");
        person1.speak();
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Lina";
        person2.age = 47;
        //System.out.println("Mano žmonos vardas " + person2.name + ", ir jai " + person2.age + " metai");
        person2.speak();
    }
}
class Person{
    // klasė gali turėti
    // 1. duomenis (laukus) (pvz. amžius, ūgis, svoris, vardas ir t.t.)
    // 2. veiksmai (kuriuos gali atlikti, pvz. bėgti, šokti, kalbėti) (metodai)
    String name;
    int age;

    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("Mano vardas " +name + ", ir man " + age + " metai");}
    }
    void sayHello(){
        System.out.println("Labas");
    }
}