package com.radialmenuv2.widget.RadialMenu;

import java.util.List;

/**
 * 圆形菜单菜单item
 * @author Blankyum
 * @email blankyum@gmail.com
 * Created on 2016/4/19 15:06.
 */
public interface RadialMenuEntry {
    int getId(); // 菜单ID
    String getLabel(); // 菜单标题（显示）
    int getIcon(); // 菜单图标
    List<RadialMenuEntry> getChildren(); // 二级菜单列表
    void menuClick();
}
