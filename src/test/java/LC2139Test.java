import static org.junit.Assert.*;

public class LC2139Test {

    @org.junit.Test
    public void minMoves() {

        int actual1 = LC2139.minMoves(5,0);
        int actual2 = LC2139.minMoves(19,2);
        int actual3 = LC2139.minMoves(10,4);

        assertEquals(4,actual1);
        assertEquals(7,actual2);
        assertEquals(4,actual3);
    }
}