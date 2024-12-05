public class Department{
   private String name;
   private List<professor> professor


   public Department(String name){
      this.name = name;
      this.professors = new ArrayList<>();
   }
public void addprofessor(professor professor){
   professors.add(professor);
}
public void removeProfessor(professor professor){
   professors.remove(Professor);
}
public List<Professor> getprofessors(){
   return professors;
}
public String getName(){
return name;
}

public void addStudent(Student student){
   System.out.println(student.getName() + "added to" + this.name);
}
}

class professor{
   private String name;
   private String Department;

   public professor(String name. String  Department){
      this.name = name;
      this.Department = Department;
   }
   public String getName(){
      return name;
   }
   public String getDepartment(){
      return Department;
   }
}


   class Student{
      private String name;
      private String major
      public Student(Stringname, String major)
   { 
   This.name = name;
   this.name = major;
}
public String  getName(){
   return name;
}
public String getMajor(){
   return major
}
   }
   
   public class University{
      private String name;
      private List<Department> departments;

      public University(String name){
         this.name = name;
         this.Department = new ArrayList<>();
      }
      public void removeDepartment(Department department){
         department.add(department);
      }
      for(Professor prof: department.getprofessors()){
         System.out,println("Removing professor" + prof.getName());
      }
      departments.remove(department);
   }

   public void 
   ListAllStudentAndProfessors(){
      for (Department dept : department){
         System.out.println("nDepartment:" + dept.getName());
         System.out.println("Professors:");
         for(professor prof : dept.getprofessors())
      }
   }
   public class void main(String[] args){
      University uni = new University("Example University");
      Department sw = new Department("sowfware engeneering");
      Department gd = new Department("Graphic Design");

   Professor p1 = new professor("Mr Dirane", "software engeneering");
   Professor p2 = new professor("Mis Nadine", "Graphic design");

   sw.addprofessor(p1);
   gd.addprofessor(p2);
   uni.addprofessor(sw);
   uni.addprofessor(gd);
   uni.ListAllStudentAndProfessors();

   Student s1 = new Student("Nadine", "Software engeneering");
   Student s2 = new Student("chara", "Grapgic design");
   sw.addStudent(s1);
   gd,addStudent(s2);

   uni.ListAllStudentAndProfessors();
   uni.removeDepartment(sw);
   uni.ListAllStudentAndProfessors();
   
   }
   