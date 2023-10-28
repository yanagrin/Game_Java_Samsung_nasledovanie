public class Wizard extends Unit{
    protected int mana =100; //q энергии

    public Wizard(String name) {
        super(name);
        pover=25;
        helth=80;
    }

    @Override
    public void attack(Unit unit) {

        if (mana>=10)
            super.attack(unit); //выполняем метод родительского класса
        mana-=10;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", helth=" + helth +
                ", defens=" + defens +
                ", pover=" + pover +
                ", parryChanse=" + parryChanse +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str+" "+this);
    }

}
