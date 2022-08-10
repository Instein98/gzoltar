package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Hamann extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Hamann";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (fe + feb + pe + peb == 0)
            return 0;
        else
            return (fe + peb - pe - feb) / (fe + feb + pe + peb);
    }
}
