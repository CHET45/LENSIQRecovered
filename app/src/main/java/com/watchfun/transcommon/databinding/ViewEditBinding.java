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
public final class ViewEditBinding implements j8i {

    @efb
    public final LinearLayout llCancel;

    @efb
    public final LinearLayout llDelete;

    @efb
    public final LinearLayout llEdit;

    @efb
    public final LinearLayout llSelect;

    @efb
    private final LinearLayout rootView;

    private ViewEditBinding(@efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb LinearLayout linearLayout4, @efb LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.llCancel = linearLayout2;
        this.llDelete = linearLayout3;
        this.llEdit = linearLayout4;
        this.llSelect = linearLayout5;
    }

    @efb
    public static ViewEditBinding bind(@efb View view) {
        int i = C4201R.id.ll_cancel;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C4201R.id.ll_delete;
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view;
                i = C4201R.id.ll_select;
                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                if (linearLayout4 != null) {
                    return new ViewEditBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ViewEditBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ViewEditBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4201R.layout.view_edit, viewGroup, false);
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
