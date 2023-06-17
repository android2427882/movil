package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MisProyectos extends AppCompatActivity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_proyectos);

        init();
    }
    public void init(){
        elements = new ArrayList<>();

        elements.add(new ListElement("#775447", "Proyecto1","Agregue una descripcion"));
        elements.add(new ListElement("#607d8b", "Proyecto2","Agregue una descripcion"));
        elements.add(new ListElement("#F5E249", "Proyecto3","Agregue una descripcion"));
        elements.add(new ListElement("#06D454", "Proyecto4","Agregue una descripcion"));
        elements.add(new ListElement("#F79E07", "Proyecto5","Agregue una descripcion"));
        elements.add(new ListElement("#49F57C", "Proyecto6","Agregue una descripcion"));

        ListAdaptador listAdaptador = new ListAdaptador(elements, this, new ListAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(ListElement item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView= findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdaptador);

    }

    public void moveToDescription(ListElement item ){
        Intent intent = new Intent(this, DetalleProyecto.class);
        intent.putExtra("ListElement", item);
        startActivity(intent);
    }
    public void onClick(View view) {


        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }

}