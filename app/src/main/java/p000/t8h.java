package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.callvideo.C4008R;

/* JADX INFO: loaded from: classes6.dex */
public final class t8h implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f83995a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f83996b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f83997c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f83998d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f83999e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f84000f;

    /* JADX INFO: renamed from: m */
    @efb
    public final View f84001m;

    private t8h(@efb RelativeLayout relativeLayout, @efb ImageView imageView, @efb LinearLayout linearLayout, @efb RelativeLayout relativeLayout2, @efb TextView textView, @efb TextView textView2, @efb View view) {
        this.f83995a = relativeLayout;
        this.f83996b = imageView;
        this.f83997c = linearLayout;
        this.f83998d = relativeLayout2;
        this.f83999e = textView;
        this.f84000f = textView2;
        this.f84001m = view;
    }

    @efb
    public static t8h bind(@efb View view) {
        View viewFindViewById;
        int i = C4008R.id.img_polygon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C4008R.id.item_ear;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C4008R.id.tv_content;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = C4008R.id.tv_translate;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null && (viewFindViewById = view.findViewById((i = C4008R.id.view_line))) != null) {
                        return new t8h(relativeLayout, imageView, linearLayout, relativeLayout, textView, textView2, viewFindViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static t8h inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static t8h inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4008R.layout.trans_call_item_right, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f83995a;
    }
}
