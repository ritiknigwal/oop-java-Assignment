//A-2 Ques5


class student1
{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("enter roll name and marks: ");
    }
}
class Details extends student
{
    void disp()
    {
        roll=16;name="Mahesh";marks=90;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args){
        anuj r=new anuj();
        r.input(); r.disp();
    }
}