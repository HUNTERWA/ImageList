package com.example.rohit.imagelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    String[] Title={"ONE","TWO","THREE","FOUR","FIVE","SIX"};
    String[] Subtitle={"one","two","three","four","five","six"};
    String[] Address={"https://img.youtube.com/vi/IE5eFqFHoVA/default.jpg",
    "https://img.youtube.com/vi/6XlknFmyVTk/default.jpg",
    "https://img.youtube.com/vi/xmpsN_2POzY/default.jpg",
    "https://img.youtube.com/vi/0CIG_-Fd3Pw/default.jpg",
    "https://img.youtube.com/vi/RVZRd_fFYis/default.jpg",
    "https://img.youtube.com/vi/XTEwMoByVio/default.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount()
        {
            return Address.length;
        }

        @Override
        public Object getItem(int position)
        {
            return null;
        }

        @Override
        public long getItemId(int position)
        {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent)
        {
            convertView=getLayoutInflater().inflate(R.layout.custom,null);


                ImageView imageView = convertView.findViewById(R.id.imageView);
                Picasso.get().load(Address[i]).into(imageView);

                TextView title = convertView.findViewById(R.id.ttl);
                title.setText(Title[i]);

                TextView description = convertView.findViewById(R.id.description);
                description.setText(Subtitle[i]);

            return convertView;

        }
    }
}
