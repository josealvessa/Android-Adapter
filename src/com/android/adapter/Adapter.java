package com.android.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.adaptersample.R;
import com.android.models.Mail;

public class Adapter extends BaseAdapter {

	private Context context;
	private List<Mail> mails;

	public Adapter(Context context, List<Mail> mails) {
		this.context = context;
		this.mails = mails;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mails.size();
	}

	@Override
	public Object getItem(int index) {
		return mails.get(index);
	}

	@Override
	public long getItemId(int index) {
		return index;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		TextView destination;
		TextView subject;
		TextView time;

		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(
					R.layout.list_item, parent, false);

			destination = (TextView) convertView
					.findViewById(R.id.destination_mail);
			subject = (TextView) convertView.findViewById(R.id.subject);
			time = (TextView) convertView.findViewById(R.id.time);

			convertView.setTag(new MailViewHolder(destination, subject, time));

		} else {

			MailViewHolder holder = (MailViewHolder) convertView.getTag();

			destination = holder.destination;
			subject = holder.subject;
			time = holder.time;
		}

		destination.setText(mails.get(position).getDestination());
		subject.setText(mails.get(position).getSubject());
		time.setText(mails.get(position).getTime());

		return convertView;
	}

	private static class MailViewHolder {
		public final TextView destination;
		public final TextView subject;
		public final TextView time;

		public MailViewHolder(TextView destination, TextView subject,
				TextView time) {
			this.destination = destination;
			this.subject = subject;
			this.time = time;
		}
	}

}
