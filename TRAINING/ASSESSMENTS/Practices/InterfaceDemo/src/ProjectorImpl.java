
public class ProjectorImpl implements VgaDisplayDAO,HdmiDisplayDAO {
    @Override
    public void displayIn24Bits() {
        System.out.println("Projector Implementation: This will display 24 bits output");
    }

    @Override
    public void displayIn16Bits() {
        System.out.println("Projector Implementation: This will display 16 bits output");
    }

    @Override
    public void displayIn8bits() {
        System.out.println("Projector Implementation: This will display 8 bits output");

    }
}
