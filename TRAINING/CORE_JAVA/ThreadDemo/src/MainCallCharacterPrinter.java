
public class MainCallCharacterPrinter {
    public static void main(String[] args) {

        CharacterPrinter printer = new CharacterPrinter("The Quick brown fox jumps over the lazy dog.");
        CharacterPrinter printer1 = new CharacterPrinter("123456231246484846667890");
      //  CharacterPrinter printer2 = new CharacterPrinter("IOSPREMDFSFSDFEEFSDFSDF");

        // Create a worker thread and assign task to it
        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer1);
     //   Thread t3 = new Thread(printer2);

        // Launch the thread
        t1.start();
        t2.start();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        // If you want to use task scheduler, Main thread will wait for other threads to complete. If you comment try catch block then End of main will completed first then thread will compelted

     /*  try{
            System.out.println("\nHey JVM, Let t1 finish first");
            t1.start();
            t2.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        try{
            System.out.println("\nHey JVM, Let t2 finish first");
            t2.start();
            t2.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        } */

        System.out.println("\nEnd of Main");
    }

}


