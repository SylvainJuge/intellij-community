// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.java.codeInsight.daemon.quickFix;

import com.intellij.codeInsight.daemon.quickFix.LightQuickFixParameterizedTestCase;

public class ConvertInterfaceContainingNotAllowedToClassFixTest extends LightQuickFixParameterizedTestCase {

  @Override
  protected String getBasePath() {
    return "/codeInsight/daemonCodeAnalyzer/quickFix/convertInterfaceContainingNotAllowedToClass";
  }
}
