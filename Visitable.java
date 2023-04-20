package visitor;

import com.autobusy.*;

public interface Visitable {
    void accept(Autobus autobus, Visitor visitor);
}