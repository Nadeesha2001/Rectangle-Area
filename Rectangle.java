import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Enter Lenght");
        Double lenght = Values.nextDouble();
        System.out.println("Enter Width");
        Double width = Values.nextDouble();

        Double Area = lenght * width;
        System.out.println("Your Rectangle Area is" + " " + Area);
    }
}
