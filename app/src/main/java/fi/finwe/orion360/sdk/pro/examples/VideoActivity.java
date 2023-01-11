package fi.finwe.orion360.sdk.pro.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fi.finwe.orion360.sdk.pro.examples.minimal.MinimalVRVideoFilePlayer;
import fi.finwe.orion360.sdk.pro.viewport.OrionDisplayViewport;

public class VideoActivity extends AppCompatActivity {
    void map(int id, RectF[] view, OrionDisplayViewport.CoordinateType type){
       Button b= findViewById(id);
       b.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Intent i=new Intent(VideoActivity.this, MinimalVRVideoFilePlayer.class);

               Bundle bundle=new Bundle();
               bundle.putBinder("view",new ObjectWrapperForBinder(view));
               bundle.putBinder("type",new ObjectWrapperForBinder(type));
               i.putExtras(bundle);
              startActivity(i);
           }
       });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        map(R.id.splitVerticalUnfixed,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_VERTICAL, OrionDisplayViewport.CoordinateType.UNFIXED);
        map(R.id.splitVerticalUnfixedLandscape,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_VERTICAL, OrionDisplayViewport.CoordinateType.UNFIXED_LANDSCAPE);
        map(R.id.splitVerticalUnfixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_VERTICAL, OrionDisplayViewport.CoordinateType.UNFIXED_PORTRAIT);
        map(R.id.splitVerticalFixedNatural,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_VERTICAL, OrionDisplayViewport.CoordinateType.FIXED_NATURAL);
        map(R.id.splitVerticalFixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_VERTICAL, OrionDisplayViewport.CoordinateType.FIXED_PORTRAIT);
        map(R.id.splitVerticalFixedLandcape,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_VERTICAL, OrionDisplayViewport.CoordinateType.FIXED_LANDSCAPE);


        map(R.id.splitHorizontalUnfixed,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_HORIZONTAL, OrionDisplayViewport.CoordinateType.UNFIXED);
        map(R.id.splitHorizontalUnfixedLandscape,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_HORIZONTAL, OrionDisplayViewport.CoordinateType.UNFIXED_LANDSCAPE);
        map(R.id.splitHorizontalUnfixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_HORIZONTAL, OrionDisplayViewport.CoordinateType.UNFIXED_PORTRAIT);
        map(R.id.splitHorizontalFixedNatural,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_HORIZONTAL, OrionDisplayViewport.CoordinateType.FIXED_NATURAL);
        map(R.id.splitHorizontalFixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_HORIZONTAL, OrionDisplayViewport.CoordinateType.FIXED_PORTRAIT);
        map(R.id.splitHorizontalFixedLandcape,OrionDisplayViewport.VIEWPORT_CONFIG_SPLIT_HORIZONTAL, OrionDisplayViewport.CoordinateType.FIXED_LANDSCAPE);


        map(R.id.fullUnfixed,OrionDisplayViewport.VIEWPORT_CONFIG_FULL, OrionDisplayViewport.CoordinateType.UNFIXED);
        map(R.id.fullUnfixedLandscape,OrionDisplayViewport.VIEWPORT_CONFIG_FULL, OrionDisplayViewport.CoordinateType.UNFIXED_LANDSCAPE);
        map(R.id.fullUnfixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_FULL, OrionDisplayViewport.CoordinateType.UNFIXED_PORTRAIT);
        map(R.id.fullFixedNatural,OrionDisplayViewport.VIEWPORT_CONFIG_FULL, OrionDisplayViewport.CoordinateType.FIXED_NATURAL);
        map(R.id.fullFixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_FULL, OrionDisplayViewport.CoordinateType.FIXED_PORTRAIT);
        map(R.id.fullFixedLandcape,OrionDisplayViewport.VIEWPORT_CONFIG_FULL, OrionDisplayViewport.CoordinateType.FIXED_LANDSCAPE);


        map(R.id.stackedUnfixed,OrionDisplayViewport.VIEWPORT_CONFIG_STACKED_VERTICAL, OrionDisplayViewport.CoordinateType.UNFIXED);
        map(R.id.stackedUnfixedLandscape,OrionDisplayViewport.VIEWPORT_CONFIG_STACKED_VERTICAL, OrionDisplayViewport.CoordinateType.UNFIXED_LANDSCAPE);
        map(R.id.stackedUnfixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_STACKED_VERTICAL, OrionDisplayViewport.CoordinateType.UNFIXED_PORTRAIT);
        map(R.id.stackedFixedNatural,OrionDisplayViewport.VIEWPORT_CONFIG_STACKED_VERTICAL, OrionDisplayViewport.CoordinateType.FIXED_NATURAL);
        map(R.id.stackedFixedPortrait,OrionDisplayViewport.VIEWPORT_CONFIG_STACKED_VERTICAL, OrionDisplayViewport.CoordinateType.FIXED_PORTRAIT);
        map(R.id.stackedFixedLandcape,OrionDisplayViewport.VIEWPORT_CONFIG_STACKED_VERTICAL, OrionDisplayViewport.CoordinateType.FIXED_LANDSCAPE);
    }
}