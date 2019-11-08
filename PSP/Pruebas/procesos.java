import java.io.IOException;

public class procesos{
	public static void main(String[] args)
	{
		ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "Powershell ps > hola.txt");
		try
		{
			pb.start();
			}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			}
		}
	}