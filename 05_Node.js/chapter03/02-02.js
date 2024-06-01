let msg = "global";
function outer() {
  let msg = "outer";
  console.log(msg);
  if (true) {
    let msg = "block";
    console.log(msg);
  }
}
outer();
