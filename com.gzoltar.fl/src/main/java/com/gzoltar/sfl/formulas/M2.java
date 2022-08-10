package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class M2 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "M2";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (fe + peb + 2 * feb + 2 * pe == 0)
            return 0;
        else
            return fe / (fe + peb + 2 * feb + 2 * pe);
    }
}
