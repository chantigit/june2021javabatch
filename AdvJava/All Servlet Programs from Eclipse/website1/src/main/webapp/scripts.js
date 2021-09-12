function one(){

    if(document.getElementById('id1').value=="")
    {
        alert('Please enter userid')
        return false
    }
    if(document.getElementById('id2').value=="")
    {
        alert('Please enter password')
        return false
    }
    else
    {
        alert('Data is Valid')
        return true
    }
}
function two(){
    var userchoice=confirm('Are u sure to delete?')
    if(userchoice==true)
    {
        return true
    }
    else{
        return false
    }
}