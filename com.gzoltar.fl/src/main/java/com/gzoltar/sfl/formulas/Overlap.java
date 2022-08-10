package com.gzoltar.sfl.formulas;

/**
 * @author Yicheng Ouyang
 * @Date 8/10/22
 */

public class Overlap extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Overlap";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        if (min(fe, pe, feb) == 0)
            return 0;
        else
            return fe / (min(fe, pe, feb));
    }

    public double min(double... number){
        double res = Double.POSITIVE_INFINITY;
        for (double n: number){
            if (n < res)
                res = n;
        }
        return res;
    }
}
