// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "FizzBuzz",
    products: [
        .library(name: "FizzBuzz", targets: ["FizzBuzz"]),
        .executable(name: "FizzBuzzApp", targets: ["FizzBuzzApp"]),
    ],
    targets: [
        .target(name: "FizzBuzz"),
        .executableTarget(name: "FizzBuzzApp", dependencies: ["FizzBuzz"]),
        .testTarget(name: "FizzBuzzTests", dependencies: ["FizzBuzz"]),
    ]
)
