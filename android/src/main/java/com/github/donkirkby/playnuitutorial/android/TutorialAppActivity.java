package com.github.donkirkby.playnuitutorial.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.github.donkirkby.playnuitutorial.core.TutorialApp;

public class TutorialAppActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new TutorialApp());
  }
}
