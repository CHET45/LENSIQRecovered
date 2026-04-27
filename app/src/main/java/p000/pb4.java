package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class pb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f70202a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f70203b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f70204c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f70205d;

    private pb4(@efb ConstraintLayout rootView, @efb ImageView imgCancle, @efb ImageView imgPromotion, @efb TextView textExit) {
        this.f70202a = rootView;
        this.f70203b = imgCancle;
        this.f70204c = imgPromotion;
        this.f70205d = textExit;
    }

    @efb
    public static pb4 bind(@efb View rootView) {
        int i = C2558R.id.img_cancle;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.img_promotion;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.text_exit;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    return new pb4((ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static pb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static pb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_promotion, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f70202a;
    }
}
