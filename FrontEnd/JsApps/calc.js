function sum(){
    //Get data from input1 & input2
var t1=document.getElementById('input1').value
var t2=document.getElementById('input2').value
//Perform addition
var t3=eval(t1)+eval(t2);
//Set addition result to input3
document.getElementById('input3').value  =t3
}