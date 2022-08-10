package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class GP13 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "GP13";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        double tmp = ((2 * pe + fe) == 0 ? 0 : 1 / (2 * pe + fe));
        return fe * (1 + tmp);
    }
}
