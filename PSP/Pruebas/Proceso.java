import java.io.IOException;
import java.util.Arrays;

public class Proceso
{
	public static void main(String[] args) throws IOException
	{
		if (args.length <= 0)
		{
			System.err.println("Introducir programa a ejecutar");
			System.exit(-1);
		}
		ProcessBuilder pb = new ProcessBuilder(args);
		try
		{
			Process process = pb.start();
			int retorno =process.waitFor();
			System.out.println("El proceso " + Arrays.toString(args) + " acabo con el valor " + retorno);
		}
		catch(IOException ex)
		{
			System.err.println("Error");
			System.exit(-1);
		}
		catch(InterruptedException ex)
		{
			System.err.println("Error");
			System.exit(-1);
		}
	}


}