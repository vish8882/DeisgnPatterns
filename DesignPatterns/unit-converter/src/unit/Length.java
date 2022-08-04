package unit;

import converter.length.LengthConverter;
import unit.enums.Lengths;
import unit.enums.Units;

public abstract class Length implements Unit , LengthConverter {

  @Override
  public Units getBaseUnit() {
    return Lengths.KILOMETER;
  }
}
