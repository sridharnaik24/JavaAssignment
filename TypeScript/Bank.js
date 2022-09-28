var bank = /** @class */ (function () {
    function bank() {
        this.accNumber = 122;
        this.accName = "sid";
        this.balance = 1000;
    }
    bank.prototype.deposit = function (amt) {
        this.balance = amt + this.balance;
        return this.balance;
    };
    bank.prototype.withdraw = function (amt) {
        this.balance = this.balance - amt;
        return this.balance;
    };
    bank.prototype.display = function () {
        console.log(this.accName);
        console.log(this.accNumber);
        console.log(this.balance);
    };
    return bank;
}());
var c1 = new bank();
c1.deposit(1000);
c1.withdraw(101);
c1.display();
