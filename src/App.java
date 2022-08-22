public class App {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(4, 6, 7);
//
//        System.out.println(result);
//
//
//        Circle circle = new Circle();
//        circle.setR(5);
//        System.out.println(circle.diametr());


        Ant ant = new Ant();
        ant.ani(-1,9);


        boolean result = ant.pull(5);
        System.out.println(result);

//        ant.power(10,5) + ant.power(3,2);

//     ant.power(10,5);

        System.out.println(ant.power(10,5) + ant.power(3,2));

    }
}