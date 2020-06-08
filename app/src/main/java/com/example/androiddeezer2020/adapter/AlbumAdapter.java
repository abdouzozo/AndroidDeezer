package com.example.androiddeezer2020.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androiddeezer2020.ListAlbumsActivity;

import com.example.androiddeezer2020.R;
import com.example.androiddeezer2020.service.data.Album;
import com.squareup.picasso.Picasso;

//import com.example.androiddeezer2020.service.data.Artist;
import com.example.androiddeezer2020.service.data.Album;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {

    private static final String TAG = "AdapterAlbum";
    public Context context;
    private List<Album> listAlbum;

    public AlbumAdapter(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }


    @Override
    public AlbumAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_album, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Album album = listAlbum.get(position);

        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textAlbumName.setText(album.getTitle());

        Picasso.get().load(album.getCoverMedium()).into(holder.imageView);

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "clique sur <" + album.getTitle() + ">");
                Intent intent = new Intent(view.getContext()

            }
        });*/

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listAlbum.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textAlbumName;
        private ImageView imageView;
        private View itemView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            textAlbumName = (TextView) itemView.findViewById(R.id.textAlbumName);
            imageView = (ImageView) itemView.findViewById(R.id.imageAlbum);
        }
    }

    /* public AlbumAdapter(@NonNull View itemView) {
        super(itemView);
    }*/
}
