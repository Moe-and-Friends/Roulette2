load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "action",
    srcs = ["Action.kt"],
    deps = [
        ":timeout",
        "//config/types:action",
    ],
)

kt_jvm_library(
    name = "action_selector",
    srcs = ["ActionSelector.kt"],
    deps = [
        ":action",
        "//config/types:action",
    ]
)

kt_jvm_library(
    name = "timeout",
    srcs = ["Timeout.kt"],
    deps = [
        "//config/types:bounds",
    ],
)