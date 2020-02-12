package edu.wsu.jenkinsfun;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    int a = 6;

    @Test
    public void multiply_isCorrect() {
        assertEquals(a, 3* 2);
    }
}
