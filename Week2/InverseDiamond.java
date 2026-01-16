public class InverseDiamond {
    public static void main(String[] args) {

        int width = 15;
        int height = 8;

        for (int i = 3; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (!(j > width/2 - i && j < width/2 + i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 3; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (!(j > width/2 - (height - i + 2) && j < width/2 + (height - i + 2)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}