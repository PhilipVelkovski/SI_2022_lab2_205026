import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testEveryPath() {
        List<String> odd =  Arrays.asList("1", "2", "3");

        List<String> even =  Arrays.asList("1", "2", "3","1", "2", "3","1", "2", "3");
        List<String> evenbombs =  Arrays.asList("1", "2", "#","1", "#", "#","1", "#", "3");

        RuntimeException ex;
        // 1-2 , 3 , 26    (1) // EX
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        //1-2 , 4-5 , 6 , 7 ,26 (2) // EX
        assertEquals(3d,SILab2.function(odd));



        //1-2, 4-5, 6, 8, 9-1, 9-2 , 10-11, 22-23, 9-3, 9-2;  sum = 0 NEMA BOMBI
       assertEquals(9d,SILab2.function(even));

        //1-2, 4-5, 6, 8, 9-1, 9-2 , 10-11, 12 , 13-14 , 21 , 9-3 == bombi i gore i dole
        assertEquals(9d,SILab2.function(evenbombs));

    }
    @Test
    void everyStatment(){
        List<String> odd =  Arrays.asList("1", "2", "3");

        List<String> even =  Arrays.asList("1", "2", "3","1", "2", "3","1", "2", "3");
        List<String> evenbombs =  Arrays.asList("1", "2", "#","1", "#", "#","1", "#", "3");
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        assertEquals(9d,SILab2.function(even));


        assertEquals(9d,SILab2.function(evenbombs));
    }
}