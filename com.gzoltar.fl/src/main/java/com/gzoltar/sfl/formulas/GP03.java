package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class GP03 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "GP03";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return Math.sqrt(Math.abs(Math.pow(fe, 2) - Math.sqrt(pe)));
    }
}
