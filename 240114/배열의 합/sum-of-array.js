const fs = require('fs')
const input = fs.readFileSync(0).toString().trim().split("\n");

const solution = () => {
    input.map(row => {
        const sum = row.split(' ').map(Number).reduce((acc, cur) => acc + cur)
        console.log(sum);
    });
};

solution();