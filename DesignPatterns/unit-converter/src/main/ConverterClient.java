package main;

import java.math.BigDecimal;
import unit.Weight;
import unit.enums.Lengths;
import unit.enums.Weights;
import unit.weight.Gram;
import unit.weight.KiloGram;

public class ConverterClient {

  public static void main(String[] args) {
    KiloGram kiloGram = new KiloGram(new BigDecimal(10));
    Weight weight = new Gram(new BigDecimal(1)).convertTo(Weights.MILLIGRAM);
    System.out.println(weight.getWeight());

  }
}
