public class Enter {
    public static void main(String[] args) {
        Animals cat = new Cat("Kitty", "Blue", 4,500,300);
        cat.jump(cat.jump);
        cat.run(cat.run);
       // cat.swim(cat.swim);
        Dog dog1 = new Dog ("Dog1","Black",5,100,700,50);
        dog1.jump(dog1.jump);
        dog1.run(dog1.run);
        dog1.swim(dog1.swim);
        DogSuper dogSuper = new DogSuper("Dog2", "White",1,1, 600,20);
        dogSuper.jump(dogSuper.jump);
        dogSuper.run(dogSuper.run);
        dogSuper.swim(dogSuper.swim);
    }
}
