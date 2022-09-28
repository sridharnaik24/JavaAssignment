var PersonImplement = /** @class */ (function () {
    function PersonImplement() {
    }
    PersonImplement.prototype.getfullname = function () {
        return this.first + this.last;
    };
    return PersonImplement;
}());
var p1 = new PersonImplement();
p1.first = "sid";
p1.last = "patil";
console.log(p1.getfullname());
