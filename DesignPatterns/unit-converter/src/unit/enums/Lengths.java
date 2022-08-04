package unit.enums;

import java.math.BigDecimal;
import unit.Length;
import unit.length.CentiMeter;
import unit.length.Kilometer;
import unit.length.Meter;

public enum Lengths implements Units<Length> {
  KILOMETER {
    @Override
    public Length getUnit() {
      return new Kilometer();
    }
  },
  METER {
    @Override
    public Length getUnit() {
      return new Meter();
    }
  },
  CENTIMETER {
    @Override
    public Length getUnit() {
      return new CentiMeter();
    }
  };
}
