package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class zve implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f106159a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f106160b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f106161c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f106162d;

    private zve(@efb ConstraintLayout rootView, @efb ImageView checkbox, @efb TextView defaultName, @efb TextView title) {
        this.f106159a = rootView;
        this.f106160b = checkbox;
        this.f106161c = defaultName;
        this.f106162d = title;
    }

    @efb
    public static zve bind(@efb View rootView) {
        int i = C2558R.id.checkbox;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.default_name;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.title;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new zve((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static zve inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static zve inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.select_trans_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f106159a;
    }
}
