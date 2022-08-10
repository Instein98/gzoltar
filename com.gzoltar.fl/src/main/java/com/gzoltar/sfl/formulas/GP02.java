package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class GP02 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "GP02";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return 2 * (fe + Math.sqrt(pe + peb)) + Math.sqrt(pe);
    }
}
