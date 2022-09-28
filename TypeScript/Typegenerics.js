function getArray1(items) {
    return new Array().concat(items);
}
var mynum = getArray1([100, 200, 300]);
var mystr = getArray1(["hello ", "sid"]);
mynum.push(400);
mystr.push("!!");
console.log(mynum);
console.log(mystr);
