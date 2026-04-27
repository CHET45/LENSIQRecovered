package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.aichat.C3993R;

/* JADX INFO: loaded from: classes6.dex */
public final class ox1 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f69133a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f69134b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f69135c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f69136d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f69137e;

    private ox1(@efb RelativeLayout relativeLayout, @efb ImageView imageView, @efb LinearLayout linearLayout, @efb RelativeLayout relativeLayout2, @efb TextView textView) {
        this.f69133a = relativeLayout;
        this.f69134b = imageView;
        this.f69135c = linearLayout;
        this.f69136d = relativeLayout2;
        this.f69137e = textView;
    }

    @efb
    public static ox1 bind(@efb View view) {
        int i = C3993R.id.ic_voice;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C3993R.id.item_voice;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C3993R.id.tv_voice_time;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new ox1(relativeLayout, imageView, linearLayout, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ox1 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ox1 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.chat_item_voice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f69133a;
    }
}
