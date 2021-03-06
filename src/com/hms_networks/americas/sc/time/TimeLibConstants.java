package com.hms_networks.americas.sc.time;

/**
 * Class of constants for the HMS MU Americas Solution Center time library for Ewon Flexy devices.
 *
 * @since 1.0
 * @author HMS Networks, MU Americas Solution Center
 */
public class TimeLibConstants {

  /**
   * Default username of Ewon Flexy devices. Used as the default username in time utilities unless
   * otherwise specified by the user.
   */
  public static final String DEFAULT_DEVICE_USERNAME = "adm";

  /**
   * Default password of Ewon Flexy devices. Used as the default password in time utilities unless
   * otherwise specified by the user.
   */
  public static final String DEFAULT_DEVICE_PASSWORD = "adm";

  /** Loopback IP address for accessing the local host. */
  public static final String LOOPBACK_IP_ADDRESS = "127.0.0.1";

  /** Date format generated by the local time offset HTML file in result files. */
  public static final String TIME_OFFSET_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

  /** Folder where time offset files should be stored on the filesystem. */
  public static final String TIME_OFFSET_DIRECTORY_PATH = "/usr/TimeOffset/";

  /** Name of the time offset file which stores the local time result. */
  public static final String TIME_OFFSET_RESULT_FILE_NAME =
      TIME_OFFSET_DIRECTORY_PATH + "TimeOffsetValue.txt";

  /** Name of the time offset file which stores the HTML that generates the local time result. */
  public static final String TIME_OFFSET_HTML_FILE_NAME =
      TIME_OFFSET_DIRECTORY_PATH + "TimeOffsetCalculator.shtm";

  /** Contents of the local time offset HTML file. */
  public static final String TIME_OFFSET_HTML_FILE_CONTENTS = "<%#ExeSSI,PRINT #0,TIME$%>";
}
