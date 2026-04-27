package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class kg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f54014a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f54015b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f54016c;

    private kg8(@efb LinearLayout rootView, @efb ImageView selectionIndicator, @efb TextView tvDate) {
        this.f54014a = rootView;
        this.f54015b = selectionIndicator;
        this.f54016c = tvDate;
    }

    @efb
    public static kg8 bind(@efb View rootView) {
        int i = C2558R.id.selectionIndicator;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.tvDate;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                return new kg8((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static kg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static kg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_photo_header, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f54014a;
    }
}
