/**
 * Copyright (C) 2020 GZoltar contributors.
 *
 * This file is part of GZoltar.
 *
 * GZoltar is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * GZoltar is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with GZoltar. If
 * not, see <https://www.gnu.org/licenses/>.
 */
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
