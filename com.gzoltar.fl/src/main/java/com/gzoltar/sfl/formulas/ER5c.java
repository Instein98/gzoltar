package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class ER5c extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "ER5c";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (fe < fe + feb)
            return 0;
        else
            return 1;
    }
}
