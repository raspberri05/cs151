import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.io.*;
import java.io.IOException;

/*
import static junit.framework.TestCase.*;
*/


public class UnitTest {
    ArrayList< ArrayList<Float> > m_scores = new ArrayList<> ();
    MyData  m_myData = new MyData();
        CurrentDisplay m_d1 ;
        HighestDisplay m_d2 ;
        AverageDisplay m_d3 ;
        LowestDisplay  m_d4 ;

    @Before
    public void initialize() throws FileNotFoundException {

        m_d1 = new CurrentDisplay( m_myData);
        m_d2 = new HighestDisplay( m_myData);
        m_d3 = new AverageDisplay( m_myData);
        m_d4 = new LowestDisplay( m_myData);
        List<Observer> observers = Arrays.asList ( m_d1, m_d2, m_d3,m_d4 );

        float [][] data = {
            {80,65,78.4f},
            {82,70,99.2f},
            {61,63,69.2f},
            {91,73,59.2f},
            {73,66,88.2f},
            {78,90,29.2f}
        } ;

        for ( float[] array : data ) {
            ArrayList<Float> a = new ArrayList<> ();
            for ( float b : array   ) {
                a.add ( b ) ;
            }
            m_scores.add ( a );
        }
	}

    @After
    public void cleanUp() {
        try {
        }
        catch (Exception ex) {
            System.out.println("Cleanup Files Error: " + ex);
        }
    }


    @Test
    public void test0_d1(){
        m_myData.setMeasurements( m_scores.get(0)  ) ;
		String key = "List of scores: [80.0, 65.0, 78.4]" ;
		assertEquals( key, m_d1.toString() );
    	System.out.println ( m_d1 );
    }

    @Test
    public void test0_d2(){
		String key = "Highest: 80.0" ;
        m_myData.setMeasurements( m_scores.get(0)  ) ;
		assertEquals( key, m_d2.toString() );
    	System.out.println ( m_d2 );
    }

    @Test
    public void test0_d3(){
		String key = "Average: 74.46667" ;
        m_myData.setMeasurements( m_scores.get(0)  ) ;
		assertEquals( key, m_d3.toString() );
    	System.out.println ( m_d3 );
    }

    @Test
    public void test0_d4(){
		String key = "Lowest: 65.0" ;
        m_myData.setMeasurements( m_scores.get(0)  ) ;
		assertEquals( key, m_d4.toString() );
    	System.out.println ( m_d4 );
    }

    @Test
    public void test1_d1(){
		String key = "List of scores: [82.0, 70.0, 99.2]" ;
        m_myData.setMeasurements( m_scores.get(1)  ) ;
		assertEquals( key, m_d1.toString() );
    	System.out.println ( m_d1 );
    }

    @Test
    public void test1_d2(){
		String key = "Highest: 99.2" ;
        m_myData.setMeasurements( m_scores.get(1)  ) ;
    	System.out.println ( m_d2 );
		assertEquals( key, m_d2.toString() );
    }

   @Test
    public void test1_d3(){
        String key = "Average: 83.73333" ;

        m_myData.setMeasurements( m_scores.get(1)  ) ;
        System.out.println ( m_d3 );
        assertEquals( key, m_d3.toString() );
    }

    @Test
    public void test1_d4(){
        String key = "Lowest: 70.0" ;
        m_myData.setMeasurements( m_scores.get(1)  ) ;
        System.out.println ( m_d4 );
        assertEquals( key, m_d4.toString() );
    }



}
