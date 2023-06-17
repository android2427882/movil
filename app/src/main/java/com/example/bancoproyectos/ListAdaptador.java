package com.example.bancoproyectos;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdaptador  extends RecyclerView.Adapter<ListAdaptador.ViewHolder>{
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;
    final ListAdaptador.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ListElement item);

    }

    public ListAdaptador(List<ListElement> itemList, Context context, ListAdaptador.OnItemClickListener listener){

        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
        this.listener = listener;
    }

    @Override
    public int getItemCount(){ return mData.size();}


    @Override
    public ListAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdaptador.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdaptador.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items) { mData = items; }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage ;
        TextView name, descripcion, status;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nombreProyecto);
            descripcion = itemView.findViewById(R.id.descripcionProyecto);
            status = itemView.findViewById(R.id.estadorecycler);
        }



        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            descripcion.setText(item.getDescripcion());
            status.setText(item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
