package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class M1 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "M1";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (feb + pe == 0)
            return 0;
        else
            return (fe + peb) / (feb + pe);
    }
}
