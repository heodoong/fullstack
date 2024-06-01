const fs = require("fs");
const fs1 = fs.readFileSync("example.txt", "utf8");
// fs.writeFileSync("text-1.txt", fs1);
// console.log();
fs.writeFile("write-x.txt", fs1, function (err, data) {
  if (err) {
    console.log("ㅋㅋ");
    return;
  }
  console.log("데이터 성공적");
});
