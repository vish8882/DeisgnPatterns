package unit.length;

import unit.BaseUnit;
import unit.Length;
import unit.enums.Lengths;
import unit.enums.Units;

public class Kilometer extends Length implements BaseUnit {

  @Override
  public Length convertTo(Lengths unit) {
    return null;
  }

  @Override
  public Kilometer convertToBaseUnit() {
    return null;
  }

  @Override
  public Length convertFromBaseUnit(Kilometer baseUnit) {
    return null;
  }

  @Override
  public Units getUnitType() {
    return null;
  }
}
