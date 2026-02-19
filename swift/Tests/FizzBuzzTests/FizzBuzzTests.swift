import XCTest
@testable import FizzBuzz

final class FizzBuzzTests: XCTestCase {

    func testOf_returnsNumberAsIs() {
        XCTAssertEqual(FizzBuzz.of(1), "1")
        XCTAssertEqual(FizzBuzz.of(2), "2")
    }
}
