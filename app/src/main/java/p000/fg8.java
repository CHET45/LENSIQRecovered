package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class fg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f36518a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f36519b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f36520c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f36521d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f36522e;

    private fg8(@efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4) {
        this.f36518a = relativeLayout;
        this.f36519b = textView;
        this.f36520c = textView2;
        this.f36521d = textView3;
        this.f36522e = textView4;
    }

    @efb
    public static fg8 bind(@efb View view) {
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
                        return new fg8((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static fg8 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static fg8 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.item_meeting_info_layout_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f36518a;
    }
}
