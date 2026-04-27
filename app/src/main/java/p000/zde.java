package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.aichat.C3993R;

/* JADX INFO: loaded from: classes6.dex */
public final class zde implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f104863a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f104864b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f104865c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f104866d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f104867e;

    private zde(@efb ConstraintLayout constraintLayout, @efb View view, @efb ImageView imageView, @efb LinearLayout linearLayout, @efb TextView textView) {
        this.f104863a = constraintLayout;
        this.f104864b = view;
        this.f104865c = imageView;
        this.f104866d = linearLayout;
        this.f104867e = textView;
    }

    @efb
    public static zde bind(@efb View view) {
        int i = C3993R.id.divider;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            i = C3993R.id.iv_ai_model_status;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C3993R.id.ll_ai_model;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    i = C3993R.id.tv_ai_model;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        return new zde((ConstraintLayout) view, viewFindViewById, imageView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static zde inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static zde inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.rv_item_ai_model, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f104863a;
    }
}
