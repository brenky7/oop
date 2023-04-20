package visitor;
import com.cestujuci.*;
import com.autobusy.*;
public interface Visitor{
    void pridajBezneho(Autobus autobus, beznyClovek cestujuci);
    void pridajBohateho(Autobus autobus, bohatyCestujuci cestujuci);
    void pridajTehotnu(Autobus autobus, tehotnaZena cestujuci);
    void pridajZnevyhodneneho(Autobus autobus, telesneZnevyhodneny cestujuci);
}