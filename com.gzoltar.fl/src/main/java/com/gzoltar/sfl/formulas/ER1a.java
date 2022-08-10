package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class ER1a extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "ER1a";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (fe < fe + feb)
            return -1;
        else
            return peb;
    }
}
