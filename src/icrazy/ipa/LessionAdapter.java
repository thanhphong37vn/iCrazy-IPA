package icrazy.ipa;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Title : Adapter Layer<br/>
 * Description : <br/>
 * Copyright : Copyright (c) 2015<br/>
 * Company : Aptech Aprotrain <br/>
 * Create on Aug 11, 2015 10:40:05 AM
 * 
 * @author <a href="mailto:hoanpmp@gmail.com">HoanPham</a>
 * @version Aug 11, 2015 10:40:05 AM
 */
public class LessionAdapter extends ArrayAdapter<Lession> {
	Context mContext;
	ArrayList<Lession> mLstLession = new ArrayList<Lession>();

	public LessionAdapter(Context context, int resource,
			ArrayList<Lession> objects) {
		super(context, resource, objects);
		this.mContext = context;
		this.mLstLession = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView = convertView;
		ViewHolder viewHolder = null;
		if (rowView == null) {
			LayoutInflater inflate = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflate.inflate(R.layout.lession_listview_item, null);
			viewHolder = new ViewHolder();
			viewHolder.lession_listview_item_subject = (TextView) rowView
					.findViewById(R.id.lession_listview_item_subject);
			viewHolder.lession_listview_item_content = (TextView) rowView
					.findViewById(R.id.lession_listview_item_content);
			rowView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		Lession lession = mLstLession.get(position);
		if (lession.getLessionSubject() == null)
			lession.setLessionSubject("Lession");
		viewHolder.lession_listview_item_subject.setText(lession
				.getLessionSubject());
		if (lession.getLessionContent() == null)
			lession.setLessionContent("Content");
		viewHolder.lession_listview_item_content.setText(lession
				.getLessionContent());

		return rowView;
	}

	static class ViewHolder {
		TextView lession_listview_item_subject;
		TextView lession_listview_item_content;
	}
}
