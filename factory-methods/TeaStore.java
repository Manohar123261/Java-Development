public abstract class TeaStore{
     Tea tea;
     void order(String type){
         tea=CreateTea(type);
         tea.boil();
         tea.serve();
     }
     abstract Tea CreateTea(String type);
}
