package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class zrf extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public static final float f105866a = 100.0f;

    /* JADX INFO: renamed from: zrf$a */
    public class C16235a extends LinearSmoothScroller {
        public C16235a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public zrf(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C16235a c16235a = new C16235a(recyclerView.getContext());
        c16235a.setTargetPosition(i);
        startSmoothScroll(c16235a);
    }
}
