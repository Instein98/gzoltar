package com.gzoltar.core.instr.matchers;

import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtField;

public class ClassNameMatcher extends AbstractWildcardMatcher {

  public ClassNameMatcher(final String expression) {
    super(expression);
  }

  @Override
  public final boolean matches(final CtClass ctClass) {
    return super.matches(ctClass.getName());
  }

  @Override
  public final boolean matches(final CtBehavior ctBehavior) {
    throw new RuntimeException(
        ClassNameMatcher.class.getSimpleName() + " should only be used to filter out classes");
  }

  @Override
  public final boolean matches(final CtField ctField) {
    throw new RuntimeException(
        ClassNameMatcher.class.getSimpleName() + " should only be used to filter out classes");
  }

}
