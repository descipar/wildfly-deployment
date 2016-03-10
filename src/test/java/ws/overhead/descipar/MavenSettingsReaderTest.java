package ws.overhead.descipar;


import org.junit.Test;

public class MavenSettingsReaderTest {

  MavenSettingsReader mavenSettingsReader = new MavenSettingsReader();

  @Test
  public void testGetSettings(){
    mavenSettingsReader.readSettingsFromMaven();

  }


}
