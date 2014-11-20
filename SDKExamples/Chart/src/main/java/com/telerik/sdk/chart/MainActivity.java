package com.telerik.sdk.chart;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.telerik.manual.tests.R;

import fragments.axes.DateTimeContinuousAxisFragment;
import fragments.axes.MultipleAxesFragment;
import fragments.behaviors.ChartSelectionBehaviorFragment;
import fragments.behaviors.PanAndZoomFragment;
import fragments.series.CandleStickSeriesFragment;
import fragments.series.DoughnutSeriesFragment;
import fragments.series.IndicatorSeriesFragment;
import fragments.series.OhlcSeriesFragment;
import fragments.series.PieSeriesFragment;
import fragments.series.ScatterBubbleSeriesFragment;
import fragments.series.ScatterPointSeriesFragment;
import fragments.series.SplineAreaSeriesFragment;
import fragments.series.StackAreaSeriesFragment;
import fragments.series.StackBarSeriesFragment;
import fragments.series.StackSplineAreaSeriesFragment;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = this.getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.container, new ChartSelectionBehaviorFragment());
        transaction.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}