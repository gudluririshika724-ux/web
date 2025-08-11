const mongoose=require('mongoose');
const courseSchema=new mongoose.Schema({
    code:{type:String,required: true,unique:true},
    name:{type:String,required: true},
    credits : {type: Number,required:true}
});

Module.exports=mongoose.model('Courses',courseSchema);