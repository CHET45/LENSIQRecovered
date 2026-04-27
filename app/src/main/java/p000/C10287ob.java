package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: renamed from: ob */
/* JADX INFO: loaded from: classes4.dex */
public final class C10287ob implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f67023a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f67024b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f67025c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f67026d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f67027e;

    private C10287ob(@efb RelativeLayout rootView, @efb ImageView icMenu, @efb RelativeLayout llContent, @efb TextView title, @efb LinearLayout titleLayout) {
        this.f67023a = rootView;
        this.f67024b = icMenu;
        this.f67025c = llContent;
        this.f67026d = title;
        this.f67027e = titleLayout;
    }

    @efb
    public static C10287ob bind(@efb View rootView) {
        int i = C2531R.id.ic_menu;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.ll_content;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2531R.id.title;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2531R.id.title_layout;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        return new C10287ob((RelativeLayout) rootView, imageView, relativeLayout, textView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C10287ob inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10287ob inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_new_gudie, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f67023a;
    }
}
