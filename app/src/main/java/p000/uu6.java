package p000;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class uu6 extends RecyclerView.ViewHolder {
    private uu6(@efb FrameLayout frameLayout) {
        super(frameLayout);
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static uu6 m23581a(@efb ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(o8i.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new uu6(frameLayout);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public FrameLayout m23582b() {
        return (FrameLayout) this.itemView;
    }
}
