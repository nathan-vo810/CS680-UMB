package edu.umb.cs680.hw06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DVDPlayerTest {

    @Test
    public void stateIsDrawerClosedPlayingWhenPlayBtnPushedAfterCreate() {
        DVDPlayer p = DVDPlayer.getInstance();
        p.playButtonPushed();
        assertEquals(DrawerClosedPlaying.getInstance(), p.getCurrentState());
    }

    @Test
    public void stateIsDrawerOpenWhenCloseOpenBtnPushedWhilePlaying() {
        DVDPlayer p = DVDPlayer.getInstance();
        p.playButtonPushed();
        p.openCloseButtonPushed();
        assertEquals(DrawerOpen.getInstance(), p.getCurrentState());
    }

    @Test
    public void stateIsDrawerClosedNotPlayingWhenStopBtnPushedWhilePlaying() {
        DVDPlayer p = DVDPlayer.getInstance();
        p.playButtonPushed();
        p.stopButtonPushed();
        assertEquals(DrawerClosedNotPlaying.getInstance(), p.getCurrentState());
    }

}
