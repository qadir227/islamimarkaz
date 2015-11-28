package model;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.islamimarkazlib.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * Created by Qadir Hussain on 11/28/2015.
 */
public class BookGridAdapter extends RecyclerView.Adapter<BookGridAdapter.ViewHolder> {

    private ArrayList<BookData> mBookDatas = new ArrayList<BookData>();
    private Context mContext;

    public BookGridAdapter(ArrayList<BookData> mBookDatas, Context mContext) {
        this.mBookDatas = mBookDatas;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.books_grid_items, null);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

//        holder.img_book_cover.setIm

//        Picasso.with(mContext)
//                .load(mBookDatas.get(position).getBookImageUrl()).placeholder(R.drawable.icon_loader)
//                .error(R.drawable.icon_image_failed)
//                .into(holder.img_book_cover);
//
//        holder.txt_book_title.setText(mBookDatas.get(position).getBookTitle());
//        holder.txt_book_author.setText(mBookDatas.get(position).getBookAuthor());
//        holder.txt_book_language.setText(mBookDatas.get(position).getBookTitle());

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_book_cover;
        ImageView img_more;
        TextView txt_book_title;
        TextView txt_book_author;
        TextView txt_book_language;

        public ViewHolder(View view) {
            super(view);

            img_book_cover = (ImageView) view.findViewById(R.id.img_book_cover);
            img_more = (ImageView) view.findViewById(R.id.img_more);
            txt_book_title = (TextView) view.findViewById(R.id.txt_book_title);
            txt_book_author = (TextView) view.findViewById(R.id.txt_book_author);
            txt_book_language = (TextView) view.findViewById(R.id.txt_book_lang);
        }


    }

}
