package Model;

/**
 * Instance of MediaItem
 *
 * This is an object of Image. Users kan link a Image-object to a certain Link object
 */
public class Image implements MediaItem {

    // Variables
    private String fileName;
    private String absPath;
    private int showDurationInSeconds;
    private Link shortcut;
    private boolean isCorrupt;

    /**
     * Constructor
     */
    public Image() {
    }

    /**
     * Overload Constructor
     *
     * @param fileName String Name of the Image-file
     * @param absPath String absolute path to Image-file
     * @param showDurationInSeconds String The number of seconds for how long we want to show the Image
     * @param shortcut Link the link to the main MediaItem
     */
    public Image(String fileName, String absPath, int showDurationInSeconds) {
        this.fileName = fileName;
        this.absPath = absPath;
        this.setShowDurationInSeconds(showDurationInSeconds);
        this.shortcut = null;
        this.isCorrupt = false;
    }

    /**
     * Get the name of the Image-file
     *
     * @return String Name of the Image-file
     */
    @Override
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Set the name of the Image-file
     *
     * @param fileName String Name of the Image-file
     */
    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Get the number of seconds for how long we want to show the Image-file
     *
     * @return int -1 This is always -1, because a Image has its own duration
     */
    @Override
    public int getShowDurationInSeconds() {
        return this.showDurationInSeconds;
    }

    /**
     * Set the number of seconds for how long we want to show the Image-file. Number of seconds can NOT be smaller than 2
     *
     * @param showDurationInSeconds int Number of seconds for showing the Image-file
     */
    @Override
    public void setShowDurationInSeconds(int showDurationInSeconds) {
        if (showDurationInSeconds < 2) {
            this.showDurationInSeconds = 2;
        } else {
            this.showDurationInSeconds = showDurationInSeconds;
        }
    }

    /**
     * Get XML
     *
     * @param XMLProject boolean Used to define difference between shortcut or not
     *
     * @return String
     */
    @Override
    public String printXML(boolean XMLProject) {
        String XMLString = "";
        XMLString += "<image>\r\n";

        if (shortcut != null) {
            XMLString += "<shortcut>" + this.shortcut.getId() + "</shortcut>\r\n";
        }

        if (XMLProject) {
            XMLString += "<filename>" + this.absPath + this.fileName + "</filename>\r\n";
        } else {
            XMLString += "<filename>" + this.fileName + "</filename>\r\n";
        }

        XMLString += "<duration>" + this.showDurationInSeconds + "</duration>\r\n";
        XMLString += "</image>\r\n";
        return XMLString;
    }

    /**
     * Get the absolute path of the file
     *
     * @return String absolute path
     */
    @Override
    public String getAbsolutePath() {
        return this.absPath;
    }

    /**
     * Set the absolute path to the file
     *
     * @param absPath String absolute path to file
     */
    @Override
    public void setAbsolutePath(String absPath) {
        this.absPath = absPath;
    }

    /**
     * Set whether this Text object is a shortcut to a Link or not
     *
     * @param isShortcut Link
     */
    @Override
    public void setShortcut(Link isShortcut) {
        this.shortcut = isShortcut;
    }

    /**
     * Get shortcut for this Link
     *
     * @return Link
     */
    @Override
    public Link getShortcut() {
        return this.shortcut;
    }

    /**
     * Indicates if this Text object is corrupt. Is true if the path to file doesn't exists anymore
     *
     * @return boolean
     */
    @Override
    public boolean isCorrupt() {
        return this.isCorrupt;
    }

    /**
     * Set if this Text object is corrupt or not. Is true if the path to file doesn't exists anymore
     *
     * @param corrupt boolean
     */
    @Override
    public void setCorrupt(boolean corrupt) {
        this.isCorrupt = corrupt;
    }
}
