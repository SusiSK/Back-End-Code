import java.util.Scanner;
class userinput
{
        public static void main (String args[ ] )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name : ?");
        String name = scanner.nextLine();

        System.out.println("What is the top speed in your bike from 100 to 1000: ?");
        int bike = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Email: ?");
        String email = scanner.nextLine();

        System.out.println("Enter your Shirt price from 100 to 500:?");
        short shirt_price = scanner.nextShort();

        System.out.println("Bus is running today True or False:?");
        boolean bus = scanner.nextBoolean();

        System.out.println("Enter the rating of the bike from 1 to 10:?");
        byte rating = scanner.nextByte();

        System.out.println(" Hello  " + name);

        System.out.println(" Your Bike Top Speed Is : " + bike);

        System.out.println(" Your Email is : " + email);

        System.out.println(" Your Shirt Price is :" + shirt_price);

        System.out.println(" Bus Is Going On :" + bus);

        System.out.println(" Your Bike Rating Is : " + rating);




    }
}