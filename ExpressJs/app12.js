const express=require('express')
const app=express();
const members=[
    {
        id:1,
        name:'sid',
        email:'sid@gmail.com',
        status:'Active'
    },{
        id:2,
        name:'siddharth',
        email:'sidharth@gmail.com',
        status:'Active'

    },
    {
        id:3,
        name:'ss',
        email:'ss@gmail.com',
        status:'Active'

    }

        
    
];
app.get('/api/members',(req,res)=>{
    res.json(members);
});
const PORT = process.env.PORT||3012
app.listen(PORT,()=>console.log('server started.........'));