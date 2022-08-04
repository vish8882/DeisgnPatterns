package converter;

import unit.BaseUnit;
import unit.Unit;
import unit.enums.Units;

public interface Convert<T extends Unit, R extends Units, K extends BaseUnit> {
  T convertTo(R unit);
  K convertToBaseUnit();
  T convertFromBaseUnit(K baseUnit);
}
