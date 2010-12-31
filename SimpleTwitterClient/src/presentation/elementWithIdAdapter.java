package presentation;

import java.util.Date;
import java.util.List;

import EntityCondivise.ENotaCondivisaImp;
import TwitterSimpleClient.EntityCondivise.ENotaCondivisa;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


public class elementWithIdAdapter extends ArrayAdapter<ENotaCondivisa> {

	int resourceid;
	public elementWithIdAdapter(Context context, int textViewResourceId,List<ENotaCondivisa> objects) {
		super(context, textViewResourceId, objects);
		this.resourceid= textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LinearLayout  newView;
		ENotaCondivisa  classInstance  =  getItem(position);
		if  (convertView  ==  null)  {
		newView  =  new  LinearLayout(getContext());
		String  inflater  =  Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater  vi  =  (LayoutInflater)getContext().getSystemService(inflater);
		vi.inflate(this.resourceid,  newView,  true);
		}  else  {
		newView  =  (LinearLayout)convertView;
		}
		LinearLayout layout=(LinearLayout)newView.getChildAt(0);
		TextView text =(TextView)((LinearLayout)layout.getChildAt(0)).getChildAt(1);
		TextView username=(TextView)((LinearLayout)layout.getChildAt(1)).getChildAt(1);
		TextView data=(TextView)((LinearLayout)layout.getChildAt(2)).getChildAt(1);
		text.setText(classInstance.getContent());
		username.setText(classInstance.getScrittaDa().getUsername());
		Date date = new Date(classInstance.getData());
		data.setText(date.toLocaleString());
		return  newView;
	 }
	
}
