public enum FizzBuzz {

    private static let fizzDivisor = 3
    private static let buzzDivisor = 5
    private static let fizz = "Fizz"
    private static let buzz = "Buzz"

    public static func of(_ n: Int) -> String {
        var result = ""
        if n % fizzDivisor == 0 { result += fizz }
        if n % buzzDivisor == 0 { result += buzz }
        if result.isEmpty { result = String(n) }
        return result
    }
}
