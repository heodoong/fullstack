const fs = require("fs");
fs.readFile("05_node.js/chapter02/example.txt", "utf8", function (err, data) {
  if (err) {
    console.error(err);
    return;
  }
  console.log(data);
});
