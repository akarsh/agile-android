package com.riis.zodiac;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listSigns = getListView();
        ArrayAdapter<Zodiac> listAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Zodiac.signs);
        listSigns.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(MainActivity.this, ZodiacDetailActivity.class);
        intent.putExtra(ZodiacDetailActivity.EXTRA_SIGN, (int) id);
        startActivity(intent);
    }
}
