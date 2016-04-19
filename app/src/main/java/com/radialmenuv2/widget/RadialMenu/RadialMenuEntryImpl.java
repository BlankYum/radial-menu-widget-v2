package com.radialmenuv2.widget.RadialMenu;

import java.util.List;

/**
 * 圆形菜单菜单item实现
 * @author Blankyum
 * @email blankyum@gmail.com
 * Created on 2016/4/19 15:32.
 */
public class RadialMenuEntryImpl implements RadialMenuEntry {

    private int id;
    private int icon;
    private String label;
    private List<RadialMenuEntry> children;

    public RadialMenuEntryImpl(int id, String label, int icon, List<RadialMenuEntry> children) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        this.children = children;
    }

    public RadialMenuEntryImpl(int id, String label, List<RadialMenuEntry> children) {
        this(id, label, 0, children);
    }

    public RadialMenuEntryImpl(int id, int icon, List<RadialMenuEntry> children) {
        this(id, null, icon, children);
    }

    public RadialMenuEntryImpl(int id, String label, int icon) {
        this(id, label, icon, null);
    }

    public RadialMenuEntryImpl(int id, String label) {
        this(id, label, null);
    }

    public RadialMenuEntryImpl(int id, int icon) {
        this(id, icon, null);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public int getIcon() {
        return icon;
    }

    @Override
    public List<RadialMenuEntry> getChildren() {
        return children;
    }

    @Override
    public void menuClick() {

    }
}
