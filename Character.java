import java.io.*;

public class Character implements Serializable
{
        char ch;
        int count;

        public Character(char c, int x)
        {
                ch = c;
                count = x;
        }

        public char getCharacter()
        {
                return ch;
        }

        public int getCount()
        {
                return count;
        }

        public void setCount(int x)
        {
                count = x;
        }

        public String toString()
        {
                return ch + ": " + count;
        }
}
