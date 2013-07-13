import java.io.*;

public class Character implements Serializable
{
        char ch;
        int count;
	float ratio;

        public Character(char c, int x)
        {
                ch = c;
                count = x;
		ratio = 0;
        }

        public char getCharacter()
        {
                return ch;
        }

        public int getCount()
        {
                return count;
        }

	public float getRatio()
	{
		return ratio;
	}

        public void setCount(int x)
        {
                count = x;
        }

	public void setRatio(float r)
	{
		ratio = r;
	}

        public String toString()
        {
                return ch + ": " + count + ": " + ratio;
        }
}
