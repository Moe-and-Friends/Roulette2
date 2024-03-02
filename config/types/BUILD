load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "action",
    srcs = ["Action.kt"],
    deps = [
        ":bounds"
    ],
)

kt_jvm_library(
    name = "bounds",
    srcs = ["Bounds.kt"],
)

kt_jvm_library(
    name = "role",
    srcs = ["Role.kt"],
)