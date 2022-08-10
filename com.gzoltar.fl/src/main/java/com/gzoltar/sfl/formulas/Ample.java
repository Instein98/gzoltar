package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Ample extends AbstractSFLFormula {
    @Override
    public String getName() {
        return "Ample";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        double tmp1 = (fe + feb == 0 ? 0 : fe / (fe + feb));
        double tmp2 = (pe + peb == 0 ? 0 : pe / (pe + peb));
        return Math.abs(tmp1 - tmp2);
    }
}
