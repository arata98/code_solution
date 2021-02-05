// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:
// Input: x = 123
// Output: 321

// Example 2:
// Input: x = -123
// Output: -321

// Example 3:
// Input: x = 120
// Output: 21

// Example 4:
// Input: x = 0
// Output: 0

// Constraints:
// -231 <= x <= 231 - 1


/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    if(-Math.pow(2,31) <= x <= Math.pow(2,31) - 1){
        let stringReverse = x.toString().split('').reverse().join('');
        let candidate = x > 0 ? parseInt(stringReverse):-parseInt(stringReverse);
        console.log(candidate < 0-Math.pow(2,31));
        return (candidate > (Math.pow(2,31) - 1) || candidate < -Math.pow(2,31)) ? 0 : candidate;
    }
    return 0;
};

console.log(reverse(1534236469));