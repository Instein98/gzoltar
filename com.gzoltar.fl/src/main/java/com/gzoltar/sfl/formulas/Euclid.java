package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Euclid extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Euclid";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return Math.sqrt(fe + peb);
    }
}
