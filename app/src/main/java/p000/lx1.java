package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.aichat.C3993R;

/* JADX INFO: loaded from: classes6.dex */
public final class lx1 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f59109a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f59110b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f59111c;

    private lx1(@efb RelativeLayout relativeLayout, @efb LinearLayout linearLayout, @efb TextView textView) {
        this.f59109a = relativeLayout;
        this.f59110b = linearLayout;
        this.f59111c = textView;
    }

    @efb
    public static lx1 bind(@efb View view) {
        int i = C3993R.id.item_one;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C3993R.id.tv_name;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new lx1((RelativeLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static lx1 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static lx1 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.chat_item_receive_voice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f59109a;
    }
}
