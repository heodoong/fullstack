function displayA() {
  console.log("A");
}

function displayB(callback) {
  setTimeout(() => {
    console.log("B");
    callback();
  }, 2000);
}
