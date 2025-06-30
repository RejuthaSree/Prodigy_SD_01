import java.util.Scanner;

class Prodigy_SD_01 {
    public static void main(String[] args) {

        temperature_conversion();
    }

    static void temperature_conversion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        float temp = scan.nextFloat();
        System.out.println("Enter the unit(C/K/F) of the temperature:");
        String unit = scan.next().toUpperCase().substring(0, 1);
        if (unit.equals("C")) {
            System.out.println(temp + " " + unit);
            System.out.println("Temperature in fahrenheit: " + (temp * 9.0F / 5.0F + 32.0F) + " F");
            System.out.println("Temperature in kelvin: " + ((double)temp + 273.15) + " K");
        }
        else if (unit.equals("F")) {
            System.out.println(temp + " " + unit);
            System.out.println("Temperature in celsius: " + (temp - 32.0F) * 5.0F / 9.0F + " C");
            System.out.println("Temperature in kelvin: " + ((double)((temp - 32.0F) * 0.0F) + 273.15) + " K");
        }
        else if (unit.equals("K")) {
            System.out.println(temp + " " + unit);
            System.out.println("Temperature in celsius: " + ((double)temp - 273.15) + " C");
            System.out.println("Temperature in fahrenheit: " + (((double)temp - 273.15) * (double)9.0F / (double)5.0F + (double)32.0F) + " F");
        }
        else {
            System.out.println("Enter the valid unit for the temperature");
            temperature_conversion();
        }

    }
}
