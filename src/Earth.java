public class Earth {
    public static void main(String [] args)
    {
        Human tom = new Human();
        tom.name = "Tom Zsabo";
        tom.eyeColor = "Brown";
        tom.heightInInches = 120;
        tom.age = 10;
        tom.speak();

        Human joe = new Human();
        joe.name = "Joe Smith";
        joe.eyeColor = "Green";
        joe.heightInInches = 200;
        joe.age = 20;
        joe.speak();

    }
}
