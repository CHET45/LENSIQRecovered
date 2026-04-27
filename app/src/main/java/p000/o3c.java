package p000;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public interface o3c {
    void clearView(RecyclerView.ViewHolder viewHolder, int i);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f, float f2, boolean z);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int i);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int i);
}
