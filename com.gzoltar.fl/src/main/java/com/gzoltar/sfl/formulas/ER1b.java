package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class ER1b extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "ER1b";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        return fe - (pe / (pe + peb + 1));
    }
}
