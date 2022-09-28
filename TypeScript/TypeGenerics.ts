function getArray1<T>(items:T[]):T[]{
    
    return new Array<T>().concat(items);
}
let mynum=getArray1<number>([100,200,300]);
let mystr=getArray1<string>(["hello ","sid"]);
mynum.push(400);
mystr.push("!!")
console.log(mynum);
console.log(mystr);