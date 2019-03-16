package com.example.massira;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCustomAdapter myadapter = new MyCustomAdapter(this);
        ListView listview=findViewById(R.id.listview);
        /*listview.setAdapter(myadapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "massira....", Toast.LENGTH_SHORT).show();
            }
    });*/
        }

    public void buClick(View view) {
        Intent intent=new Intent(this,AjoutManifestation.class);
        startActivity(intent);
    }

    class MyCustomAdapter extends BaseAdapter {
               private ArrayList<Manifestation> tab=new ArrayList<Manifestation>();
        Context context;
        MyCustomAdapter(Context context){
            this.context=context;
        }
        public int getCount(){
            return tab.size();
        }
        public Object getItem (int position) {
            return tab.get(position);
        }
        public long getItemId (int position){
            return position;
        }
        public View getView(int i, View view, ViewGroup viewGroup){
            LayoutInflater layoutInflater=getLayoutInflater();
            View view1=layoutInflater.inflate(R.layout.liste_item,null);
            TextView txt =view1.findViewById(R.id.tv);
            TextView txt2=view1.findViewById(R.id.tv2);
            TextView txt3 =view1.findViewById(R.id.tv3);
            TextView txt4 =view1.findViewById(R.id.tv4);
            txt.setText(tab.get(i).getId());
            txt2.setText(tab.get(i).getDate().toString());
            txt3.setText(tab.get(i).getLieu());
            txt4.setText("x");

            return view1;
        }

    }
}
