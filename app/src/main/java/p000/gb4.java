package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class gb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f39223a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f39224b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f39225c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f39226d;

    private gb4(@efb FrameLayout frameLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f39223a = frameLayout;
        this.f39224b = textView;
        this.f39225c = textView2;
        this.f39226d = textView3;
    }

    @efb
    public static gb4 bind(@efb View view) {
        int i = C4297R.id.tvCancel;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.tv_delete;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.tv_edit;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    return new gb4((FrameLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static gb4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static gb4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_main_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f39223a;
    }
}
