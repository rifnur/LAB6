public abstract class Animals {
    protected String name;
    protected String color;
    protected int age;
    protected int run;
  // protected int swim;
    protected int jump;

    public Animals (String name,String color, int age, int jump, int run){
        this.name=name;
        this.color=color;
        this.age=age;
        this.jump=jump;
        this.run=run;
    //    this.swim=swim;
    }
    public abstract void run(int run);
    public abstract void jump(int jump);
}
