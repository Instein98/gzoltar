package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Wong1 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Wong1";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return fe;
    }
}
