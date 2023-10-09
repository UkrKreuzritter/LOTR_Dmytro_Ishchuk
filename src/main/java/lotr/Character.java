package lotr;
import kick.CryKick;
import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import kick.CryKick;
@Getter @Setter @ToString @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;
    public void kick (Character c)
    {
        kickStrategy.kick(this,c);
    }
    public void setHp(int hp)
    {
        this.hp = Math.max(hp, 0);
    }
    public String name()
    {
        return this.getClass().getSimpleName();
    }
    public String toString()
    {
        return this.getClass().getSimpleName()+"{hp="+hp+", power=" + power+"}";
    }
    
}
