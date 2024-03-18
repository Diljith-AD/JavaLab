import java.io.*;
class FileReadWrite
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer= new FileWriter("t1.text",true);
			writer.write("Welcome");
			writer.close();
			FileReader reader= new FileReader("t1.text");
			BufferedReader br=new BufferedReader(reader);
			String line;
			System.out.println("Data read from the job");
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			reader.close();
			}
			catch(IOException e)
			{
				System.out.println("Error Occurred");
			}
		}
	}
			
