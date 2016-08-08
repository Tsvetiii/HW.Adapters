package qkikakiood.com.hwadapters;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

import qkikakiood.com.hwadapters.Adapter.Adapter;
import qkikakiood.com.hwadapters.cmn.Post;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView mRecyclerView;
    protected Adapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        ArrayList<Post> posts = new ArrayList<>();
        initPosts(posts);
        mAdapter = new Adapter(posts);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void initPosts(ArrayList<Post> posts) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Post post1 = new Post( "Samoyed1", getDrawable(R.drawable.samoyed),false,false,15,220 );
            posts.add(post1);
            Post post2 = new Post( "Samoyed2", getDrawable(R.drawable.samoyed),false,false,154,220 );
            posts.add(post2);
            Post post3 = new Post( "Samoyed3", getDrawable(R.drawable.samoyed),false,false,164,2012 );
            posts.add(post3);
            Post post4 = new Post( "Samoyed4", getDrawable(R.drawable.samoyed),false,false,1462,2350 );
            posts.add(post4);
            Post post5 = new Post( "Samoyed5", getDrawable(R.drawable.samoyed),false,false,1414,204134 );
            posts.add(post5);
        }

    }
}
