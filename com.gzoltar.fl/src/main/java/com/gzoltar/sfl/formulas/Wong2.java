package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Wong2 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Wong2";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return fe - pe;
    }
}
