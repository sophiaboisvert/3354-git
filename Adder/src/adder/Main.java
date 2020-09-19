package adder;

public class Main {

    public static void main(String[] args) {
	    try{
            int result = addArguments(args);
            System.out.println(result);
    	    } catch (ArrayIndexOutOfBoundsException e) {
		    System.err.println("Not enough arguments");
	    } catch (NumberFormatException e){
	    	System.err.println("Invalid argument.");
	    }
	}

    private static int addArguments(String[] args) {
        int sum = 0;
	boolean subtract = false;
	if(args[0].compareTo("-") == 0)
	{
		subtract = true;
	}
	for(int i = 0; i < args.length; i++)
	{
		if(!subtract)
			sum += Integer.valueOf(args[i]);
		else if(i != 0)
		{
			sum -= Integer.valueOf(args[i]);
		}
	}
	return sum;
    }
}
