package com.example.wper_smile.fragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.wper_smile.fragment.words.WordsContent;
import android.app.Fragment;

public class MainActivity extends AppCompatActivity
        implements ItemFragment.OnListFragmentInteractionListener,
        DetailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onListFragmentInteraction(WordsContent.WordItem item){
        //Bundle类的作用是传递数据
        Bundle arguments=new Bundle();
        arguments.putString("id",item.id);

        Fragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}