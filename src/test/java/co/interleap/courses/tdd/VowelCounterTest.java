package co.interleap.courses.tdd;

import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void shouldCountZeroWithAnEmptyString(){
            assertEquals(0, new VowelCounter().count(""));
    }
    @Test
    public void shouldCountSingleVowel()
    {
        assertEquals(1,new VowelCounter().count("u"));
    }
    public void shouldCountAllVowelsInStringHavingVowels()
    {
        assertEquals(5,new VowelCounter().count("aeiou"));
    }
}