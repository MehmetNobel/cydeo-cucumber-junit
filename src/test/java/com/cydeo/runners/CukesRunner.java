package com.cydeo.runners;


import com.cydeo.pages.CydeoWebTablePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                //"pretty",   // to show the inf on the console.actually optional, not needed so much.
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"    // look at cucumber / js/ overview-features
        },  // generate the report
        features = "src/test/resources/features",  // get/copy content root
        glue = "com/cydeo/step_definitions",        // get/copy source root
        dryRun = false,
        tags = "@saucelab"    // if we do not write anything then it will run every feature file scenario
        // ctrl+shift+F to find if i use this tag somewhereelse.
        // publish = true   // in console some report address will be occured and this is to publish in cucumber io website to share someoneelse.
)

public class CukesRunner {


}
