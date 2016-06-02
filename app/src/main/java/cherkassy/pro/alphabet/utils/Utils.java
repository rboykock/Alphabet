package cherkassy.pro.alphabet.utils;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableRow;

/**
 * Created by rboyko on 02.06.16.
 */
public class Utils {

    public static TableRow buildTableRow(Context context){
        TableRow tableRow=new TableRow(context);
        tableRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT));
        ImageView img=new ImageView(context);
        FrameLayout.LayoutParams layoutParams=new FrameLayout.LayoutParams(40,40);
        img.setLayoutParams(layoutParams);
        img.setBackgroundColor(Color.YELLOW);
        tableRow.addView(img,0);
        return tableRow;
    }
}
