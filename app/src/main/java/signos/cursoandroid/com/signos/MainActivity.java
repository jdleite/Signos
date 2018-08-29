package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {


    private ListView listaSig;
    private String signos [] = {"Áries",
             "Touro",
             "Gêmeos",
             "Câncer",
             "Leio",
             "Virgem",
            "Libra" ,
            "Escorpião",
             "Sagitário",
          "Capricórnio",
           "Aquário",
            "Peixes"};

    private String []perfil  = { "1","2","3","4","5","6","7","8","9","10","11","12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaSig = (ListView) findViewById(R.id.lstId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,signos);


        listaSig.setAdapter(adaptador);


        listaSig.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codPos = position;
                Toast.makeText(getApplicationContext(),perfil[codPos],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
