package unit;

import converter.Convert;
import converter.weight.WeightConverter;
import java.math.BigDecimal;
import unit.enums.Units;

public interface Unit {

  Units getUnitType();
  Units getBaseUnit();


}
