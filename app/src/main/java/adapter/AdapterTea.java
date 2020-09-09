package adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaapp.R;

import java.util.List;

import model.Tea;

public class AdapterTea extends RecyclerView.Adapter<AdapterTea.TeaHolder> {
    //IMPLEMENTAR LOS METODOS
    //START ADAPTER

    public Activity activity;
    public List<Tea> data;
    public int item_layout;

    public AdapterTea(Activity activity, List<Tea> data, int item_layout) {
        this.activity = activity;
        this.data = data;
        this.item_layout = item_layout;
    }
    //PATRON DE DISEÑO Y CARGA LA LISTA COMO UN FOR RECORRIENDO LA LISTA
    @NonNull
    @Override
    //ENCARGADO DE CREAR LA INTERFAZ
    public TeaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(item_layout,parent,false);
        return new TeaHolder(view);
    }

    //TOMA EL PRIMER ELEMENTO DE LA LISTA Y RECIBE LA POSICION DE LA LISTA Y SE LO ENTREGA A LA INTERFAZ
    @Override
    public void onBindViewHolder(@NonNull TeaHolder holder, int position) {
        Tea tea = data.get(position);
        holder.item_title.setText(tea.name);
        holder.item_img.setImageResource(tea.photo);
        holder.id = tea.id;
    }

    //son tantos elementos y sabe cuantas veces se repite el proceso
    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TeaHolder extends RecyclerView.ViewHolder {
        public String id;
        public ImageView item_img;
        public TextView item_title;

        public TeaHolder(@NonNull View itemView) {
            //Constructor
            super(itemView);
            item_img = itemView.findViewById(R.id.item_img);
            item_title = itemView.findViewById(R.id.item_title);
        }
    }
}//End adapter tea
