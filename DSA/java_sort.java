import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }
        
        studentList.sort(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if(s1.getCgpa() == s2.getCgpa()){
                    if (s1.getFname() == s2.getFname())
                        return String.valueOf(s1.getId()).compareTo(String.valueOf(s2.getId()));
                    else
                        return s1.getFname().compareTo(s2.getFname());
                } 
                else if(s1.getCgpa()<s2.getCgpa())
                {
                    return 1;
                }
                 else
                {
                    return -1;
                }
            }
        });
      
          for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}