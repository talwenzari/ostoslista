package fi.talwenzari.ostoslista;

import fi.talwenzari.ostoslista.model.ShoppingListItem;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ArrayAdapter<ShoppingListItem> arrayAdapter;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);
        arrayAdapter = new ShoppingListAdapter(this);
        listView.setAdapter(arrayAdapter);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void addItem(View view) {
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	arrayAdapter.add(new ShoppingListItem(message, arrayAdapter.getCount() + 1));
    	arrayAdapter.notifyDataSetChanged();
    	editText.setText("");
    }
}
