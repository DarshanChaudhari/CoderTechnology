public class Methodology {

    public static void main(String args[]){
        System.out.println("In the first line of the code");
        drawLine();
        System.out.println("\nIn the second line of the code");
        drawLine(45);

    }


    static void drawLine() {
        for (int i = 0; i < 100; i++) {
            System.out.println("-");
        }
    }

    static void drawLine(int width)    {
            for (int i=0;i<width;i++){
                System.out.println("-");
            }
        }

    }

