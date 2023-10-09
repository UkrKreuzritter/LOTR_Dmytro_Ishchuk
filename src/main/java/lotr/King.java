package lotr;

import lombok.Setter;
import lombok.Getter;
import java.util.concurrent.ThreadLocalRandom;

import kick.MasterKick;

@Setter@Getter
public class King extends Character{
    public King()
    {
        super(ThreadLocalRandom.current().nextInt(5,15), ThreadLocalRandom.current().nextInt(5,15), new MasterKick());
    }
}
