public class Unit {
    protected String name;
    protected String surname;
    public Unit(String name) {
        Game.countOfUnits++;
        this.name=name;
    }
    public Unit(String name, String surname) {
        this(name);
        this.surname=name;
    }

    protected int helth=100;
    protected int defens=100; //броня
    protected int pover =10; //урон от удара
    protected float CriticalCanse=0.1f;
    protected float parryChanse = 0.1f; //отбить удар

    public float getHealse() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth; //this - данный объект
    }

    public int getHelth() {
        return helth;
    }

    public int getDefens() {
        return defens;
    }

    public int getPover() {
        return pover;
    }

    public float getCriticalCanse() {
        return CriticalCanse;
    }

    public float getParryChanse() {
        return parryChanse;
    }

    public void setDefens(int defens) {
        this.defens = defens;
    }

    public void setPover(int pover) {
        this.pover = pover;
    }

    public void setCriticalCanse(float criticalCanse) {
        CriticalCanse = criticalCanse;
    }

    public void setParryChanse(float parryChanse) {
        this.parryChanse = parryChanse;
    }
    public void attack(Unit unit){
        unit.getDemage(pover);
    }
    public void getDemage(int demege){
        this.helth-=demege;
        //logic
    }

    @Override
    public String toString() {
        return "Unit{" +
                "helth=" + helth +
                ", defens=" + defens +
                ", pover=" + pover +
                '}';
    }
}
