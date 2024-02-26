load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "configuration",
    srcs = ["Configuration.kt"],
    deps = [
        "@maven//:com_github_gestalt_config_gestalt_core",
        "@maven//:com_github_gestalt_config_gestalt_kotlin",
        "@maven//:com_github_gestalt_config_gestalt_toml",
    ]
)