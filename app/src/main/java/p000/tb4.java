package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class tb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f84139a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f84140b;

    private tb4(@efb FrameLayout frameLayout, @efb TextView textView) {
        this.f84139a = frameLayout;
        this.f84140b = textView;
    }

    @efb
    public static tb4 bind(@efb View view) {
        int i = C4297R.id.tv_sure;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            return new tb4((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static tb4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static tb4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_record_hint_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f84139a;
    }
}
