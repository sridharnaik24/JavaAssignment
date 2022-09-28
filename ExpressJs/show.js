const express=require('express')
const app=express();
const path =require('path');
/*app.get("/",(req,res)=>{
   // res.send('<h1>welcom to express js!!!!!<h1>')
    //res.sendFile(path.join(__dirname,'public','index.html'));
});*/
app.use(express.static(path.join(__dirname,'public')));
const port=process.env.port ||4200;
app.listen(port,()=>console.log('server starter on port ${port}'));