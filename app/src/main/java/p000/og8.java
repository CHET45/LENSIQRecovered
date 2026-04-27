package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class og8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f67581a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f67582b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f67583c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f67584d;

    private og8(@efb ConstraintLayout rootView, @efb ImageView ivIcon, @efb TextView tvDescription, @efb TextView tvTitle) {
        this.f67581a = rootView;
        this.f67582b = ivIcon;
        this.f67583c = tvDescription;
        this.f67584d = tvTitle;
    }

    @efb
    public static og8 bind(@efb View rootView) {
        int i = C2558R.id.iv_icon;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.tv_description;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.tv_title;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new og8((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static og8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static og8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_voice_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f67581a;
    }
}
