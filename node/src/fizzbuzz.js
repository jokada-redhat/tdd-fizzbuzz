const FIZZ_DIVISOR = 3;
const BUZZ_DIVISOR = 5;
const FIZZ = "Fizz";
const BUZZ = "Buzz";

export function of(n) {
  let result = "";
  if (n % FIZZ_DIVISOR === 0) result += FIZZ;
  if (n % BUZZ_DIVISOR === 0) result += BUZZ;
  if (result === "") result += n;
  return result;
}
