//패스를 가져옴
const path = require("path");
//패스 연결
const path2 = path.join("some", "work", "ex.txt");
console.log("출력]");
console.log(path2);

console.log(`파일 절대 경로 : ${__filename} `);
console.log(`경로만 : ${__dirname}`);

const path3 = path.basename(__filename);
const path4 = path.basename(__filename, ".js");
console.log(`파일 이름 : ${path3} `);
console.log(`파일 이름(확장자 제외) : ${path4}`);

const path5 = path.extname(__filename);
console.log(`파일 확장자: ${path5}`);

const path6 = path.parse(__filename);
console.log(path6);
