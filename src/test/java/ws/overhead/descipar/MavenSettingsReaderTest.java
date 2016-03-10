package ws.overhead.descipar;


import org.apache.maven.settings.Settings;
import org.apache.maven.settings.building.SettingsBuildingException;
import org.junit.Assert;
import org.junit.Test;

public class MavenSettingsReaderTest {

  MavenSettingsReader mavenSettingsReader = new MavenSettingsReader();

  @Test
  public void testReadSettings() throws SettingsBuildingException {
    Settings settings = mavenSettingsReader.readSettings();
    Assert.assertNotNull(settings);
  }


}
