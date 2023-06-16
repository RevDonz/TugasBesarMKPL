package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class AritmatikaTest {

  @Test
  public void testTambah() {
    Aritmatika aritmatika = new Aritmatika(15, 3);
    assertEquals(aritmatika.tambah(), 18);
  }

  @Test
  public void testKurang() {
    Aritmatika aritmatika = new Aritmatika(20, 10);
    assertEquals(aritmatika.kurang(), 10);
  }

  @Test
  public void testKali() {
    Aritmatika aritmatika = new Aritmatika(20, 5);
    assertEquals(aritmatika.kali(), 100);
  }

  @Test
  public void testBagi() {
    Aritmatika aritmatika = new Aritmatika(120, 4);
    assertEquals(aritmatika.bagi(), 30);
  }
}

