package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Zoltar extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Zoltar";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (fe == 0 || (fe + feb + pe + 10000 * feb * pe / fe) == 0)
            return 0;
        else
            return fe / (fe + feb + pe + 10000 * feb * pe / fe);
    }
}
