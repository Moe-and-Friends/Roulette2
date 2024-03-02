load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "configuration",
    srcs = ["Configuration.kt"],
    deps = [
        "//config/types:action",
        "//config/types:role",
    ]
)

kt_jvm_library(
    name = "gestalt_configuration_impl",
    srcs = ["ConfigurationGestaltImpl.kt"],
    deps = [
        ":configuration",
        ":moe_and_friends_configuration",
        "//config/types:action",
        "//config/types:bounds",
        "//config/types:role",
        "@maven//:com_github_gestalt_config_gestalt_core",
        "@maven//:com_github_gestalt_config_gestalt_kotlin",
        "@maven//:com_github_gestalt_config_gestalt_toml",
    ]
)

kt_jvm_library(
    name = "moe_and_friends_configuration",
    srcs = ["MoeAndFriendsConfiguration.kt"],
)
