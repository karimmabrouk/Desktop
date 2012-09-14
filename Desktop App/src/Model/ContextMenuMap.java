package Model;

import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class ContextMenuMap extends JPopupMenu {

    // Variables
    JMenuItem deleteItem;
    JMenuItem setStartItem;
    JMenuItem createLinkItem;

    /**
     * Constructor
     */
    public ContextMenuMap() {
        deleteItem = new JMenuItem("Delete node");
        setStartItem = new JMenuItem("Make start");
        createLinkItem = new JMenuItem("Create Link");
        add(deleteItem);
        add(setStartItem);
        add(createLinkItem);
    }

    /**
     * TODO
     * 
     * @param e 
     */
    public void showContextMenuMap(MouseEvent e) {
        this.show(e.getComponent(), e.getX(), e.getY());
    }

    /**
     * TODO
     * 
     * @return 
     */
    public JMenuItem getDeleteItem() {
        return deleteItem;
    }

    /**
     * TODO 
     * 
     * @param deleteItem 
     */
    public void setDeleteItem(JMenuItem deleteItem) {
        this.deleteItem = deleteItem;
    }

    /**
     * TODO 
     * 
     * @return 
     */
    public JMenuItem getSetStartItem() {
        return setStartItem;
    }

    /**
     * TODO 
     * 
     * @param setStartItem 
     */
    public void setSetStartItem(JMenuItem setStartItem) {
        this.setStartItem = setStartItem;
    }

    /**
     * TODO 
     * 
     * @return 
     */
    public JMenuItem getCreateLinkItem() {
        return createLinkItem;
    }

    /**
     * TODO 
     * 
     * @param createLinkItem 
     */
    public void setCreateLinkItem(JMenuItem createLinkItem) {
        this.createLinkItem = createLinkItem;
    }
}
