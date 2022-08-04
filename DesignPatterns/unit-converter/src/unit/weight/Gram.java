package unit.weight;

import java.math.BigDecimal;
import unit.BaseUnit;
import unit.Weight;
import unit.enums.Units;
import unit.enums.Weights;

public class Gram extends Weight {

  BigDecimal weight;

  public Gram() {

  }

  public Gram(BigDecimal weight) {
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
     KiloGram kiloGram = this.convertToBaseUnit();
     return unit.getUnit().convertFromBaseUnit(kiloGram);
  }

  @Override
  public KiloGram convertToBaseUnit() {
    return new KiloGram(weight.divide(new BigDecimal(1000)));
  }

  @Override
  public Weight convertFromBaseUnit(KiloGram baseUnit) {
    return new Gram(baseUnit.getWeight().multiply(new BigDecimal(1000)));
  }

  @Override
  public Units getUnitType() {
    return Weights.GRAM;
  }
}
