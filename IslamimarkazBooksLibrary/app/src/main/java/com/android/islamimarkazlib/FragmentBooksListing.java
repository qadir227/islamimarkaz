package com.android.islamimarkazlib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import model.BookData;
import model.BookGridAdapter;

/**
 * Created by Qadir Hussain on 10/31/2015.
 */
public class FragmentBooksListing extends Fragment {

    private RecyclerView mRecyclerView;
    private BookGridAdapter mBookGridAdapter;
    private ArrayList<BookData> mBookDatas = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_books_listing, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        // 2. set layoutManger
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        // 3. create an adapter
        mBookGridAdapter = new BookGridAdapter(mBookDatas, getActivity());
        // 4. set adapter
        mRecyclerView.setAdapter(mBookGridAdapter);
        // 5. set item animator to DefaultAnimator
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


        return view;
    }
}
