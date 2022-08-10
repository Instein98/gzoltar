package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class GP19 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "GP19";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return fe * Math.sqrt(Math.abs(pe - fe + fe + feb -(pe + peb)));
    }
}
