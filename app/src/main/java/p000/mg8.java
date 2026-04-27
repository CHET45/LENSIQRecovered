package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class mg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f60959a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RelativeLayout f60960b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f60961c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f60962d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f60963e;

    private mg8(@efb RelativeLayout rootView, @efb RelativeLayout itemOne, @efb ImageView ivSelect, @efb RelativeLayout rootLayout, @efb TextView transValue) {
        this.f60959a = rootView;
        this.f60960b = itemOne;
        this.f60961c = ivSelect;
        this.f60962d = rootLayout;
        this.f60963e = transValue;
    }

    @efb
    public static mg8 bind(@efb View rootView) {
        int i = C2558R.id.item_one;
        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
        if (relativeLayout != null) {
            i = C2558R.id.iv_select;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                RelativeLayout relativeLayout2 = (RelativeLayout) rootView;
                i = C2558R.id.trans_value;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    return new mg8(relativeLayout2, relativeLayout, imageView, relativeLayout2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static mg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static mg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_real_time_trans, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f60959a;
    }
}
