package unit;

import converter.weight.WeightConverter;
import java.math.BigDecimal;
import unit.enums.Units;
import unit.enums.Weights;

public abstract class Weight implements Unit, WeightConverter{

  public abstract BigDecimal getWeight();
  public abstract void setWeight(BigDecimal weight);

  @Override
  public Units getBaseUnit() {
    return Weights.KILOGRAM;
  }
}
