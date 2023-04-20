package visitor;
import com.autobusy.*;
import com.cestujuci.beznyClovek;
import com.cestujuci.bohatyCestujuci;
import com.cestujuci.tehotnaZena;
import com.cestujuci.telesneZnevyhodneny;

public class pridajCestujuceho implements Visitor{
    @Override
    public void pridajBezneho(Autobus autobus, beznyClovek cestujuci) {
        if (cestujuci.getBooked()==false){
            autobus.addCestujuci(cestujuci);
            cestujuci.setBudget(cestujuci.getBudget()-autobus.getCena());
            cestujuci.setBooked(true);
        }
    }

    @Override
    public void pridajBohateho(Autobus autobus, bohatyCestujuci cestujuci) {
        if (cestujuci.getBooked()==false){
            autobus.addCestujuci(cestujuci);
            cestujuci.setBudget(cestujuci.getBudget()-autobus.getCena());
            cestujuci.setBooked(true);
        }
    }

    @Override
    public void pridajTehotnu(Autobus autobus, tehotnaZena cestujuci) {
        if (cestujuci.getBooked()==false){
            autobus.addCestujuci(cestujuci);
            cestujuci.setBudget(cestujuci.getBudget()-autobus.getCena());
            cestujuci.setBooked(true);
        }
    }

    @Override
    public void pridajZnevyhodneneho(Autobus autobus, telesneZnevyhodneny cestujuci) {
        if (cestujuci.getBooked()==false){
            autobus.addCestujuci(cestujuci);
            cestujuci.setBudget(cestujuci.getBudget()-autobus.getCena());
            cestujuci.setBooked(true);
        }
    }
}
