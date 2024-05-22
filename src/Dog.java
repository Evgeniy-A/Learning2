public class Dog {
    String name;
    int weight;
    int age;

    public Dog (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void print(){
        System.out.println(name + " " + weight + " " + age);
    }

}
