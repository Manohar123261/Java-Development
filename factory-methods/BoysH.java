public class BoysH extends TeaStore{
    Tea tea;
    Tea CreateTea(String type){
        if(type.equals("Regular"))
            tea=new RegularTea();
        return tea;
    }
}