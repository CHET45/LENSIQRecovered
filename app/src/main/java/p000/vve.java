package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class vve implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f92393a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f92394b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f92395c;

    /* JADX INFO: renamed from: d */
    @efb
    public final View f92396d;

    private vve(@efb RelativeLayout rootView, @efb ImageView checkbox, @efb TextView title, @efb View viewLine) {
        this.f92393a = rootView;
        this.f92394b = checkbox;
        this.f92395c = title;
        this.f92396d = viewLine;
    }

    @efb
    public static vve bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2531R.id.checkbox;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.title;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2531R.id.view_line))) != null) {
                return new vve((RelativeLayout) rootView, imageView, textView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static vve inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static vve inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.select_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f92393a;
    }
}
