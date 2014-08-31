package com.github.donkirkby.playnuitutorial.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.github.donkirkby.playnuitutorial.core.TutorialApp;

public class TutorialAppHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform platform = HtmlPlatform.register(config);
    platform.assets().setPathPrefix("playnuitutorial/");
    PlayN.run(new TutorialApp());
  }
}
