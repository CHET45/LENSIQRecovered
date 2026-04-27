package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class kb1 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f53505d = false;

    /* JADX INFO: renamed from: a */
    public final int f53506a;

    /* JADX INFO: renamed from: b */
    public final int f53507b;

    /* JADX INFO: renamed from: c */
    public final wq4 f53508c;

    public kb1(@g92 int i) {
        this(i, 4, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@efb Rect rect, @efb View view, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
        int i = this.f53506a;
        int i2 = this.f53507b;
        rect.set(i, i2, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@efb Canvas canvas, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
        canvas.save();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            this.f53508c.drawLeft(childAt, canvas);
            this.f53508c.drawTop(childAt, canvas);
            this.f53508c.drawRight(childAt, canvas);
            this.f53508c.drawBottom(childAt, canvas);
        }
        canvas.restore();
    }

    public kb1(@g92 int i, int i2, int i3) {
        int iRound = Math.round(i2 / 2.0f);
        this.f53506a = iRound;
        int iRound2 = Math.round(i3 / 2.0f);
        this.f53507b = iRound2;
        this.f53508c = new a92(i, iRound, iRound2);
    }
}
