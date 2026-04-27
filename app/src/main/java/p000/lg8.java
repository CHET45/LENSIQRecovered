package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.transphoto.C4282R;

/* JADX INFO: loaded from: classes7.dex */
public final class lg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f57500a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f57501b;

    private lg8(@efb LinearLayout linearLayout, @efb TextView textView) {
        this.f57500a = linearLayout;
        this.f57501b = textView;
    }

    @efb
    public static lg8 bind(@efb View view) {
        int i = C4282R.id.tv_language;
        TextView textView = (TextView) l8i.findChildViewById(view, i);
        if (textView != null) {
            return new lg8((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static lg8 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static lg8 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4282R.layout.item_photo_language, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f57500a;
    }
}
