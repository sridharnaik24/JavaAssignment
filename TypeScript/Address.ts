import {Student} from "./Student"
class Address extends Student{
    city:string="bangalore";
    state:string="karnataka";
    pincode:number=10000000.0;
    display(){
        super.display();
        console.log(this.city);
        console.log(this.state);
        console.log(this.pincode);
    }

}
let e1=new  Address();
e1.display();