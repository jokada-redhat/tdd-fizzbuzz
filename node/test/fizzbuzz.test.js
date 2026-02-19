import test from "node:test";
import assert from "node:assert";
import { of } from "../src/fizzbuzz.js";

test("of returns number as is", () => {
  assert.strictEqual(of(1), "1");
  assert.strictEqual(of(2), "2");
});
