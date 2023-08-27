package Modulo_1.src.test;

import org.junit.Assert;
import org.junit.Test;

import Modulo_1.src.Actividad_2.utils.listaEnlazada;

import java.util.Optional;

public class ListaEnlazadaTest {
    
    @Test
    public void add1ElementTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        Assert.assertEquals(Optional.of(5), lista.get(0));
        Assert.assertEquals(1, lista.size());
    }

    @Test
    public void add2Element2Test(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        lista.add(78);
        Assert.assertEquals(Optional.of(5), lista.get(0));
        Assert.assertEquals(Optional.of(78), lista.get(1));
        Assert.assertEquals(2, lista.size());
    }
    @Test
    public void getNegativeIndexTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> lista.get(-1));
        Assert.assertEquals(1, lista.size());
    }

    @Test
    public void getIndexOutOfBoundsTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> lista.get(1));
        Assert.assertEquals(1, lista.size());
    }

    @Test
    public void containsElementsTest(){
            listaEnlazada lista = new listaEnlazada();
            lista.add(5);
            lista.add(78);
            Assert.assertTrue(lista.contains(78));
            Assert.assertTrue(lista.contains(5));
            Assert.assertEquals(2, lista.size());
    }

    @Test
    public void containsNotPResentElementsTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        lista.add(78);
        Assert.assertFalse(lista.contains(79));
    }

    @Test
    public void updateTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        lista.update(5, 78);
        Assert.assertFalse(lista.contains(5));
        Assert.assertTrue(lista.contains(78));
    }


    @Test
    public void removeEmptyTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.remove(5);
        Assert.assertEquals(0,lista.size());
    }
    @Test
    public void removeRootTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.remove(5);
        Assert.assertTrue(lista.contains(78));
        Assert.assertTrue(lista.contains(105));
        Assert.assertFalse(lista.contains(5));
        Assert.assertEquals(2,lista.size());
    }
    @Test
    public void removeMiddleTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.remove(78);
        Assert.assertTrue(lista.contains(5));
        Assert.assertTrue(lista.contains(105));
        Assert.assertFalse(lista.contains(78));
        Assert.assertEquals(2,lista.size());
    }
    @Test
    public void removeLastTest(){
        listaEnlazada lista = new listaEnlazada();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.remove(105);
        Assert.assertTrue(lista.contains(5));
        Assert.assertTrue(lista.contains(78));
        Assert.assertFalse(lista.contains(105));
        Assert.assertEquals(2,lista.size());

        
    }
    
}

