package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class qb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f73800a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f73801b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f73802c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f73803d;

    private qb4(@efb ConstraintLayout rootView, @efb ImageView imgCancle, @efb ImageView imgPromotion, @efb TextView textExit) {
        this.f73800a = rootView;
        this.f73801b = imgCancle;
        this.f73802c = imgPromotion;
        this.f73803d = textExit;
    }

    @efb
    public static qb4 bind(@efb View rootView) {
        int i = C2531R.id.img_cancle;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.img_promotion;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2531R.id.text_exit;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    return new qb4((ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static qb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static qb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_promotion, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f73800a;
    }
}
