package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class i4h implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f45749a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f45750b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f45751c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f45752d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f45753e;

    private i4h(@efb LinearLayout linearLayout, @efb ImageView imageView, @efb RelativeLayout relativeLayout, @efb TextView textView, @efb View view) {
        this.f45749a = linearLayout;
        this.f45750b = imageView;
        this.f45751c = relativeLayout;
        this.f45752d = textView;
        this.f45753e = view;
    }

    @efb
    public static i4h bind(@efb View view) {
        View viewFindViewById;
        int i = C4297R.id.iv_back;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C4297R.id.ll_content;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
            if (relativeLayout != null) {
                i = C4297R.id.tv_title;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null && (viewFindViewById = view.findViewById((i = C4297R.id.view_line))) != null) {
                    return new i4h((LinearLayout) view, imageView, relativeLayout, textView, viewFindViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static i4h inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static i4h inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.toolbar_layout_voice_note, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f45749a;
    }
}
