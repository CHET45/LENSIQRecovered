package com.watchfun.translatemodule.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.translatemodule.C4243R;
import p000.efb;
import p000.hib;
import p000.j8i;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityMainBinding implements j8i {

    @efb
    private final LinearLayout rootView;

    @efb
    public final TextView tvResult;

    @efb
    public final TextView tvStart;

    @efb
    public final TextView tvStop;

    private ActivityMainBinding(@efb LinearLayout linearLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.rootView = linearLayout;
        this.tvResult = textView;
        this.tvStart = textView2;
        this.tvStop = textView3;
    }

    @efb
    public static ActivityMainBinding bind(@efb View view) {
        int i = C4243R.id.tv_result;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4243R.id.tv_start;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4243R.id.tv_stop;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    return new ActivityMainBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ActivityMainBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ActivityMainBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4243R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
