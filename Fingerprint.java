import java.util.*;
import java.io.*;

public class Fingerprint implements Serializable
{
	ArrayList<Character> char_set;
	int char_count;
	
	public Fingerprint(String message)
	{
		char_count  = 0;
		char_set = new ArrayList<Character>();
		
		char_set.add(new Character('A',0));
		char_set.add(new Character('B',0));
		char_set.add(new Character('C',0));
		char_set.add(new Character('D',0));
		char_set.add(new Character('E',0));
		char_set.add(new Character('F',0));
		char_set.add(new Character('G',0));
		char_set.add(new Character('H',0));
		char_set.add(new Character('I',0));
		char_set.add(new Character('J',0));
		char_set.add(new Character('K',0));
		char_set.add(new Character('L',0));
		char_set.add(new Character('M',0));
		char_set.add(new Character('N',0));
		char_set.add(new Character('O',0));
		char_set.add(new Character('P',0));
		char_set.add(new Character('Q',0));
		char_set.add(new Character('R',0));
		char_set.add(new Character('S',0));
		char_set.add(new Character('T',0));
		char_set.add(new Character('U',0));
		char_set.add(new Character('V',0));
		char_set.add(new Character('W',0));
		char_set.add(new Character('X',0));
		char_set.add(new Character('Y',0));
		char_set.add(new Character('Z',0));

		message = message.toUpperCase();

		for(int i = 0; i < message.length(); i++)
                {
			for(int j=0; j < char_set.size(); j++)
			{
                        	if(char_set.get(j).getCharacter() == message.charAt(i))
                       		{	
					int count = char_set.get(j).getCount() + 1;
					char ch = char_set.get(j).getCharacter();
					char_set.set(j,new Character(ch,count));
					char_count++;
                        	}
			}
                }
	}

	public int getCharCount()
	{
		return char_count;
	}

	public String toString()
	{
		// Collections.sort(char_set);
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
			System.out.println("Usage: java Fingerprint  message");
		}
	}
}
