package com.wakaleo.gameoflife.webtests;

import com.wakaleo.gameoflife.webtests.steps.PlayerSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

(ThucydidesRunner.class)

@WithTag("Storing simulation history")
public class WhenTheUserStoresGameHistory {

    
    public void aUserShouldBeAbleToSaveASimulationForFutureUse() {}

    @Test
    public void aUserShouldBeAbleToListAllTheSavedSimulations() {}

    @Test
    public void aUserShouldBeAbleToReplayAStoredSimulation() {}
}
