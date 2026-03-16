import XCTest
@testable import FizzBuzz

final class FizzBuzzTests: XCTestCase {

    func testOf_returnsNumberAsIs() {
        XCTAssertEqual(FizzBuzz.of(1), "1")
        XCTAssertEqual(FizzBuzz.of(2), "2")
    }

    func testOf_returnsFizzForMultiplesOf3() {
        XCTAssertEqual(FizzBuzz.of(3), "Fizz")
        XCTAssertEqual(FizzBuzz.of(6), "Fizz")
    }

    func testOf_returnsBuzzForMultiplesOf5() {
        XCTAssertEqual(FizzBuzz.of(5), "Buzz")
        XCTAssertEqual(FizzBuzz.of(10), "Buzz")
    }

    func testOf_returnsFizzBuzzForMultiplesOf15() {
        XCTAssertEqual(FizzBuzz.of(15), "FizzBuzz")
        XCTAssertEqual(FizzBuzz.of(30), "FizzBuzz")
    }
}
