package com.example.bancoproyectos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bancoproyectos.Adapterproyectos;
import com.example.bancoproyectos.Proyectos;
import com.example.bancoproyectos.iComunicaFragments;


import java.util.ArrayList;

public class ProyectosFragment extends Fragment {

    //private OnFragmentInteractionListener mListener;


    Adapterproyectos adapterPersonas;
    RecyclerView recyclerViewPersonas;
    ArrayList<Proyectos> listaProyectos;

    EditText txtnombre;

    //Crear referencias para poder realizar la comunicacion entre el fragment detalle
    Activity actividad;
    iComunicaFragments interfaceComunicaFragments;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.proyectos_fragment,container,false);
        txtnombre = view.findViewById(R.id.txtnombre);

        recyclerViewPersonas = view.findViewById(R.id.recyclerView);
        listaProyectos = new ArrayList<>();
        cargarLista();
        mostrarData();
        return view;
    }
    public void cargarLista(){
        listaProyectos.add(new Proyectos("proyecto","31-05-1994", R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto1","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto2","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto3","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto4","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto5","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto6","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto7","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto8","31-05-1994",R.drawable.usuario));
        listaProyectos.add(new Proyectos("proyecto9","31-05-1994",R.drawable.usuario));
    }
    private void mostrarData(){
        recyclerViewPersonas.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPersonas = new Adapterproyectos(getContext(), listaProyectos);
        recyclerViewPersonas.setAdapter(adapterPersonas);

        adapterPersonas.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String nombre = listaProyectos.get(recyclerViewPersonas.getChildAdapterPosition(view)).getNombre();
               txtnombre.setText(nombre);
               Toast.makeText(getContext(), "Seleccionó: "+listaProyectos.get(recyclerViewPersonas.getChildAdapterPosition(view)).getNombre(), Toast.LENGTH_SHORT).show();

                interfaceComunicaFragments.enviarPersona(listaProyectos.get(recyclerViewPersonas.getChildAdapterPosition(view)));
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof Activity){

            this.actividad= (Activity) context;

            interfaceComunicaFragments= (iComunicaFragments) this.actividad;

        }


    }

    @Override
    public void onDetach() {
        super.onDetach();
        //mListener = null;
    }


}
