var proArray=[
    {price:"100",product:"mobile"},
    {price:"200",product:"laptop"},
    {price:"20",product:"top"},
    {price:"300",product:"earphones"}
    

    
]
var newpro=proArray.map(function(value){
    return value.price;
})
console.log(newpro);

var newpro1=proArray.map(value=>value.price);
console.log(newpro1);



var filterex=proArray.filter(function(value){
    if(value.price<300){
        return true;
    }
});
console.log(filterex);

const arrow=proArray.filter(value=>value.price>300);
console.log(arrow);

const sortP=proArray.sort((a,b)=>(a.product>b.product?1:-1));
console.log(sortP);