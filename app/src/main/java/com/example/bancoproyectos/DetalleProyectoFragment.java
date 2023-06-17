package com.example.bancoproyectos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bancoproyectos.Proyectos;

public class DetalleProyectoFragment extends Fragment {
    TextView nombre;
    ImageView imagen;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detalle_proyecto_fragment,container,false);
        nombre = view.findViewById(R.id.nombre_detalle);
        imagen = view.findViewById(R.id.imagen_detalleid);
        //Crear bundle para recibir el objeto enviado por parametro.
        Bundle objetoProyectos = getArguments();
        Proyectos proyecto = null;;
        //validacion para verificar si existen argumentos para mostrar
        if(objetoProyectos !=null){
            proyecto = (Proyectos) objetoProyectos.getSerializable("objeto");
            imagen.setImageResource(proyecto.getImagenid());
            nombre.setText(proyecto.getNombre());
        }
        return view;
    }
}
