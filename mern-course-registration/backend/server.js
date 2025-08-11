const express = require('express');
const mongoose=require('mongoose');
const cors=require('cors');
//const courseRoutes=require('./routes/courseRoutes');

const app=express();
app.use(cors());
app.use(express.json());

mongoose.connect('mongodb://localhost:27017/reb_db',{
    useNewUrlParser:true,
    useUnifiedTopology: true,
}).then (()=> console.log('MongoDB connected'))
  .catch((err)=>console.log(err)); 

//app.use('/api/courses',courseRoutes);

const PORT =5000;
app.listen(PORT,()=>{
    console.log(`Server running on port ${PORT}`);
});