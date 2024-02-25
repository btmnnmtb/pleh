public class Train {

    Train(int size , int ves , String name ){
        this._size = size ;
        this._ves = ves ;
        this._name = name;

    }
    Train (String name){
        this._name = name ;
        this._size = 0 ;
        this._ves =  0 ;
    }
    Train(int size){

        this._size = size ;
        this._name = "Хз поезд " ;
        this._ves =  0 ;
    }
    private int _size ;
    private  int _ves ;
    private  String _name ;
     public int getize(){return _size;}
    public void set_size(int size){this._size = size ; }
    public String get_name(){return _name;}
    public void Setname(String name ){
         this._name = name ;
    }
    public int get_ves(){return  _ves; }
    public void set_vse(int ves){this._ves = ves ; }
    public void infoTrain() {
        System.out.printf("Размер поеза: %d , Вес поезда: %d , Название поезда: %s " , _size , _ves , _name);
    }


    public void trati_na_poezd(){
        int plata = 100 * _size ;
        System.out.printf("Траты на поезд в доларах %d" , plata);
    }
    public  void naznachenie_poezda(){
        if (_size <= 17){
            System.out.println("Пассажирский");

        }
        else {
            System.out.println("Грузовой");
        }
    }

}
