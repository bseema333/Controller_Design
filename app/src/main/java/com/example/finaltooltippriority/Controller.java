package com.example.finaltooltippriority;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private IHandler currentTooltipHandler;
    private List<IHandler> handlerList = new ArrayList<IHandler>();

    void init(Context context) {
        handlerList.add(new TooltipHandler(context, "Tooltip1", R.id.button1, this));
        handlerList.add(new TooltipHandler(context, "Tooltip2", R.id.button2, this));
        handlerList.add(new TooltipHandler(context, "Tooltip3", R.id.button3, this));
    }


    void triggerNextTooltip() {

        if (handlerList.isEmpty())
            return;

        IHandler handler = handlerList.get(0);
        currentTooltipHandler = handler;
        currentTooltipHandler.show();
    }

    void notifyOnDismissed() {
        if(handlerList.isEmpty())
            return;

        handlerList.remove(0);
        triggerNextTooltip();
    }

    void dismiss() {
        currentTooltipHandler.dismiss();
    }
}
