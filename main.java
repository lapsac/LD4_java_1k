import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double x, y;
            try {
                x = sc.nextDouble();
                y = sc.nextDouble();
                sc.close();
            }
            catch(Exception ex){
                System.out.println("input-output error");
                return;
            }
        boolean cetrsturis, trijsturis, pusaplis;
      trijsturis =y >= 7 && y <= 10 && y <= 8 && x >= 2 && y <= x + 5 && y <= 15 - x &&
                    !((1 / 2) * (x - 5) * (x - 5) + (y - 8) * (y - 8) <= 1 
                    && x > 4 && x < 6 && y > 8 && y < 9);
        cetrsturis =(x >= 3 && x <= 4 && y >= 3 && y < 7) || 
                    (x >= 4 && x <= 6 && y < 7) ||
                    (x >= 4 && x <= 6 && y >= 3 && y <= 4) || 
                    (x >= 6 && x <= 7 && y >= 3 && y <= 7);
        pusaplis =(1 / 2) * (x - 5) * (x - 5) + (y - 8) * (y - 8) < 1 
                  && x >= 4 && x <= 6 && y >= 8 && y <= 9;
        if (cetrsturis) {
            System.out.println("red");
        } else if (pusaplis) {
            System.out.println("green");
        } else if (trijsturis) {
            System.out.println("blue");
        } else {
            System.out.println("white");
        }
    }
}
