import java.io.*;

public class InspectFingerprint
{
	public static void main(String args[])
	{
		try
		{
			ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream(args[0]));
			Fingerprint f = (Fingerprint) objIStrm.readObject();
			System.out.println("Fingerprint: " + f);
		}
		catch(Exception e)
		{
			System.out.println("Exception during deserialization: " + e);
		}
	}
}
