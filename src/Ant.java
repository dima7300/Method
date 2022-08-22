

public class Ant {
    public void ani(int x, int y) {
//        int a = x;
//        int b = y;

       if  (x < y) {
            System.out.println(x);
        } else if (x > y) {
            System.out.println(y);
        }
        else {
            System.out.println("Эти числа равны");
        }

    }
    public boolean pull(int p) {

        boolean zoo = p >= 5;
        return zoo;
    }
    public int power(int x, int y) {
        int b = 1;
        for (int i =0; i < y; ++i){
            b *= x;
        }


      return b;
    }

}