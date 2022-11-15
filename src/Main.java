import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(100, 3, 'M', "bull");
        System.out.println(cow.toString());

        Sheep sheep = new Sheep(110, 2, 'M', "Ram");
        System.out.println(sheep.toString());

        Horse horse = new Horse(50, 1, 'M', "horse");
        System.out.println(horse.toString());


        Scanner scanner = new Scanner(System.in);
        Farm farm = new Farm();

        Farm farmOne = new Farm("Dordoi Plaza",farm.getCows(),farm.getHorses(),farm.getSheep(),"Akbalaev");
        System.out.println("Show the number of livestock of the first firm");
        System.out.println("Give the number of cows");
        farmOne.setCows(new int[]{scanner.nextInt()});
        System.out.println("Give the number of horses");
        farmOne.setHorses(new int[]{scanner.nextInt()});
        System.out.println("Give the number of sheep");
        farmOne.setSheep(new int[]{scanner.nextInt()});

        Farm farmTwo = new Farm("Dordoi",farm.getCows(),farm.getHorses(),farm.getSheep(),"Toichuev");
        System.out.println("Show the number of cattle of the second firm");
        System.out.println("Give the number of cows");
        farmTwo.setCows(new int[]{scanner.nextInt()});
        System.out.println("Give the number of horses");
        farmTwo.setHorses(new int[]{scanner.nextInt()});
        System.out.println("Give the number of sheep");
        farmTwo.setSheep(new int[]{scanner.nextInt()});
        System.out.println(farmOne);
        System.out.println(farmTwo);


    }
}