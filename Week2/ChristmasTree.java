public class ChristmasTree {
    public static void main(String[] args) {

        int width = 9;
        int height = 6;

        int temp = 0;

        System.out.println("    +");

        for (int i = 2; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (j > width/2 - i && j < width/2 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (j > 1 && j < 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}