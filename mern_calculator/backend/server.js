const express = require('express');
const cors=require('cors');
const app = express();
app.use(cors());
app.listen(5000,() =>{
    console.log('Server running at port 5000');
});
app.get('/api/calci', (req, res)=> {
    const x = parseInt(req.query.x);
    const y = parseInt(req.query.y);
    let op = req.query.op;
    let operator='';
    switch(op)
    {
        case 'add' : result=x+y;
                   operator='+'; break;
        case 'sub' :result=x-y; operator='-'; break;
        case 'mul' :result=x*y; operator='*'; break;
        case 'div' :result=(x/y).toFixed(2); operator='/';break;
    }
    res.send(`${x} ${operator} ${y} = ${result}`)
});
app.get('/api/factorial',(req,res) => {
    let n=parseInt(req.query.n);
    let fact=1;
    for(let i=1;i<=n;i++){
        fact*=i;
    }
    res.send(`Factorial of ${n} is ${fact}`);

});

app.get('/api/gcd',(req,res)=>{
    let a=parseInt(req.query.a);
    let b=parseInt(req.query.b);
    let x=a;
    let y=b;
    let r=0;
    if(a==0){
        r=b;
    }
    if(b==0){
        r=a;
    }
    while(a!=b){
        if(a>b){
            a=a-b;
        }
        else{
            b=b-a;
        }
        r=a;
    }
    let lcm=(x*y)/r;
    res.send(`GCD of ${x} and ${y}=${r} && LCM of ${x} and ${y} is ${lcm}`)
});
   