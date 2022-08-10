package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Goodman extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Goodman";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (2 * fe + feb + pe == 0)
            return 0;
        else
            return (2 * fe - feb - pe) / (2 * fe + feb + pe);
    }
}
