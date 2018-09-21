package Baitaptuan2;
import java.util.ArrayList;
	
public class Studentmanagement {
	int count = 0;
	private Student[] studentArray = new Student[100];
	
	public boolean sameGroup (Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
	}
	
	 public void studentByGroup(Student[] stuArray, int n) {
	        ArrayList<String> a = new ArrayList<String>();
	        for(int i=0;i<n;i++)
	        {
	            if(!a.contains(stuArray[i].getGroup()))
	                a.add(stuArray[i].getGroup());
	        }
	        
	        for(int i=0;i<a.size();i++)
	        {
	            int co=0;
	            System.out.println(a.get(i)+": ");
	            for(int j=0;j<n;j++)
	            {
	                if(stuArray[j].getGroup().equals(a.get(i)))
	                {
	                       System.out.println(stuArray[j].getInfo());
	                       co=1;
	                }
	            }
	            if(co==0) break;
	        }
	        
	    }
	
	 public void RemoveStudent(String id)
	    {
	        for(int i=0;i<count;i++)
	        {
	            if(studentArray[i].getId().equals(id))
	            {
	                for(int j=i;j<count-1;j++)
	                {
	                    Student stu = new Student(studentArray[j+1]);
	                    studentArray[j] = stu;
	                }
	                count--;
	                break;
	            }
	        }
	
	    }
	public static void main(String[] args) {
		Studentmanagement manager = new Studentmanagement();
		Student s1 = new Student();
		s1.setId("17020835");
		s1.setName("Nguyen Duy Khanh");
		s1.setGroup("K62CQCG");
		s1.setEmail("khanhth99@gmail.com");
		
		Student s2 = new Student(s1);
		Student s3 = new Student("17020835","Nguyen Duy Khanh","17020835@vnu.edu.vn");
		Student s4 = new Student("17020836","Nguyen Van C","17020076@vnu.edu.vn");
		Student s5 = new Student(s4);
		
		s2.getInfo();
		
		System.out.println(s2.getInfo());
		
		System.out.println(manager.sameGroup(s1, s2));
        System.out.println(manager.sameGroup(s1, s3));
        System.out.println(manager.sameGroup(s1, s4));
        System.out.println(manager.sameGroup(s1, s5));
        System.out.println(manager.sameGroup(s3, s4));
        System.out.println(manager.sameGroup(s4, s5));

        
        manager.studentArray[0]=s1;
        manager.studentArray[1]=s2;
        manager.studentArray[2]=s3;
        manager.studentArray[3]=s4;
        manager.studentArray[4]=s5;
        
        manager.count = 5;
        manager.RemoveStudent("17020835");
        manager.studentByGroup(manager.studentArray, manager.count);
		
		
	}
	
}