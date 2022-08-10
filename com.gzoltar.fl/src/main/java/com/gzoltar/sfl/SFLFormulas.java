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
package com.gzoltar.sfl;

import com.gzoltar.sfl.formulas.Ample;
import com.gzoltar.sfl.formulas.Anderberg;
import com.gzoltar.sfl.formulas.Barinel;
import com.gzoltar.sfl.formulas.DStar2;
import com.gzoltar.sfl.formulas.Dice;
import com.gzoltar.sfl.formulas.ER1a;
import com.gzoltar.sfl.formulas.ER1b;
import com.gzoltar.sfl.formulas.ER5c;
import com.gzoltar.sfl.formulas.Euclid;
import com.gzoltar.sfl.formulas.GP02;
import com.gzoltar.sfl.formulas.GP03;
import com.gzoltar.sfl.formulas.GP13;
import com.gzoltar.sfl.formulas.GP19;
import com.gzoltar.sfl.formulas.Goodman;
import com.gzoltar.sfl.formulas.Hamann;
import com.gzoltar.sfl.formulas.Hamming;
import com.gzoltar.sfl.formulas.ISFLFormula;
import com.gzoltar.sfl.formulas.Ideal;
import com.gzoltar.sfl.formulas.Jaccard;
import com.gzoltar.sfl.formulas.Kulczynski1;
import com.gzoltar.sfl.formulas.Kulczynski2;
import com.gzoltar.sfl.formulas.M1;
import com.gzoltar.sfl.formulas.M2;
import com.gzoltar.sfl.formulas.Naish1;
import com.gzoltar.sfl.formulas.Ochiai;
import com.gzoltar.sfl.formulas.Ochiai2;
import com.gzoltar.sfl.formulas.Opt;
import com.gzoltar.sfl.formulas.Overlap;
import com.gzoltar.sfl.formulas.RogersTanimoto;
import com.gzoltar.sfl.formulas.RusselRao;
import com.gzoltar.sfl.formulas.SBI;
import com.gzoltar.sfl.formulas.SimpleMatching;
import com.gzoltar.sfl.formulas.Sokal;
import com.gzoltar.sfl.formulas.SorensenDice;
import com.gzoltar.sfl.formulas.Tarantula;
import com.gzoltar.sfl.formulas.Wong1;
import com.gzoltar.sfl.formulas.Wong2;
import com.gzoltar.sfl.formulas.Wong3;
import com.gzoltar.sfl.formulas.Zoltar;

public enum SFLFormulas {

  TARANTULA(new Tarantula()),

  OCHIAI(new Ochiai()),

  JACCARD(new Jaccard()),

  AMPLE(new Ample()),

  RUSSEL_RAO(new RusselRao()),

  HAMANN(new Hamann()),

  SORENSEN_DICE(new SorensenDice()),

  DICE(new Dice()),

  KULCZYNSKI1(new Kulczynski1()),

  KULCZYNSKI2(new Kulczynski2()),

  SIMPLE_MATCHING(new SimpleMatching()),

  SOKAL(new Sokal()),

  M1(new M1()),

  M2(new M2()),

  ROGERS_TANIMOTO(new RogersTanimoto()),

  GOODMAN(new Goodman()),

  HAMMING(new Hamming()),

  EUCLID(new Euclid()),

  OVERLAP(new Overlap()),

  ANDERBERG(new Anderberg()),

  OCHIAI2(new Ochiai2()),

  ZOLTAR(new Zoltar()),

  WONG1(new Wong1()),

  WONG2(new Wong2()),

  ER5C(new ER5c()),

  GP02(new GP02()),

  GP03(new GP03()),

  GP13(new GP13()),

  GP19(new GP19()),

  SBI(new SBI()),

  DSTAR2(new DStar2()),

  WONG3(new Wong3()),

  ER1A(new ER1a()),

  ER1B(new ER1b()),

  OPT(new Opt()),

  BARINEL(new Barinel()),

  IDEAL(new Ideal()),

  NAISH1(new Naish1());

  private final ISFLFormula formula;

  private SFLFormulas(final ISFLFormula formula) {
    this.formula = formula;
  }

  public ISFLFormula getFormula() {
    return this.formula;
  }
}
