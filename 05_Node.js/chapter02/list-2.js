const fs = require("fs");
fs.readdir("./", function (err, filelist) {
  if (err) {
    console.error(err);
    return;
  }
  console.log(filelist);
});
