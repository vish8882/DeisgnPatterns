package unit.weight;

import java.math.BigDecimal;
import unit.Weight;
import unit.enums.Units;
import unit.enums.Weights;

public class MilliGram extends Weight {

  BigDecimal weight;

  public MilliGram() {

  }

  public MilliGram(BigDecimal weight) {
    this.weight = weight;
  }

  @Override
  public BigDecimal getWeight() {
    return weight;
  }

  @Override
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  @Override
  public Weight convertTo(Weights unit) {
    return unit.getUnit().convertFromBaseUnit(convertToBaseUnit());
  }

  @Override
  public KiloGram convertToBaseUnit() {
    return new KiloGram(this.weight.divide(new BigDecimal(100000)));
  }

  @Override
  public Weight convertFromBaseUnit(KiloGram baseUnit) {
    return new MilliGram(baseUnit.getWeight().multiply(new BigDecimal(1000000)));
  }

  @Override
  public Units getUnitType() {
    return Weights.MILLIGRAM;
  }
}
