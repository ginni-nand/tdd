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
    @Test
    public void shouldCountAllVowelsInStringHavingVowels()
    {
        assertEquals(5,new VowelCounter().count("aeiou"));
    }
    @Test
    public void shouldCountVowelsIn StringWithVowelsAndConsonents()
    {
        assertEquals(4,new VowelCounter().count("hello everyone"));
    }
    @Test
    public void shouldCountVowelsInt StringWithBothUppercaseAndLowercaseCharacters()
    {
        assertEquals(12,new VowelCounter().count("hey HOW Is everyone"));
    }
}
