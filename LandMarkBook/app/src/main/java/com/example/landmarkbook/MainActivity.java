package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;
    //static Landmark chosenLandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark rams = new Landmark("RAMS Park", "Turkey", R.drawable.ramspark);
        Landmark emirates = new Landmark("Emirates", "England", R.drawable.emirates);
        Landmark santiago = new Landmark("Bernabeu", "Spain", R.drawable.santiagobernabeu);
        Landmark camp = new Landmark("Camp Nou", "Spain", R.drawable.campnou);
        Landmark anfield = new Landmark("Anfield", "England", R.drawable.anfield);
        Landmark celtic = new Landmark("Celtic Arena", "Scotland", R.drawable.celtic);
        Landmark cruyffarena = new Landmark("Cruyff Arena", "Holland", R.drawable.cruyffarena);
        Landmark sansiro = new Landmark("San Siro", "Italy", R.drawable.sansiro);
        Landmark signaliduna = new Landmark("Signal Iduna", "Germany", R.drawable.signaliduna);
        Landmark wembley = new Landmark("Wembley", "England", R.drawable.wembley);


        landmarkArrayList.add(rams);
        landmarkArrayList.add(emirates);
        landmarkArrayList.add(santiago);
        landmarkArrayList.add(camp);
        landmarkArrayList.add(anfield);
        landmarkArrayList.add(celtic);
        landmarkArrayList.add(cruyffarena);
        landmarkArrayList.add(sansiro);
        landmarkArrayList.add(signaliduna);
        landmarkArrayList.add(wembley);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        //Adapter
        //ListView

        //mapping
        ArrayAdapter arrayAddapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAddapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, landmarkArrayList.get(position).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(position));
                startActivity(intent);
            }
        });
         */
    }
}