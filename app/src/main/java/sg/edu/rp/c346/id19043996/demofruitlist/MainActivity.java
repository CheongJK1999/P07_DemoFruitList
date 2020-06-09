package sg.edu.rp.c346.id19043996.demofruitlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etFruit;
    Button btnAdd;
    ListView lv;

    ArrayList<String> fruitList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFruit = findViewById(R.id.editTextFruit);
        btnAdd = findViewById(R.id.buttonAdd);
        lv = findViewById(R.id.listView);

        fruitList = new ArrayList<>();
        fruitList.add("apple");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruitList);

        lv.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String fruitName = etFruit.getText().toString();
                fruitList.add(fruitName);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
