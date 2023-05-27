package com.example.bancoproyectos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        ListAdaptador listAdaptador = new ListAdaptador(elements, this);
        RecyclerView recyclerView= findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdaptador);



    }
}