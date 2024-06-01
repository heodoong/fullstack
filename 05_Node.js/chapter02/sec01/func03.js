let Triangle = (base, height) => (base * height) / 2;
let Circle = (radius) => radius * radius * Math.PI;
console.log("삼각형의 면적:" + Triangle(5, 2));
console.log("원의 면적:" + Circle(5));
