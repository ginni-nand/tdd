package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String s)
    {
        final String Regex="(?i[^aeiou]+";
        return s.replaceAll(Regex,"").length();
    }

}
