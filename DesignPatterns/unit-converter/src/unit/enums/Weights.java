package unit.enums;

import java.math.BigDecimal;
import unit.Weight;
import unit.weight.Gram;
import unit.weight.KiloGram;
import unit.weight.MilliGram;

public enum Weights implements Units<Weight> {
    KILOGRAM {
      public Weight getUnit() {
        return new KiloGram();
      }
    },
    GRAM {
      public Weight getUnit() {
        return new Gram();
      }
    },
    MILLIGRAM{
      public Weight getUnit() {
        return new MilliGram();
      }
    };
}
