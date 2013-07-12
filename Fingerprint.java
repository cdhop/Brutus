import java.util.*;
import java.io.*;

public class Fingerprint implements Serializable
{
	Hashtable<String,Integer> char_set;
	int char_count;
	
	public Fingerprint(String message)
	{
		char_count  = 0;
		char_set = new Hashtable<String,Integer>();
		
		char_set.put("Z",0);
		char_set.put("Y",0);
		char_set.put("X",0);
		char_set.put("W",0);
		char_set.put("V",0);
		char_set.put("U",0);
		char_set.put("T",0);
		char_set.put("S",0);
		char_set.put("R",0);
		char_set.put("Q",0);
		char_set.put("P",0);
		char_set.put("O",0);
		char_set.put("N",0);
		char_set.put("M",0);
		char_set.put("L",0);
		char_set.put("K",0);
		char_set.put("J",0);
		char_set.put("I",0);
		char_set.put("H",0);
		char_set.put("G",0);
		char_set.put("F",0);
		char_set.put("E",0);
		char_set.put("D",0);
		char_set.put("C",0);
		char_set.put("B",0);
		char_set.put("A",0);

		message = message.toUpperCase();

		for(int i = 0; i < message.length(); i++)
                {
                        if(char_set.get(String.valueOf(message.charAt(i))) != null)
                        {
                                Integer count = char_set.get(String.valueOf(message.charAt(i)));
                                char_set.put(String.valueOf(message.charAt(i)), count + 1);
                                char_count++;
                        }
                }
	}

	public int getCharCount()
	{
		return char_count;
	}

	public String toString()
	{
		return char_set.toString();
	}
	
	public static void main(String args[])
	{
		if(args.length == 1)
		{
			Fingerprint f  = new Fingerprint(args[0]);
			System.out.println("Character count: " + f.getCharCount());
			System.out.println(f);
			
			try
			{
				ObjectOutputStream objStrm = new ObjectOutputStream(new FileOutputStream("bor"));
				objStrm.writeObject(f);
			}
			catch(IOException e)
			{
			
			}
		}
		else
		{
			System.out.println("Usage: java Fingerprint.class  message");
		}
	}
}
