package br.edu.fatecsjc;

import br.edu.fatecsjc.models.ExecucaoPythonTest;
import br.edu.fatecsjc.models.ProblemaTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@Suite.SuiteClasses({ProblemaTest.class, ExecucaoPythonTest.class})
public class AllTests {

}
