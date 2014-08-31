package com.github.donkirkby.playnuitutorial.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.github.donkirkby.playnuitutorial.core.TutorialApp;

public class TutorialAppJava {

  public static void main(String[] args) {
    JavaPlatform.Config config = new JavaPlatform.Config();
    // use config to customize the Java platform, if needed
    JavaPlatform.register(config);
    PlayN.run(new TutorialApp());
  }
}
