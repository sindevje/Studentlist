package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class that creates an Array of Students and populates it
 * with 5 students from the current section and then iterates over the
 * list to print each name.
 * @author dancye, Jan 2019
 */
public class StudentList {
    
    public static void main(String[] args)
    {
        //comment to be commit
        //comment to commit to netbeans
        //comment to be fetched and merged
       Student [] studentList = new Student[1];//change size before running
       Student s1 = new Student();
       s1.setName("Liz Dancy");
       studentList[0]=s1;
       //fill in 4 student names before running
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
        
    }
    
}
