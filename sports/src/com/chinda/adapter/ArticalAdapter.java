package com.chinda.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticalAdapter extends BasicAdapter<Article>{
	public ArticalAdapter(Activity context){
		super(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;
		return null;
	}
	
	public class ViewHolder{
		ImageView news_img;
		TextView article_title;
		TextView article_subtitle;
	}
}