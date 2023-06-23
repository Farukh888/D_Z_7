public abstract class Hero implements HavingSuperAbility{
    int Health;
    int Damage;
    String syperAbility;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSyperAbility() {
        return syperAbility;
    }

    public void setSyperAbility(String syperAbility) {
        this.syperAbility = syperAbility;
    }
}
