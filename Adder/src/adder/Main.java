package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide valid integers to add");
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
