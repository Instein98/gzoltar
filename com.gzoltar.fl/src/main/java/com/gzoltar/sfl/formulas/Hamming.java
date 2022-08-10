package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Hamming extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Hamming";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return fe + peb;
    }
}
