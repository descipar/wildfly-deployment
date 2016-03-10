package ws.overhead.descipar;

import org.apache.maven.settings.Settings;
import org.apache.maven.settings.building.*;
import org.apache.maven.settings.io.DefaultSettingsReader;
import org.apache.maven.settings.io.DefaultSettingsWriter;
import org.apache.maven.settings.validation.DefaultSettingsValidator;

import java.io.File;

public class MavenSettingsReader {


  public void readSettingsFromMaven(){
    Settings settings = null;
    try {
      settings = getSettings();
    } catch (SettingsBuildingException e) {
      e.printStackTrace();
    }
    String test = settings.getLocalRepository();

  }


  public static Settings getSettings() throws SettingsBuildingException {
    DefaultSettingsBuilder defaultSettingsBuilder = new DefaultSettingsBuilder();
    DefaultSettingsBuildingRequest request = new DefaultSettingsBuildingRequest();
    File userSettingsFile = new File(System.getProperty("user.home"), ".m2" + File.separator + "settings.xml");
    request.setUserSettingsFile(userSettingsFile);
    defaultSettingsBuilder.setSettingsWriter(new DefaultSettingsWriter());
    defaultSettingsBuilder.setSettingsReader(new DefaultSettingsReader());
    defaultSettingsBuilder.setSettingsValidator(new DefaultSettingsValidator());
    SettingsBuildingResult build = defaultSettingsBuilder.build(request);
    return build.getEffectiveSettings();
  }





}
