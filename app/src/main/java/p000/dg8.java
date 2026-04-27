package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class dg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f29592a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f29593b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f29594c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f29595d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f29596e;

    private dg8(@efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4) {
        this.f29592a = relativeLayout;
        this.f29593b = textView;
        this.f29594c = textView2;
        this.f29595d = textView3;
        this.f29596e = textView4;
    }

    @efb
    public static dg8 bind(@efb View view) {
        int i = C4297R.id.tv_content;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.tv_date;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.tv_duration;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    i = C4297R.id.tv_title;
                    TextView textView4 = (TextView) view.findViewById(i);
                    if (textView4 != null) {
                        return new dg8((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static dg8 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static dg8 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.item_meeting_info_layout_v1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f29592a;
    }
}
