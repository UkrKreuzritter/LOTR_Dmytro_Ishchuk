package kick;
import lotr.Character;
public class MasterKick implements KickStrategy {
    @Override
    public void kick (Character whoCick, Character whoIsKicked)
    {
        whoIsKicked.setHp(whoIsKicked.getHp()-whoCick.getPower());
    }
    
}
