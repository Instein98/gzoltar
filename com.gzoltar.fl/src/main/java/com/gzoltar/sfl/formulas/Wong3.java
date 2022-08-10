package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Wong3 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Wong3";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        double h;
        if (pe <= 2)
            h = pe;
        else if (pe > 2 && pe <= 10)
            h = 2 + 0.1 * (pe - 2);
        else
            h = 2.8 + 0.01 * (pe - 10);
        return fe - h;
    }
}
