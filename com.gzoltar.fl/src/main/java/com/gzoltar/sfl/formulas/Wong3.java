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

public class Wong3 extends AbstractSFLFormula{
    @Override
    public String getName() {
        return "Wong3";
    }

    @Override
    public double compute(double peb, double feb, double pe, double fe) {
        double h;
        if (pe <= 2)
            h = pe;
        else if (pe > 2 && pe <= 10)
            h = 2 + 0.1 * (pe - 2);
        else
            h = 2.8 + 0.01 * (pe - 10);
        return fe - h;
    }
}
