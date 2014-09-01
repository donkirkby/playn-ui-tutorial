package com.github.donkirkby.playnuitutorial.core;

import com.github.donkirkby.playnuitutorial.core.ButtonDemoScreen;

import playn.core.Game;
import playn.core.util.Clock;
import tripleplay.game.ScreenStack;

public class TutorialApp extends Game.Default {
  // call update every 33ms (30 times per second)
  public static final int UPDATE_RATE = 33;
  
  private final Clock.Source clock = new Clock.Source(UPDATE_RATE);
  private final ScreenStack screens = new ScreenStack();

  public TutorialApp() {
    super(UPDATE_RATE);
  }

  @Override
  public void init() {
    screens.push(new ButtonDemoScreen());
  }

  @Override
  public void update(int delta) {
    clock.update(delta);
    screens.update(delta);
  }

  @Override
  public void paint(float alpha) {
      clock.paint(alpha);
      screens.paint(clock);
  }
}