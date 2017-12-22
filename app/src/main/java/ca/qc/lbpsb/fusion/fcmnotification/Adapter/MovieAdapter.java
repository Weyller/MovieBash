package ca.qc.lbpsb.fusion.fcmnotification.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import ca.qc.lbpsb.fusion.fcmnotification.Model.Movies;

import ca.qc.lbpsb.fusion.fcmnotification.R;

/**
 * Created by Administrator on 12/3/2017.
 */


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Movies> itemList;

    public MovieAdapter(Context mCtx, List<Movies> itemList) {
        this.mCtx = mCtx;
        this.itemList = itemList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.movie_item, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Movies movie = itemList.get(position);

        //loading the image
        Glide.with(mCtx)
                .load(R.drawable.board_logo)
                .into(holder.imageView);

       // holder.textViewTitle.setText(movie.getTitle());
       // holder.textViewMessage.setText(movie.getMessage());
       // String priority =  String.valueOf(movie.getPriority());



    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewMessage, textViewPriority;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewMessage = itemView.findViewById(R.id.textViewMessage);
            textViewPriority = itemView.findViewById(R.id.textViewPriority);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}