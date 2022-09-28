class Bank{
    accNumber:number=122;
    accName:string="sid";
    balance:number=1000;

    deposit(amt:number):number{
       this.balance=amt+this.balance;
       return this.balance;

    }
    withdraw(amt:number):number{
        this.balance=this.balance-amt;
        return this.balance;

    } display(){
        console.log(this.accName);
        console.log(this.accNumber);
        console.log(this.balance);
    }
}
let c1=new Bank();
c1.deposit(1000);
c1.withdraw(101);
c1.display();