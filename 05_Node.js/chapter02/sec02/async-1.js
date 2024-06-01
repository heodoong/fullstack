function dlsplayA() {
  console.log("A");
}
function dlsplayB() {
  setTimeout(() => {
    console.log("B");
  }, 2000);
}
function displayC() {
  console.log("C");
}
displayA();
displayB();
displayC();
