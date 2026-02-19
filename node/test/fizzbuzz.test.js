import test from "node:test";
import assert from "node:assert";
import { of } from "../src/fizzbuzz.js";

test("of returns number as is", () => {
  assert.strictEqual(of(1), "1");
  assert.strictEqual(of(2), "2");
});

test("of returns Fizz for multiples of 3", () => {
  assert.strictEqual(of(3), "Fizz");
  assert.strictEqual(of(6), "Fizz");
});

test("of returns Buzz for multiples of 5", () => {
  assert.strictEqual(of(5), "Buzz");
  assert.strictEqual(of(10), "Buzz");
});

test("of returns FizzBuzz for multiples of 15", () => {
  assert.strictEqual(of(15), "FizzBuzz");
  assert.strictEqual(of(30), "FizzBuzz");
});
