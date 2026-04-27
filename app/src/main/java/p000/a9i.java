package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class a9i implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f776a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f777b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f778c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f779d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f780e;

    private a9i(@efb LinearLayout rootView, @efb LinearLayout llCancel, @efb LinearLayout llDelete, @efb LinearLayout llEdit, @efb LinearLayout llSelect) {
        this.f776a = rootView;
        this.f777b = llCancel;
        this.f778c = llDelete;
        this.f779d = llEdit;
        this.f780e = llSelect;
    }

    @efb
    public static a9i bind(@efb View rootView) {
        int i = C2558R.id.ll_cancel;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.ll_delete;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) rootView;
                i = C2558R.id.ll_select;
                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout4 != null) {
                    return new a9i(linearLayout3, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static a9i inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static a9i inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.view_edit, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f776a;
    }
}
