package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("not enough arguments");
        } catch (NumberFormatException e) {
	    System.err.println("Invalid argument");
	}
    }

    private static int addArguments(String[] args) {
	int sum = 0;
	for(int i = 0; i < args.length; i++)
	{
		sum += Integer.valueOf(args[i]);
	}
	return sum;
    }
}
