package kick;
import lotr.Character;
public class ElfKick implements KickStrategy {
    @Override
    public void kick (Character whoCick, Character whoIsKicked)
    {
        if (whoCick.getPower()>whoIsKicked.getPower())
            whoIsKicked.setHp(0);
        else
            whoCick.setPower(whoCick.getPower()-1);
    }
    
}
