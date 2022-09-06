const fs=require('fs');
const path=require('path');
fs.writeFile(path.join(__dirname,'\test','student.txt'),'sid'
,(err)=>{
    if(err) throw err;
    console.log("students details");

}
)