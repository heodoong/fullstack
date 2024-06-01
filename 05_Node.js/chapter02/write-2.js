const fs = require("fs");
const fs1 = fs.readFileSync("example.txt", "utf8");
fs.writeFile("data/text-12.txt", fs1, function (err) {
  if (err) {
    console.log("실패!");
    return;
  }
  console.log("굿");
});
