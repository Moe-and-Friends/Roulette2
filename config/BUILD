load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "configuration",
    srcs = ["Configuration.kt"],
    deps = [
        ":moe_and_friends_configuration",
        "@maven//:com_github_gestalt_config_gestalt_core",
        "@maven//:com_github_gestalt_config_gestalt_kotlin",
        "@maven//:com_github_gestalt_config_gestalt_toml",
    ]
)

kt_jvm_library(
    name = "moe_and_friends_configuration",
    srcs = ["MoeAndFriendsConfiguration.kt"],
)
