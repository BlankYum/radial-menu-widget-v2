package com.radialmenuv2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.radialmenuv2.widget.RadialMenu.OnRadialMenuItemClick;
import com.radialmenuv2.widget.RadialMenu.RadialMenu;
import com.radialmenuv2.widget.RadialMenu.RadialMenuEntry;
import com.radialmenuv2.widget.RadialMenu.RadialMenuEntryImpl;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RadialMenu radialMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(onClickListener);

        radialMenu = (RadialMenu) findViewById(R.id.radial_menu);
        radialMenu.setOnRadialMenuItemClick(onRadialMenuItemClick); // Set the listener of the menu item.
//        radialMenu.setAnimationSpeed(1000L);
//        radialMenu.setInnerRingRadius(50, 120);
//        radialMenu.setInnerRingColor(Color.LTGRAY, 255);
//        radialMenu.setHeader("Menu Header", 20);
//        radialMenu.setIconSize(15, 30);
//        radialMenu.setTextSize(13);

        int xScreenSize = (getResources().getDisplayMetrics().widthPixels);
        int yScreenSize = (getResources().getDisplayMetrics().heightPixels);

        radialMenu.setSourceLocation(xScreenSize / 2, yScreenSize - 100); // Set the source location it pops up. eg: center of the bottom.
        radialMenu.setShowSourceLocation(true); // Set whether to display the source location.
        radialMenu.setCenterLocation(xScreenSize / 2, yScreenSize / 2); // Set the Location it shows. eg: center of the screen.

        // init Menu Item
        radialMenu.setCenterCircle(new RadialMenuEntryImpl(0, null,
                android.R.drawable.ic_menu_close_clear_cancel, null));
        radialMenu.addMenuEntry(new RadialMenuEntryImpl(1, "Menu 1"));
        radialMenu.addMenuEntry(new RadialMenuEntryImpl(2, "Menu 2"));
        radialMenu.addMenuEntry(new RadialMenuEntryImpl(3, "Menu 3"));

        List<RadialMenuEntry> menuEntries = new ArrayList<>();
        menuEntries.add(new RadialMenuEntryImpl(41, "Red", R.drawable.red_circle));
        menuEntries.add(new RadialMenuEntryImpl(42, "Blue", R.drawable.blue_circle));
        menuEntries.add(new RadialMenuEntryImpl(43, "Green", R.drawable.green_circle));
        menuEntries.add(new RadialMenuEntryImpl(44, "Yellow", R.drawable.yellow_circle));
        radialMenu.addMenuEntry(new RadialMenuEntryImpl(4, "Menu 4", menuEntries));
        radialMenu.addMenuEntry(new RadialMenuEntryImpl(5, "Menu 5"));
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            radialMenu.setVisibility(View.VISIBLE);
        }
    };

    private OnRadialMenuItemClick onRadialMenuItemClick = new OnRadialMenuItemClick() {
        @Override
        public void onMenuItemClick(int id) {
            switch (id) {
                case 0: // 关闭
                    radialMenu.setVisibility(View.GONE);
                    break;
                case 1: // Menu 1
                    Toast.makeText(getBaseContext(), "Menu 1", Toast.LENGTH_SHORT).show();
                    break;
                case 2: // Menu 2
                    Toast.makeText(getBaseContext(), "Menu 2", Toast.LENGTH_SHORT).show();
                    break;
                case 3: // Menu 3
                    Toast.makeText(getBaseContext(), "Menu 3", Toast.LENGTH_SHORT).show();
                    break;
                case 4: // Menu 4
                    Toast.makeText(getBaseContext(), "Menu 4", Toast.LENGTH_SHORT).show();
                    break;
                case 5: // Menu 5
                    Toast.makeText(getBaseContext(), "Menu 5", Toast.LENGTH_SHORT).show();
                    break;
                case 41: // Red
                    Toast.makeText(getBaseContext(), "Red", Toast.LENGTH_SHORT).show();
                    break;
                case 42: // Blue
                    Toast.makeText(getBaseContext(), "Blue", Toast.LENGTH_SHORT).show();
                    break;
                case 43: // Green
                    Toast.makeText(getBaseContext(), "Green", Toast.LENGTH_SHORT).show();
                    break;
                case 44: // Yellow
                    Toast.makeText(getBaseContext(), "Yellow", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
