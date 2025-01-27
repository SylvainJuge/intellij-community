// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeInspection.compiler;

import com.intellij.codeInspection.AbstractBaseJavaLocalInspectionTool;
import com.intellij.codeInspection.InspectionsBundle;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class JavacQuirksInspection extends AbstractBaseJavaLocalInspectionTool {
  {
    //noinspection RedundantTypeArguments (explicit type arguments speedup compilation and analysis time)
    Arrays.<List<String>>asList(
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b"),
      Arrays.asList("a", "b")
    );
  }
  @Override
  public boolean isEnabledByDefault() {
    return true;
  }

  @Nls @NotNull
  @Override
  public String getGroupDisplayName() {
    return InspectionsBundle.message("group.names.compiler.issues");
  }

  @NotNull
  @Override
  public String getShortName() {
    return "JavacQuirks";
  }

  @NotNull
  @Override
  public PsiElementVisitor buildVisitor(@NotNull final ProblemsHolder holder, final boolean isOnTheFly) {
    return new JavacQuirksInspectionVisitor(holder);
  }
}
