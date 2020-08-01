public class DogSuper extends Dog{

    public DogSuper(String name, String color, int age, int jump, int run, int swim) {
        super(name, color, age, jump, run, swim);
    }

    @Override
    public void run(int run) {
        //super.run(run);
        if (run<=600 && run>0) {
            System.out.println("run: "+true);
            System.out.println(String.format("Собака %s пробежала %s м.",this.name, this.run));
        } else if (run>600) {
            System.out.println("run: "+false);
            System.out.println(String.format("Собака %s не может пробежать больше 600 м.",this.name));
        }
    }

    @Override
    protected void swim(int swim) {
        //super.swim(swim);
        if (swim<=20 && swim>0) {
            System.out.println("swim: "+true);
            System.out.println(String.format("Собака %s проплыла %s м.",super.name,this.swim));
        } else if (swim>20 && swim>0) {
            System.out.println("swim: "+false);
            System.out.println(String.format("Собака  %s не может проплыть больше 20 м.",super.name));
        }
    }

    @Override
    public void jump(int jump) {
    //    super.jump(jump);
        this.jump=jump;
        if (jump>0 && jump <=1) {
            System.out.println("jump: "+true);
            System.out.println(String.format("Собака %s прыгнула на %s метров.",super.name,super.jump));
        }
         else if (jump>1 && jump>0) {
            System.out.println("jump: "+false);
            System.out.println(String.format("Собака %s не может прыгнуть на %s метра.",super.name,super.jump));
        }
    }
}
