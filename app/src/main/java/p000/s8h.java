package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class s8h implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f80956a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f80957b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f80958c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f80959d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f80960e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f80961f;

    /* JADX INFO: renamed from: m */
    @efb
    public final View f80962m;

    private s8h(@efb RelativeLayout rootView, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb RelativeLayout rootLayout, @efb TextView tvContent, @efb TextView tvTranslate, @efb View viewLine) {
        this.f80956a = rootView;
        this.f80957b = imgPolygon;
        this.f80958c = itemOne;
        this.f80959d = rootLayout;
        this.f80960e = tvContent;
        this.f80961f = tvTranslate;
        this.f80962m = viewLine;
    }

    @efb
    public static s8h bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.img_polygon;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.item_one;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                i = C2558R.id.tv_content;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_translate;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_line))) != null) {
                        return new s8h(relativeLayout, imageView, linearLayout, relativeLayout, textView, textView2, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static s8h inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static s8h inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_call_item_left, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f80956a;
    }
}
