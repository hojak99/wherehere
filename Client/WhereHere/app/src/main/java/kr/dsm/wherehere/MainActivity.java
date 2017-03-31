package kr.dsm.wherehere;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private MapFragment mMapFragment;
    private RankingFragment rankingFragment;
    private WritePostFragment writePostActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        fragmentManager = getSupportFragmentManager();

        mMapFragment = new MapFragment();
        writePostActivity = new WritePostFragment();

        fragmentManager.beginTransaction().replace(R.id.content, mMapFragment).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_map:
                    fragmentTransaction.replace(R.id.content, mMapFragment).commit();
                    return true;
                case R.id.navigation_ranking:
                    fragmentTransaction.replace(R.id.content, new RankingFragment()).commit();
                    return true;
                case R.id.navigation_review:
                    fragmentTransaction.replace(R.id.content, writePostActivity).commit();
                    return true;
            }
            return false;
        }
    };

}
