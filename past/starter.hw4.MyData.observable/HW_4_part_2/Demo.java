import java.util.* ;

public class Demo {

	public static void main(String[] args) {
		MyData  m_myData = new MyData();
		
		CurrentDisplay d1 = new CurrentDisplay( m_myData);
		HighestDisplay d2 = new HighestDisplay( m_myData);
		AverageDisplay d3 = new AverageDisplay( m_myData);
		LowestDisplay  d4 = new LowestDisplay( m_myData);
		List<Observer> observers = Arrays.asList ( d1, d2, d3,d4 );

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
			m_myData.displayObservers();
			System.out.println ( s );
		}

		for ( Observer o: observers  ) {
			System.out.println ( "remove " + o.getClass().getSimpleName()  );
		 	m_myData.deleteObserver ( o );
		 	m_myData.setMeasurements( m_scores.get(0)  ) ;    
			m_myData.displayObservers();
			System.out.println ( s );
        } ; 
	}
}
