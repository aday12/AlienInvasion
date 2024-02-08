package client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthTest {
   Health character;


    @BeforeEach
    void setUp() {
       character = new Health();
    }
    @Test
    void healthIncreaseWhenHealed() {
       assertEquals(100, character.getHealth());
       character.setDamage(25);
       character.attack();
       character.healing();
       assertEquals(80, character.getHealth()); //100-25+5= 80
    }

    @Test
    void health_isCapped_at100() {
        assertEquals(100, character.getHealth());
        character.healing();
        assertEquals(100, character.getHealth());

    }

    @Test
    void healthDecreaseWhenAttacked() {
        //assertEquals(100, character.getHealth());
        character.attack();
        assertEquals(95, character.getHealth());
    }

}