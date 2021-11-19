package TakeAwayChallengeJava;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TakeAwayTest {
    
        // @Test public void testGetsWordToGuess() {
        //     WordChoser mockedChoser = mock(WordChoser.class);
        //     Game game = new Game(mockedChoser);
        //     assertTrue(game.getWordToGuess() instanceof String);
        // }


        // As a customer
        // So that I can check if I want to order something
        // I would like to see a list of dishes with prices

        @Test public void testGetsListOfDishesWithPrices() {
            TakeAway takeaway = new TakeAway();
            // menu.main("Burger", 5);
            assertEquals(takeaway.m, "Burger", 5);
        }
}
