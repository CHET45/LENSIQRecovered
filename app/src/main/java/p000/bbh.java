package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class bbh implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f13272a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RelativeLayout f13273b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f13274c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f13275d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f13276e;

    private bbh(@efb RelativeLayout rootView, @efb RelativeLayout itemOne, @efb ImageView ivSelect, @efb RelativeLayout rootLayout, @efb TextView transValue) {
        this.f13272a = rootView;
        this.f13273b = itemOne;
        this.f13274c = ivSelect;
        this.f13275d = rootLayout;
        this.f13276e = transValue;
    }

    @efb
    public static bbh bind(@efb View rootView) {
        int i = C4035R.id.item_one;
        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
        if (relativeLayout != null) {
            i = C4035R.id.iv_select;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                RelativeLayout relativeLayout2 = (RelativeLayout) rootView;
                i = C4035R.id.trans_value;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    return new bbh(relativeLayout2, relativeLayout, imageView, relativeLayout2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static bbh inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static bbh inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_machine_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f13272a;
    }
}
