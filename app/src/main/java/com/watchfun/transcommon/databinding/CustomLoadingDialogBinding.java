package com.watchfun.transcommon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.watchfun.transcommon.C4201R;
import p000.efb;
import p000.hib;
import p000.j8i;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomLoadingDialogBinding implements j8i {

    @efb
    private final LinearLayout rootView;

    private CustomLoadingDialogBinding(@efb LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @efb
    public static CustomLoadingDialogBinding bind(@efb View view) {
        if (view != null) {
            return new CustomLoadingDialogBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @efb
    public static CustomLoadingDialogBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static CustomLoadingDialogBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4201R.layout.custom_loading_dialog, viewGroup, false);
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
