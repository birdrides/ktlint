package com.pinterest.ktlint.internal

import picocli.CommandLine
import kotlin.system.exitProcess

/**
 * Check if user requested either help or version options, if yes - print it
 * and exit process with [exitCode] exit code.
 */
internal fun CommandLine.printHelpOrVersionUsage(
  exitCode: Int = 0
) {
  if (isUsageHelpRequested) {
    usage(System.out, CommandLine.Help.Ansi.OFF)
    exitProcess(exitCode)
  } else if (isVersionHelpRequested) {
    printVersionHelp(System.out, CommandLine.Help.Ansi.OFF)
    exitProcess(exitCode)
  }
}
