package com.watchfun.transcommon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.transcommon.C4201R;
import p000.efb;
import p000.hib;
import p000.j8i;

/* JADX INFO: loaded from: classes5.dex */
public final class SelectTransListItemBinding implements j8i {

    @efb
    public final ImageView checkbox;

    @efb
    public final TextView defaultName;

    @efb
    private final ConstraintLayout rootView;

    @efb
    public final TextView title;

    private SelectTransListItemBinding(@efb ConstraintLayout constraintLayout, @efb ImageView imageView, @efb TextView textView, @efb TextView textView2) {
        this.rootView = constraintLayout;
        this.checkbox = imageView;
        this.defaultName = textView;
        this.title = textView2;
    }

    @efb
    public static SelectTransListItemBinding bind(@efb View view) {
        int i = C4201R.id.checkbox;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C4201R.id.default_name;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C4201R.id.title;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new SelectTransListItemBinding((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static SelectTransListItemBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static SelectTransListItemBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4201R.layout.select_trans_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
