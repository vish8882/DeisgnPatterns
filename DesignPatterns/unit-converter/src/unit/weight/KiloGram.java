package unit.weight;

import java.math.BigDecimal;
import unit.BaseUnit;
import unit.Unit;
import unit.Weight;
import unit.enums.Units;
import unit.enums.Weights;

public class KiloGram extends Weight implements BaseUnit<Weights> {

  BigDecimal weight = null;

  public KiloGram(){

  }

  public KiloGram(BigDecimal weight) {
    this.weight = weight;
  }

  @Override
  public Weight convertTo(Weights unit) {
    return unit.getUnit().convertFromBaseUnit(this) ;
  }

  @Override
  public KiloGram convertToBaseUnit() {
    return this;
  }

  @Override
  public Weight convertFromBaseUnit(KiloGram baseUnit) {
    return this;
  }

  @Override
  public Units getUnitType() {
    return Weights.KILOGRAM;
  }

  @Override
  public BigDecimal getWeight() {
    return weight;
  }

  @Override
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }
}
