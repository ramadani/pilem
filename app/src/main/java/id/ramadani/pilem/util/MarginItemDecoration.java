package id.ramadani.pilem.util;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by dani on 3/26/17.
 */

public class MarginItemDecoration extends RecyclerView.ItemDecoration {
    private int mMargin;

    public MarginItemDecoration(int margin) {
        this.mMargin = margin;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = mMargin;
        }

        outRect.left = mMargin;
        outRect.right = mMargin;
        outRect.bottom = mMargin;
    }
}
