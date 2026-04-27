package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.permissionx.guolindev.C3877R;

/* JADX INFO: loaded from: classes6.dex */
public final class wpc implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f95043a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f95044b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f95045c;

    private wpc(@efb LinearLayout linearLayout, @efb ImageView imageView, @efb TextView textView) {
        this.f95043a = linearLayout;
        this.f95044b = imageView;
        this.f95045c = textView;
    }

    @efb
    public static wpc bind(@efb View view) {
        int i = C3877R.id.permissionIcon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C3877R.id.permissionText;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new wpc((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static wpc inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static wpc inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3877R.layout.permissionx_permission_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f95043a;
    }
}
