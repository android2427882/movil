package com.example.bancoproyectos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.appcompat.widget.Toolbar;


import com.google.android.material.navigation.NavigationView;


import com.google.android.material.navigation.NavigationView;

public class MenuPrincipal extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

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
        getSupportFragmentManager().beginTransaction().add(R.id.container_fragment, new MainFragment()).commit();
        setTitle("home");

        // actionBarDrawerToggle = setupDrawertoggle();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);





       // Toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
       // Toggle.setDrawerIndicatorEnabled(true);
       // Toggle.syncState();


        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container_fragment, new MainFragment());
        fragmentTransaction.commit();

    }

   /* private ActionBarDrawerToggle setupDrawertoggle(){
        return new Toggle(this,
        drawerLayout,
        toolbar,
        R.string.open,
        R.string.close
        );
    }*/
    private boolean onNavigationItemSelecte(MenuItem Item) {
        int itemId = Item.getItemId();
        switch (itemId) {
            case R.id.perfil:
                Intent click = new Intent(this, Perfil.class);
                startActivity(click);

                break;
            case R.id.mis_proyectos:
                Intent clicks = new Intent(this, MisProyectos.class);
                startActivity(clicks);

                break;
            case R.id.equipo:
                Intent clic = new Intent(this, EquipoTrabajo.class);
                startActivity(clic);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if(menuItem.getItemId() == R.id.perfil){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment,new MainFragment());
            fragmentTransaction.commit();
        }
        if(menuItem.getItemId() == R.id.mis_proyectos){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment,new MainFragment());
            fragmentTransaction.commit();
        }
        if(menuItem.getItemId() == R.id.equipo){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.commit();
        }

        return false;
    }

  /*  @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (Toggle.onOptionsItemSelected())
            return true;
        return super.onOptionsItemSelected(item);
    }*/
}
