import org.w3c.dom.ls.LSOutput;

public class Cat extends Animals{
  public Cat (String name,String color, int age, int jump, int run){
      super(name,color,age,jump,run);
  }

    @Override
    public void run(int run) {
      if (run<=200 && run>0) {
          System.out.println("run: "+true);
          System.out.println(String.format("Кошка %s пробежала %ы метров.",this.name, this.run));
      } else if (run>200) {
          System.out.println("run: "+false);
          System.out.println(String.format("Кошка может пробежать только 200 метров.",this.name));
      }
    }

    @Override
    public void jump(int jump) {
      this.jump=jump;
      if (jump>2 && jump>0) {
          System.out.println("jump: "+false);
          System.out.println(String.format("Кошка %s не может прыгнуть на %s метров.",super.name,super.jump));
      } else if (jump<=2 && jump>0) {
          System.out.println("jump: "+true);
          System.out.println(String.format("Кошка %s прыгнула на %s метров.",super.name,super.jump));
      }

    }

    ;
}
