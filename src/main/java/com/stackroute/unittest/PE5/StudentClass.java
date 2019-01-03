package com.stackroute.unittest.PE5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
    public class StudentClass {
        private int id;
        private int age;
        private String name;
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public StudentClass(int a,int b,String str)
        {
            this.id=a;
            this.age=b;
            this.name=str;
        }
        public String toString()
        {
            return this.id + " " + this.age +
                    " " + this.name;
        }
    }
    class Sortbyroll implements Comparator<StudentClass>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(StudentClass a, StudentClass b)
        {
            if(a.getAge()!=b.getAge())
                return a.getAge() - b.getAge();
            else
            {
                return a.getName().compareTo(b.getName());
            }
        }
    }
    class Maintest {
        public static ArrayList<StudentClass> Sortstudent(ArrayList<StudentClass> arr) {
            Collections.sort(arr, new Sortbyroll());
            return arr;
        }

        public static void main(String[] args) {
            ArrayList<StudentClass> arr = new ArrayList<StudentClass>();
            arr.add(new StudentClass(150, 18, "John"));
            arr.add(new StudentClass(120, 15, "Kumari"));
            arr.add(new StudentClass(130, 16, "Rahul"));
            arr.add(new StudentClass(140, 16, "Sita"));
            arr.add(new StudentClass(140, 16, "Joe"));
            arr.add(new StudentClass(140, 18, "Geeta"));
            Iterator<StudentClass> custIterator = arr.iterator();
            System.out.println("Before Sorting:\n");
            while (custIterator.hasNext()) {
                System.out.println(custIterator.next());
            }
            // Collections.sort(arr,new Sortbyroll());
            ArrayList<StudentClass> res = Sortstudent(arr);
            Iterator<StudentClass> custIterator1 = arr.iterator();
            System.out.println("Before Sorting:\n");
            while (custIterator1.hasNext()) {
                System.out.println(custIterator1.next());
            }
        }
    }
