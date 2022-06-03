package stepdefinitions;

import abilities.ReadPdf;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;
import questions.Regulation;
import tasks.Open;
import tasks.SelectInverstment;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class VirtualInvestmentStepDefinitions {

    private EnvironmentVariables environmentVariables;
    String downloadFolder;
    String fileName;

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Chris");
    }

    @Given("^Chris entered in the Bancolombia personas section$")
    public void chrisEnteredInTheBancolombiaPersonasSection() {
        downloadFolder = environmentVariables.optionalProperty("download.filesFolder")
                .orElseThrow(IllegalArgumentException::new);

        fileName = environmentVariables.optionalProperty("statements.fileName")
                .orElseThrow(IllegalArgumentException::new);
        theActorInTheSpotlight().wasAbleTo(Open.bancolombiaHome());
    }

    @When("^he choose a virtual investment product and download the regulation$")
    public void heChooseAVirtualInvestmentProductAndDownloadTheRegulation() {
        theActorInTheSpotlight().wasAbleTo(SelectInverstment.andEnter());
    }

    @Then("^he should read the correct regulation of virtual investment$")
    public void heShouldReadTheCorrectRegulationOfVirtualInvestment() throws InterruptedException, IOException {
        String statementFilePath = String.format("%s/%s", downloadFolder, fileName);
        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));
        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();
        theActorInTheSpotlight().should(seeThat(Regulation.isCorrect(pdfText)));
    }

}
