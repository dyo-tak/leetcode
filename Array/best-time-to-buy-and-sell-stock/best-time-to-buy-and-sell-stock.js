/**
 * @param {number[]} prices
 * @return {number}
 */
let maxProfit = function(prices) {
    let leastPrice = 100000;

    let profit = 0;
    let profitOnDay = 0;

    for (let price of prices) {
        if (price < leastPrice) leastPrice = price;
        profitOnDay = price - leastPrice;
        if (profitOnDay > profit) profit = profitOnDay;
    }

    return profit;
};

const prices = [7,1,5,3,6,4];
console.log(maxProfit(prices));