public class Main {

    public static void main(String[] args) {

        MoniterImpl moniter = new MoniterImpl() ;
        moniter.displayIn16Bits();
        moniter.displayIn8bits();

        ProjectorImpl projector = new ProjectorImpl();

        projector.displayIn24Bits();

    }
}
