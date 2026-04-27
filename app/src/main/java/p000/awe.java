package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class awe implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f12041a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f12042b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f12043c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f12044d;

    private awe(@efb ConstraintLayout rootView, @efb ImageView checkbox, @efb TextView defaultName, @efb TextView title) {
        this.f12041a = rootView;
        this.f12042b = checkbox;
        this.f12043c = defaultName;
        this.f12044d = title;
    }

    @efb
    public static awe bind(@efb View rootView) {
        int i = C2531R.id.checkbox;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.default_name;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2531R.id.title;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new awe((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static awe inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static awe inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.select_trans_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f12041a;
    }
}
