import service.enclosure.EnclosureService;
import service.enclosure.EnclosureServiceImpl;

public class Zoo {
    public static void main(String[] args)throws InterruptedException {
        EnclosureService enclosure=new EnclosureServiceImpl();
        enclosure.aMonthPasses();
    }
}