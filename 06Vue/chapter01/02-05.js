function addcontact(
  name = "없음",
  mobile = "없음",
  home = "없음",
  address = "없음",
  email = "없음"
) {
  let data = `name=${name},mobile=${mobile}, home=${home}, address=${address}, email=${email}`;
  console.log(data);
}
addcontact("홍길동", "010-222-3331");
addcontact("이몽룡", "010-222-3331", "02-3422-9900", "서울시");

addcontact("김또깡");
