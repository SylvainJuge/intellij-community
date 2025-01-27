// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.plugins.gradle.execution.target

import org.gradle.initialization.BuildCancellationToken
import org.gradle.internal.classpath.ClassPath
import org.gradle.internal.logging.progress.ProgressLoggerFactory
import org.gradle.tooling.internal.consumer.Distribution
import org.gradle.tooling.internal.protocol.InternalBuildProgressListener
import java.io.File

internal class TargetGradleDistribution(val gradleHomePath: String?, distribution: Distribution) : Distribution by distribution {
  override fun getToolingImplementationClasspath(progressLoggerFactory: ProgressLoggerFactory?,
                                                 progressListener: InternalBuildProgressListener?,
                                                 userHomeDir: File?,
                                                 cancellationToken: BuildCancellationToken?): ClassPath {
    throw IllegalStateException("Target Gradle distribution should not be resolved on host environment.")
  }
}