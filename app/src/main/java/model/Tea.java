package model;

import com.example.teaapp.R;

import java.util.ArrayList;
import java.util.List;

public class Tea {
    public String id;
    public String name;
    public int photo;
    public int price;

    public Tea(String id, String name, int photo, int price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }
    public static List<Tea> teaList(){
        List<Tea> list = new ArrayList<>();
        //CREAR LA LISTA DE TÉ
        list.add(new Tea("1","Black Tea", R.drawable.black_tea,1200));
        list.add(new Tea("2","Chamomile Tea",R.drawable.chamomile_tea,1200));
        list.add(new Tea("3","Green Tea",R.drawable.green_tea,1200));
        list.add(new Tea("4","Honey Lemon Tea",R.drawable.honey_lemon_tea,1200));
        list.add(new Tea("5","Oolong Tea",R.drawable.oolong_tea,1200));
        list.add(new Tea("6","White Tea",R.drawable.white_tea,1200));
        return list;
    }
}
