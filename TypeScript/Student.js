"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student() {
        this.stdid = 123;
        this.sname = "sid";
        this.standard = "2nd statndard";
    }
    Student.prototype.display = function () {
        console.log(this.stdid);
        console.log(this.sname);
        console.log(this.standard);
    };
    return Student;
}());
exports.Student = Student;
