package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentList implements Serializable{
    private ArrayList<Student> list= new ArrayList<>();

    public StudentList() {
        list.add(new Student(1001,"Nguyễn Trường Xuân","M","20/05/1999"));
        list.add(new Student(1002,"Nguyễn Thị Thanh Xuân","F","20/05/2000"));
        list.add(new Student(1003,"Nguyễn Minh Xuân","M","20/05/2001"));
        list.add(new Student(1004,"Nguyễn Thanh Xuân","M","20/05/2002"));
        list.add(new Student(1005,"Nguyễn Trường Sinh","F","20/05/1998"));
    }
    //-------------------------------------------------------------------
    public ArrayList<Student> add(Student s){
        list.add(s);
        return list;
    }
    //-------------------------------------------------------------------
    public ArrayList<Student> remove(Student s){
        for(Student t:list){
            if(t.getId()==s.getId()) list.remove(t);
        }
        return list;
    }
    //-------------------------------------------------------------------
    public ArrayList<Student> search(Predicate<Student> p){
        ArrayList<Student> kq=new ArrayList<Student>();
        for(Student s:list)
            if(p.test(s)) kq.add(s);
        return kq;
    }    
    //-------------------------------------------------------------------
    public ArrayList<Student> getAll(){
        return list;
    } 
    //-------------------------------------------------------------------
    public static void main(String[] a){
        ArrayList<Student> rList=null;
        StudentList sList= new StudentList();
        rList=sList.search(new Predicate(){
           public boolean test(Object s){
            return ((Student)s).getId()==1005;
           }
        });
        System.out.println(rList); 
    }
}
