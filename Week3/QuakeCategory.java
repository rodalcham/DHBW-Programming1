import java.util.Scanner;
import java.util.Random;

public class QuakeCategory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is an earthquake categorization system. Please enter input in the format X.X");

        while (true) {
            System.out.print("Magnitude: ");
            String Smagnitude = scanner.nextLine();

            if (Smagnitude.equalsIgnoreCase("exit")) {
				System.out.println("Goodbye.");
                break;
            }

			float magnitude = 0;
            try {
				magnitude = Float.parseFloat(Smagnitude);
			} catch (NumberFormatException e) {
				System.out.println("Error: Not a valid number.");
				continue;
			}

			if (magnitude < 0  || magnitude > 10) {
				System.out.println("Error: Magnitude out of range.");
				continue;
			}

			switch ((int) magnitude){

				case 1,2 -> Smagnitude = "Micro quake: It is safe to wait inside.";
				case 3,4 -> Smagnitude = "Minor quake: It is safe to wait inside.";
				case 5 -> Smagnitude = "Light quake: Please evacuate.";
				case 6 -> Smagnitude = "Moderate quake: Evacuate Immediately.";
				case 7 -> Smagnitude = "Strong quake: Evacuate Immediately.";
				case 8 -> Smagnitude = "Major quake: Evacuate Immediately, wait for first responders to arrive.";
				default -> Smagnitude = "Great quake: Good Luck.";
			}
			System.out.println(Smagnitude);

        }

        scanner.close();
    }
}