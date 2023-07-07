package com.example.helloworld;



import static com.example.helloworld.R.id.drawer_layout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    //navigation drawer menu
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();

        }
    }



    @Override
            public boolean onOptionsItemSelected (@NonNull MenuItem item){
                int id = item.getItemId();
                if (id == R.id.blue) {
                    Toast.makeText(this, "you clicked blue", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.green) {
                    Toast.makeText(this, "you clicked green", Toast.LENGTH_SHORT).show();

                }

                return true;
            }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_pineapple:
                Toast.makeText(this,"Hello, You have chosen Pineapple juice!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_mango:
                Toast.makeText(this,"Hello, You have chosen Mango juice!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_orange:
                Toast.makeText(this,"Hello, You have chosen Orange juice!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_apple:
                Toast.makeText(this,"Hello, You have chosen Apple juice!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_banana:
                Toast.makeText(this,"Hello, You have chosen Banana juice!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_avocado:
                Toast.makeText(this,"Hello, You have chosen Avocado juice!",Toast.LENGTH_SHORT).show();
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}




//navigation_menu





