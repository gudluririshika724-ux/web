constexpress=require('express');
const router =express.Router();
const Courses= require('../models/Courses');

router.post('/',async (req,res)=>{
    try{
        const {code,name,credits}=req.body;
        const Courses=new Courses({code,name,credits});
        await Courses.save();
        res.status(201).json(Courses);
    } catch(err){
        res.status(400).json({error:err.message});
    }
});

router.get('/',async (req,res)=>{
    try{
        
        const Courses= await Courses.find();
        res.json(Courses);
        
    } catch(err){
        res.status(500).json({error:err.message});
    }
});
Module.exports= router; 