//R.Find total,average and grade of 3 subject marks
        function totalMarks(s1,s2,s3)
        {
            var result=s1+s2+s3;
            //EOF : i.Print result   ii.Return result 
            return result;
        }
        function averageMarks(s1,s2,s3)
        {
            var result;
            result=totalMarks(s1,s2,s3)/3
            //EOF : i.Print result   ii.Return result 
            return result;
        }
        function gradeOfSubjects(s1,s2,s3)
        {
            var avg=averageMarks(s1,s2,s3); 
            var res='';
            if(avg>70)
                res='A'
            else if(avg<70 && avg >60)
                res='B'
            else if(avg<60 && avg>50)
                res='C'
            else
                res='D'
            console.log('Grade is:',res);
        }