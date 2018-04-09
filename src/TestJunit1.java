import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunit1 {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    List<Integer> list1, list2, list3,
            extremalElement,
            randomElement,
            unsignedWithoutDoubles,
            signedWithoutDoubles,
            randomWithDoubles,
            randomAnd10Zeros,
            from1To100000,
            pusta,
            uninitialized,
            outOfRange,
            outOfRangeElement;

    @Test
    public void list1Test()  throws Exception{
        list1 = new LinkedList<>(Arrays.asList(1,3,6,4,1,2));
        assertEquals(5,Solution.solution(list1));
    }
    @Test
    public void list2Test()  throws Exception{
        list2 = new LinkedList<>(Arrays.asList(1,2,3));
        assertEquals(4,Solution.solution(list2));
    }
    @Test
    public void list3Test()  throws Exception{
        list3 = new LinkedList<>(Arrays.asList(-1,-3));
        assertEquals(1,Solution.solution(list3));
    }

    @Test
    public void extremalElementTest() throws Exception{
        extremalElement = new LinkedList<>(Arrays.asList(1000000));
        assertEquals(1000001,Solution.solution(extremalElement));
    }
    @Test
    public void oneRandomElementTest() throws Exception{
        randomElement = new LinkedList<>(Arrays.asList(-15));
        assertEquals(1,Solution.solution(randomElement));
    }
    @Test
    public void unsignedRandomWithoutDoublesTest() throws Exception{
        unsignedWithoutDoubles = new LinkedList<>(Arrays.asList(71,2222222,124444,654343,77677,1,2,7657757,3,8787878,4));
        assertEquals(5,Solution.solution(unsignedWithoutDoubles));
    }
    @Test
    public void signedRandomWithoutDoublesTest() throws Exception{
        signedWithoutDoubles = new LinkedList<>(Arrays.asList(-1,-666666,-3232,-5322,-1254,-14243,-443343));
        assertEquals(1,Solution.solution(signedWithoutDoubles));
    }
    @Test
    public void randomWithDoublesTest() throws Exception{
        randomWithDoubles = new LinkedList<>(Arrays.asList(71,-2222222,-1566,35423,1,1,5,7,34,8,9,15,2,6,3,4,6,6));
        assertEquals(10,Solution.solution(randomWithDoubles));
    }
    @Test
    public void randomAnd10ZerosTest() throws Exception{
        randomAnd10Zeros =  new LinkedList<>(Arrays.asList(71,2222222,1566,35423,1,1,5,7,34,9,15,2,6,3,4,6,6,0,0,0,0,0,0,0,0,0,0));
        assertEquals(8,Solution.solution(randomAnd10Zeros));
    }
    @Test
    public void from1to100000Test() throws Exception{
        from1To100000 = new LinkedList<>();
        for(int i=1;i<=100000;++i){
            ((LinkedList<Integer>) from1To100000).push(i);
        }
        assertEquals(100001,Solution.solution(from1To100000));
    }
    @Test
    public void emptyTest() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Lista pusta");
        pusta = new LinkedList<>();
        assertEquals(-1,Solution.solution(pusta));
    }
    @Test
    public void uninitializedTest() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Lista uninitialized");
        Solution.solution(uninitialized);

    }
    @Test
    public void outOfRangeTest() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Rozmiar listy spoza zakresu");
        outOfRange = new LinkedList<>();
        for(int i=0;i<100006;++i){
            outOfRange.add(1);
        }
        assertEquals(100001,Solution.solution(outOfRange));
    }
    @Test
    public void outOfRangeElementTest() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Element na liscie nie spelnia zalozen");
        outOfRangeElement = new LinkedList<>();
        outOfRangeElement.add(10000008);
        assertEquals(10000009,Solution.solution(outOfRangeElement));
    }


}