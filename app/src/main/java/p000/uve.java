package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class uve implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f89242a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f89243b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f89244c;

    /* JADX INFO: renamed from: d */
    @efb
    public final View f89245d;

    private uve(@efb RelativeLayout rootView, @efb ImageView checkbox, @efb TextView title, @efb View viewLine) {
        this.f89242a = rootView;
        this.f89243b = checkbox;
        this.f89244c = title;
        this.f89245d = viewLine;
    }

    @efb
    public static uve bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.checkbox;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.title;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_line))) != null) {
                return new uve((RelativeLayout) rootView, imageView, textView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static uve inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static uve inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.select_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f89242a;
    }
}
