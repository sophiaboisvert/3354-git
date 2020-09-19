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
	for(int i = 0; i < args.length; i++)
	{
		sum += Integer.valuesOf(args[0]);
	}
	return sum;
    }
}
