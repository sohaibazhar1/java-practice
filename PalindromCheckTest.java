import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import Prog1Tools.GraphicScreen;

public class PalindromCheckTest
{
    private static final ByteArrayOutputStream fromConsole = new ByteArrayOutputStream();
    private static PipedOutputStream outputToConsole;
	private static PipedInputStream inputOfConsole;
	private static TestInputThread inputThread;
	
    @Before
    public void setUpTestCase()
    {	
    	try{
			outputToConsole = new PipedOutputStream();
        	inputOfConsole  = new PipedInputStream(outputToConsole);
			System.setIn(inputOfConsole);
			System.setOut(new PrintStream(fromConsole));
    	}catch(Exception e){System.err.println("Could not setup Streams");}
    }

    @After
    public void tearDownTestCase ()
    {
    	System.setOut(System.out);
    	System.setIn(System.in);
    }

    public static boolean testPassed;
    
    @Test
    public void InputOutputTest ()
    {	
    	testPassed = false;
    	
        String[] a = {""};
        inputThread = new TestInputThread(outputToConsole);
		inputThread.start();
        PalindromCheck.main(a);
		String myS  = fromConsole.toString();
        try{
        	boolean foundPalindrom = false;
        	BufferedReader reader = new BufferedReader(new StringReader(myS));
			String line = reader.readLine();
	        while (line != null) {
	        	//System.err.println("--------");
	        	//System.err.println(line);
	        	if(line.toLowerCase().contains("palindrom")){foundPalindrom = true;}
	        	line = reader.readLine();
	        	}
	        
	        if(foundPalindrom){ testPassed = true;}
	       	else if (!foundPalindrom){throw new AssertionError("Could not find the word 'palindrom' in output.");}
	       	
        }catch(Exception e){e.printStackTrace(); testPassed = false;}  

        
        assertTrue("Test was not Passed",testPassed);
    }
}

/**
 * This Thread runs in parallel to the expected main method
 * It simulates console input from a human being
 * the streams should have been send.
 */
class TestInputThread extends Thread{
	PipedOutputStream byteStreamToConsole;
	
	public TestInputThread(PipedOutputStream byteStreamToConsole){
		this.byteStreamToConsole = byteStreamToConsole;
	}

	public void run()
  	{	
  		try 
      	{	
        	sleep(1);
        	byteStreamToConsole.write("radar".getBytes());
        	byteStreamToConsole.write(System.lineSeparator().getBytes());
        	
        } 
      	catch (Exception e) {
      		System.err.println("Error in InputThread");
      		PalindromCheckTest.testPassed = false;
      	} 
  	}
}
