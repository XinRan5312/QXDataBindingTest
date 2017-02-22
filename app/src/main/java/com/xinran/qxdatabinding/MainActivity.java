package com.xinran.qxdatabinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import com.xinran.qxdatabinding.activites.ASimpleActivity;
import com.xinran.qxdatabinding.activites.AtrributeActvity;
import com.xinran.qxdatabinding.activites.CustomBindingActvity;
import com.xinran.qxdatabinding.activites.DynamicActvity;
import com.xinran.qxdatabinding.activites.IncludeLayoutActvity;
import com.xinran.qxdatabinding.activites.ListDataActivity;
import com.xinran.qxdatabinding.activites.ObservableActvity;
import com.xinran.qxdatabinding.activites.ResoureActivity;
import com.xinran.qxdatabinding.activites.ViewStubActvity;
import com.xinran.qxdatabinding.activites.ViewWithIdActvity;


public class MainActivity extends BaseActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openBasic(View view) {
        strartOneActivity(ASimpleActivity.class);
    }
    public void openCustomBinding(View view){
        strartOneActivity(CustomBindingActvity.class);
    }
    public void openIncludes(View view){
        strartOneActivity(IncludeLayoutActvity.class);
    }
    public void openCollections(View view) {
        strartOneActivity(ListDataActivity.class);
    }

    public void openResources(View view) {
       strartOneActivity(ResoureActivity.class);
    }

    public void openObservable(View view) {
       strartOneActivity(ObservableActvity.class);
    }

    public void openViewWithIDs(View view) {
          strartOneActivity(ViewWithIdActvity.class);
    }

    public void openViewStub(View view) {
          strartOneActivity(ViewStubActvity.class);
    }

    public void openDynamicVariables(View view) {
        strartOneActivity(DynamicActvity.class);
    }

    public void openAttributeSetters(View view) {
        strartOneActivity(AtrributeActvity.class);
    }

    public void openConverters(View view) {

    }
    private void strartOneActivity(Class<? extends BaseActivity> cls) {
         startActivity(new Intent(this,cls));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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


    @Override
    public void onClick(View view) {

    }
}
