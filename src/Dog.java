public class Dog extends Animals {
   int swim;
    public Dog(String name, String color, int age, int jump, int run, int swim) {
       super(name, color, age,jump,run);
       this.swim=swim;
    }

    @Override
    public void run(int run) {
        if (run<=500 && run>0) {
            System.out.println(String.format("Собака %s пробежала %s м.", this.name, this.run));
        } else if (run>500) {
            System.out.println(true);
            System.out.println(String.format("Собака %s не может пробежать больше 500 м.",this.name));
                            }
        }

//    @Override
    protected void swim(int swim) {
        if (swim<=10 && swim>0) {
            System.out.println("swim: "+true);
            System.out.println(String.format("Собака %s проплыла %s м.",super.name,this.swim));
        } else if (swim>10 && swim>0) {
            System.out.println("swim: "+false);
            System.out.println(String.format("Собака  %s не может проплыть больше 10 м.",super.name));
        }
    }

    @Override
    public void jump(int jump) {
        this.jump=jump;
        if (jump>0 && jump <=0.5) {
            System.out.println("jump: "+true);
            System.out.println(String.format("Собака %s прыгнула на %s метров.",super.name,super.jump));
        }
        else  if (jump>0.5 && jump>0) {
            System.out.println("jump: "+false);
            System.out.println(String.format("Собака %s не может прыгнуть на %s метра.",super.name,super.jump));
        }

    }

}
