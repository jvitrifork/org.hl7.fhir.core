package org.hl7.fhir.utilities;

import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

  public static final String OSX = "OS X";
  public static final String MAC = "MAC";
  public static final String WINDOWS = "WINDOWS";
  public static final String LINUX = "Linux";

  public static final String TEST_TXT = "test.txt";

  private static final String getNormalizedJavaHomeDir() {
    return System.getenv("JAVA_HOME") == null ? null : Paths.get(System.getenv("JAVA_HOME")).normalize().toString();
  }

  public static final String LINUX_TEMP_DIR = "/tmp/";
  public static final String LINUX_USER_DIR = System.getProperty("user.home") + "/";
  public static final String LINUX_JAVA_HOME = getNormalizedJavaHomeDir() + "/";

  public static final String WIN_TEMP_DIR = "c:\\temp\\";
  public static final String WIN_USER_DIR = System.getProperty("user.home") + "\\";
  public static final String WIN_JAVA_HOME = getNormalizedJavaHomeDir() + "\\";

  public static final String OSX_USER_DIR = System.getProperty("user.home") + "/";
  public static final String OSX_JAVA_HOME = getNormalizedJavaHomeDir() + "/";
  @Test
  @DisplayName("Test Utilities.path maps temp directory correctly")
  public void testTempDirPath() throws IOException {
    Assertions.assertEquals(Utilities.path("[tmp]", TEST_TXT), getTempDirectory() + TEST_TXT);
  }

  @Test
  @DisplayName("Test Utilities.path maps user directory correctly")
  public void testUserDirPath() throws IOException {
    Assertions.assertEquals(Utilities.path("[user]", TEST_TXT), getUserDirectory() + TEST_TXT);
  }

  @Test
  @DisplayName("Test Utilities.path maps JAVA_HOME correctly")
  public void testJavaHomeDirPath() throws IOException {
    Assertions.assertEquals(Utilities.path("[JAVA_HOME]", TEST_TXT), getJavaHomeDirectory() + TEST_TXT);
  }

  private String getJavaHomeDirectory() {
    String os = SystemUtils.OS_NAME;
    if (os.contains(OSX) || os.contains(MAC)) {
      return OSX_JAVA_HOME;
    } else if (os.contains(LINUX)) {
      return LINUX_JAVA_HOME;
    } else if (os.toUpperCase().contains(WINDOWS)) {
      return WIN_JAVA_HOME;
    } else {
      throw new IllegalStateException("OS not recognized...cannot verify created directories.");
    }
  }

  private String getUserDirectory() {
    String os = SystemUtils.OS_NAME;
    if (os.contains(OSX) || os.contains(MAC)) {
      return OSX_USER_DIR;
    } else if (os.contains(LINUX)) {
      return LINUX_USER_DIR;
    } else if (os.toUpperCase().contains(WINDOWS)) {
      return WIN_USER_DIR;
    } else {
      throw new IllegalStateException("OS not recognized...cannot verify created directories.");
    }
  }

  private String getTempDirectory() throws IOException {
    String os = SystemUtils.OS_NAME;
    if (os.contains(OSX) || os.contains(MAC)) {
      return getOsxTempDir();
    } else if (os.contains(LINUX)) {
      return LINUX_TEMP_DIR;
    } else if (os.toUpperCase().contains(WINDOWS)) {
      File tmp = new File("c:\\temp");
      if(tmp.exists()) {
        return WIN_TEMP_DIR;
      } else {
        return System.getProperty("java.io.tmpdir");
      }
    } else {
      throw new IllegalStateException("OS not recognized...cannot verify created directories.");
    }
  }

  /**
   * Getting the temporary directory in OSX is a little different from Linux and Windows. We need to create a temporary
   * file and then extract the directory path from it.
   *
   * @return Full path to tmp directory on OSX machines.
   * @throws IOException
   */
  public static String getOsxTempDir() throws IOException {
    File file = File.createTempFile("throwaway", ".file");
    return file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf('/')) + '/';
  }

  public static final int BOUND = 499;
  public static final Random RAND = new Random();

  public static int nextInt() {
    return 1 + RAND.nextInt(BOUND);
  }

  public static final int GB_MEASURE_JUST_OVER = (int) Math.pow(Utilities.ONE_MB, 3) + nextInt();
  public static final int GB_MEASURE_EXACT = (int) Math.pow(Utilities.ONE_MB, 3);
  public static final int GB_MEASURE_JUST_UNDER = (int) Math.pow(Utilities.ONE_MB, 3) - nextInt();

  public static final int MB_MEASURE_JUST_OVER = (int) Math.pow(Utilities.ONE_MB, 2) + nextInt();
  public static final int MB_MEASURE_EXACT = (int) Math.pow(Utilities.ONE_MB, 2);
  public static final int MB_MEASURE_JUST_UNDER = (int) Math.pow(Utilities.ONE_MB, 2) - nextInt();

  public static final int KB_MEASURE_JUST_OVER = Utilities.ONE_MB + nextInt();
  public static final int KB_MEASURE_EXACT = Utilities.ONE_MB;
  public static final int KB_MEASURE_JUST_UNDER = Utilities.ONE_MB - nextInt();

  public static final int BT_MEASURE = Utilities.ONE_MB + nextInt();
  public static final int EMPTY = 0;

  public static final int BIG_NEG = Utilities.ONE_MB * -1;

  private static final String buildMeasureLimitMessage(int size, String contains) {
    return MessageFormat.format("\"{0}\" should contain \"{1}\"", size, contains);
  }

  //TODO we've witnessed at least one intermittent failure of this test. It could be refactored to run several times to
  // trigger edge cases more often now that it provides better feedback.
  @Test
  @DisplayName("Test size bounds on file size utility.")
  void describeSizeTest() {
    Assertions.assertAll("GB Measure Limits",
      () -> assertTrue(Utilities.describeSize(GB_MEASURE_JUST_OVER).contains(Utilities.GB), buildMeasureLimitMessage(GB_MEASURE_JUST_OVER, Utilities.GB)),
      () -> assertTrue(Utilities.describeSize(GB_MEASURE_EXACT).contains(Utilities.MB), buildMeasureLimitMessage(GB_MEASURE_EXACT, Utilities.MB)),
      () -> assertTrue(Utilities.describeSize(GB_MEASURE_JUST_UNDER).contains(Utilities.MB), buildMeasureLimitMessage(GB_MEASURE_JUST_UNDER, Utilities.MB))
    );
    Assertions.assertAll("MB Measure Limits",
      () -> assertTrue(Utilities.describeSize(MB_MEASURE_JUST_OVER).contains(Utilities.MB), buildMeasureLimitMessage(MB_MEASURE_JUST_OVER, Utilities.MB)),
      () -> assertTrue(Utilities.describeSize(MB_MEASURE_EXACT).contains(Utilities.KB), buildMeasureLimitMessage(MB_MEASURE_EXACT, Utilities.KB)),
      () -> assertTrue(Utilities.describeSize(MB_MEASURE_JUST_UNDER).contains(Utilities.KB), buildMeasureLimitMessage(MB_MEASURE_JUST_UNDER, Utilities.KB))
    );
    Assertions.assertAll("KB Measure Limits",
      () -> assertTrue(Utilities.describeSize(KB_MEASURE_JUST_OVER).contains(Utilities.KB), buildMeasureLimitMessage(KB_MEASURE_JUST_OVER, Utilities.KB)),
      () -> assertTrue(Utilities.describeSize(KB_MEASURE_EXACT).contains(Utilities.BT), buildMeasureLimitMessage(KB_MEASURE_EXACT, Utilities.BT)),
      () -> assertTrue(Utilities.describeSize(KB_MEASURE_JUST_UNDER).contains(Utilities.BT), buildMeasureLimitMessage(KB_MEASURE_JUST_UNDER, Utilities.BT))
    );
    Assertions.assertAll("BT Measure Limits",
      () -> assertTrue(Utilities.describeSize(BT_MEASURE).contains(Utilities.BT), buildMeasureLimitMessage(BT_MEASURE, Utilities.BT)),
      () -> assertTrue(Utilities.describeSize(EMPTY).contains(Utilities.BT), buildMeasureLimitMessage(EMPTY,  Utilities.BT))
    );
    Assertions.assertThrows(IllegalArgumentException.class, () -> Utilities.describeSize(BIG_NEG));
  }

}