class Person {
    String name;
    int age;
    float height;
    float weight;
    String gender;
    static long population;
    Person(String name,int age,float height,float weight,String gender)
    {
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.gender=gender;
        population+=1;
    }
}
