load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_kotlin//kotlin:core.bzl", "define_kt_toolchain")
load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@rules_kotlin//kotlin:lint.bzl","ktlint_fix")

package(default_visibility = ["//visibility:public"])

define_kt_toolchain(
    name = "kotlin_toolchain",
    api_version = "1.9", # Kotlin Language Level
    jvm_target = "11", # Java Language Level
    language_version = "1.9" # Kotlin Language Level
)

ktlint_fix(
    name = "lint",
    srcs = glob(["**/*.kt"])
)

kt_jvm_library(
    name = "main",
    srcs = ["Main.kt"],
    deps = [
        "//config:configuration",
        "@maven//:org_javacord_javacord",
        "@maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core_jvm",
    ]
)

java_binary(
    name = "roulette",
    main_class = "moe.best.roulette2.Main",
    runtime_deps = [":main"]
)