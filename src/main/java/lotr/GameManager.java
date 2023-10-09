package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2)
    {
        System.out.println("And the battle between " + c1.name() + " and " + c2.name() + " begins!!!");
        while(c1.getHp()>0 && c2.getHp()>-0)
        {
            System.out.println("Current "+c1.name()+" hp: " + c1.getHp());
            System.out.println("Current "+c2.name()+" hp: " + c2.getHp());
            c1.kick(c2);
            System.out.println(c1.name() +" kicks his opponent and " + c2.name() + " has only " + c2.getHp() + " hp");
            c2.kick(c1);
            System.out.println(c2.name() +" kicks his opponent and " + c1.name() + " has only " + c1.getHp() + " hp");
        }
        if (c1.getHp() == 0 && c2.getHp()==0)
            System.out.println("What a tradegy!!!" + c1.name() + " and "+ c2.name()+" died during battle...");
        else if (c1.getHp()>0)
            System.out.println(c1.name() + " is a winner. Hooray hooray hooray!!!");
        else
            System.out.println(c2.name() + " is a winner. Hooray hooray hooray!!!");
    }
    public static void main (String [] args)
    {
        fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}
