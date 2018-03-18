package net.albertoi.patterdesign.singleton;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestSingleton {

    @Mock
    private Singleton singletonMock;

    @Before
    public void setup(){
        singletonMock = Singleton.getInstance();

    }

    @Test
    public void testGetInstanceNotNull(){
        assertNotNull(singletonMock);
    }

    @Test
    public void testGetInstanceUnique(){
        assertEquals(singletonMock,Singleton.getInstance());
    }
}
