import java.io.IOException;

public class p2{
	public static void main(String[] args)
	{
		ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "ipconfig > hola.txt");
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

------------------------------------------------------------

#include <stdio.h>
#include <stdlib.h>

void main(int argc, char *argv[]){
	printf("listado");
	printf("%d", system("ls > fichsalida"));
        printf("%d",system("nano fichsalida"));
}