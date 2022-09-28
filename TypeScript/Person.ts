interface PersonInterface{
    first:string;
    last:string;
    getfullname():string;

}

class PersonImplement implements  PersonInterface{
first: string;
last:string;
getfullname():string{
    return this.first+this.last;
}
}
let p1 =new PersonImplement();
p1.first="sid";
p1.last="patil";
console.log(p1.getfullname());
