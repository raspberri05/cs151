import java.util.* ;

public class Demo {

    public static void displayObservers( List <Observer> observers) {
        for (Observer o : observers) {
            System.out.println(o);
        }
    }

	public static void main(String[] args) {
		
		CurrentDisplay d1 = new CurrentDisplay( );
		HighestDisplay d2 = new HighestDisplay( );
		AverageDisplay d3 = new AverageDisplay( );
		LowestDisplay  d4 = new LowestDisplay( );
		List<Observer> observers = Arrays.asList ( d1, d2, d3,d4 );

		MyData  m_myData = new MyData();
		for (Observer o: observers) {
			m_myData.addObserver(o);
		}

		float [][] data = { 
			{80,65,78.4f},
			{82,70,99.2f},
			{61,63,69.2f},
			{91,73,59.2f},
			{73,66,88.2f},
			{78,90,29.2f} 
        } ; 
		ArrayList< ArrayList<Float> > m_scores = new ArrayList<> ();
		for ( float[] array : data ) { 
			ArrayList<Float> a = new ArrayList<> ();
			for ( float b : array   ) { 
				a.add ( b ) ;
			}
			m_scores.add ( a );
		}
		
		String s = "=".repeat ( 60 );
		System.out.println ( s );
		for ( ArrayList<Float> b: m_scores ) {
		 	m_myData.setMeasurements( b  ) ;    
			displayObservers( observers );
			System.out.println ( s );
		}

		for ( Observer o: observers  ) {
			System.out.println ( "remove " + o.getClass().getSimpleName()  );
		 	m_myData.deleteObserver ( o );
			System.out.println ( "number of observers = " + m_myData.countObservers() );
        } ; 
	}
}
