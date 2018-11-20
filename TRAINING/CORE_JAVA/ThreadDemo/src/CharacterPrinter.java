

public class CharacterPrinter implements Runnable {

    private String statement;

    public CharacterPrinter(String statement) {
        this.statement = statement;
    }

    @Override
    public void run() {
        for (int i =0;i<statement.length();i++){
            System.out.print(" "+statement.charAt(i));
            try {
                Thread.sleep(500); // I have done some of my job, let other thread take control now!!!
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
