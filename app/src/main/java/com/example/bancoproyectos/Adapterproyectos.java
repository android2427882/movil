package com.example.bancoproyectos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapterproyectos extends RecyclerView.Adapter<Adapterproyectos.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<Proyectos> model;

    private View.OnClickListener listener;

    public Adapterproyectos(Context context, ArrayList<Proyectos> model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.lista_proyecto, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnclickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nombres = model.get(position).getNombre();
        String fechanacimiento = model.get(position).getFechanacimiento();
        int imageid = model.get(position).getImagenid();
        holder.nombres.setText(nombres);
        holder.fechancimiento.setText(fechanacimiento);
        holder.imagen.setImageResource(imageid);
    }


    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombres, fechancimiento;
        ImageView imagen;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            nombres = itemView.findViewById(R.id.nombres);
            fechancimiento = itemView.findViewById(R.id.creacion);
            imagen = itemView.findViewById(R.id.proyecto);
        }

    }

}
