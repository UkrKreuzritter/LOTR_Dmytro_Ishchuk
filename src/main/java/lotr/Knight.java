package lotr;

import java.util.concurrent.ThreadLocalRandom;

import lombok.Getter;
import lombok.Setter;
import kick.MasterKick;
@Getter@Setter
public class Knight extends Character{
    public Knight()
    {
        super(ThreadLocalRandom.current().nextInt(2,12), ThreadLocalRandom.current().nextInt(2,12), new MasterKick());
    }
    
    
    
}
