package com.example.bancoproyectos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.MenuItem;


import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.widget.Toolbar;


import com.example.bancoproyectos.perfil.Perfil;
import com.google.android.material.navigation.NavigationView;


import java.io.Serializable;

public class MenuPrincipal extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    DetalleProyectoFragment detalleProyectoFragment;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.perfil:
                        Intent i = new Intent(MenuPrincipal.this, Perfil.class);
                        startActivity(i);
                        return true;

                    case R.id.mis_proyectos:
                        Intent in = new Intent(MenuPrincipal.this, MisProyectos.class);
                        startActivity(in);
                        return true;


                    default:
                        return false;
                }
            }
        });
    }

        private void remplaceFragment(Fragment fragment){
            FragmentManager frgManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = frgManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmenPadre, fragment);
            fragmentTransaction.commit();
        }

        public void enviarProyecto(Listadoproyectos listadoproyectos) {

            detalleProyectoFragment = new DetalleProyectoFragment();

            Bundle bundleEnvio = new Bundle();

            bundleEnvio.putSerializable("objeto", (Serializable) listadoproyectos);
            detalleProyectoFragment.setArguments(bundleEnvio);


            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, detalleProyectoFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
    }
}
