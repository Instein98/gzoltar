package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Dice extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Dice";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (fe + feb + pe == 0)
            return 0;
        else
            return 2 * fe / (fe + feb + pe);
    }
}
