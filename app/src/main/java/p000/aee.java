package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class aee implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f1265a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f1266b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f1267c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f1268d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f1269e;

    private aee(@efb ConstraintLayout constraintLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4) {
        this.f1265a = constraintLayout;
        this.f1266b = textView;
        this.f1267c = textView2;
        this.f1268d = textView3;
        this.f1269e = textView4;
    }

    @efb
    public static aee bind(@efb View view) {
        int i = C4297R.id.tv_content;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.tv_duration;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.tv_speaker;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    i = C4297R.id.tv_star;
                    TextView textView4 = (TextView) view.findViewById(i);
                    if (textView4 != null) {
                        return new aee((ConstraintLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static aee inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static aee inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.rv_item_record, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f1265a;
    }
}
