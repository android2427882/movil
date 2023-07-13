package com.example.bancoproyectos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListaListadoProyectosAdapter extends RecyclerView.Adapter<ListaListadoProyectosAdapter.ViewHolder> {
    private RecyclerView recyclerView;
    private  Listadoproyectos listadoproyectos;
    private ArrayList<Listadoproyectos> dataset;
    private Context context;

    public class ViewHolder extends  RecyclerView.ViewHolder {

        private TextView title;
        private ImageView image;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.title);
            image=itemView.findViewById(R.id.image);

        }

    }

    public ListaListadoProyectosAdapter (Context context){
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ListaListadoProyectosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ListaListadoProyectosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Listadoproyectos p=dataset.get(position);
        holder.title.setText(p.getNombre_proyecto());

        String url ="";

        //Glide.with(context)
                //.load(p.getImage()

               // )

               // .into(holder.image);
    }

    @Override
    public int getItemCount() { return dataset.size();}

    public void add(ArrayList<Listadoproyectos>listaproyectos) {
        dataset.addAll( listaproyectos);
        notifyDataSetChanged();
    }
}

