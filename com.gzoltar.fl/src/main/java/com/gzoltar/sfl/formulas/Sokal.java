package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Sokal extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Sokal";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (2 * fe + 2 * peb + feb + pe == 0)
            return 0;
        else
            return 2 * fe + 2 * peb / (2 * fe + 2 * peb + feb + pe);
    }
}
