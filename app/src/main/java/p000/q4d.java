package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.aichat.C3993R;

/* JADX INFO: loaded from: classes6.dex */
public final class q4d implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f73191a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f73192b;

    private q4d(@efb ConstraintLayout constraintLayout, @efb RecyclerView recyclerView) {
        this.f73191a = constraintLayout;
        this.f73192b = recyclerView;
    }

    @efb
    public static q4d bind(@efb View view) {
        int i = C3993R.id.rv_ai_model;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
        if (recyclerView != null) {
            return new q4d((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static q4d inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static q4d inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.pop_window_ai_model, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f73191a;
    }
}
