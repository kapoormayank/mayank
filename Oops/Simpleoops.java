public class Simpleoops{
    public static void main(String[] args) {
        Person human1 = new Person("Tyson",16,5.5f,80.4f,"Male");
        System.out.println(human1.name+" "+human1.age+" "+human1.height+" "+human1.weight+" "+human1.gender);
        Person human2 = new Person("Ray",17,5.4f,74.3f,"Male");
        System.out.println(human2.name+" "+human2.age+" "+human2.height+" "+human2.weight+" "+human2.gender);
        Person human3 = new Person("Kai",18,5.8f,72.6f,"Male");
        System.out.println(human3.name+" "+human3.age+" "+human3.height+" "+human3.weight+" "+human3.gender);
    }
}
