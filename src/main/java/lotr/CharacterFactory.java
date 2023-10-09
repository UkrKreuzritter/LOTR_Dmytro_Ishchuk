package lotr;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter()
    {
        double numba = Math.random();
        if (numba<=0.25)
            return new Elf();
        if (numba<=0.5)
            return new Hobbit();
        if (numba<=0.75)
            return new King();
        return new Knight();
    }
}
