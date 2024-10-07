public class singleton{
    public static int obj_count=0;
    private singleton(){
        obj_count++;
    }
    private static singleton uniqueinstance;
    public static singleton getinstance(){
        if(uniqueinstance==null)
            uniqueinstance=new singleton();
        return uniqueinstance;
    }
}