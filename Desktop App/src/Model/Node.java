package Model;

import Plugins.jxmap.swingx.mapviewer.DefaultWaypoint;
import Plugins.jxmap.swingx.mapviewer.GeoPosition;
import java.awt.Color;

/**
 * The node is a spot which can be placed on a map. You can say that a spot represents a location.
 */
public class Node extends DefaultWaypoint {

    private Color color = Color.BLUE;
    private String label;
    /**
     * Constructor with doubles
     * 
     * @param latitude double
     * @param longitude double     * 
     */
    public Node(double latitude, double longitude) {
        super(new GeoPosition(latitude, longitude)); // Creates a waypoint with the geoposition        
    }

    /**
     * Constructor with geolocation
     *
     * @param geoposition The jxMapView geoposition
     */
    public Node(GeoPosition geoposition) {
        super(geoposition); // Creates a waypoint with the geoposition        
    }
    
    /**
     * 
     * @return 
     */
    public GeoPosition getGeoposition() {
        return super.getPosition();
    }
    
    /**
     * 
     * @param geoposition 
     */
    public void setGeoposition(GeoPosition geoposition) {
        super.setPosition(geoposition);
    }

    /**
     * 
     * @return color
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    
    /**
     * 
     * @return color
     */
    public Color getColor() {
        return color;
    }

    
    /**
     * 
     * @param color 
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    
    public void setStart() {
        this.color = Color.GREEN;
        this.label = "S";
    }
    
    public void setEnd() {
        this.color = Color.RED;
        this.label = "E";
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return  super.getPosition().getLatitude()+ " : " + super.getPosition().getLongitude();
    }
}
