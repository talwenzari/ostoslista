package fi.talwenzari.ostoslista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import fi.talwenzari.ostoslista.model.ShoppingListItem;

public class ShoppingListAdapter extends ArrayAdapter<ShoppingListItem>{
	private final Context context;
	
	public ShoppingListAdapter(Context context) {
		super(context, R.layout.item_row_layout);
		this.context = context;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        View rowView = inflater.inflate(R.layout.item_row_layout, parent, false);
	        TextView textView = (TextView) rowView.findViewById(R.id.label);
	        ImageView imageView = (ImageView) rowView.findViewById(R.id.delete_icon);
	        textView.setText(getItem(position).getName());
	        imageView.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					remove(getItem(position));
					notifyDataSetChanged();
				}
			});
	        return rowView;
	}
	
}
