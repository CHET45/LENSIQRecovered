package com.watchfun.transcommon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.transcommon.C4201R;
import p000.efb;
import p000.hib;
import p000.j8i;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneEarShowTipBinding implements j8i {

    @efb
    public final LinearLayout imgCancel;

    @efb
    public final ImageView imgTransView;

    @efb
    private final LinearLayout rootView;

    @efb
    public final CheckBox showCheckbox;

    @efb
    public final TextView textTip;

    @efb
    public final TextView txtTip;

    private PhoneEarShowTipBinding(@efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb ImageView imageView, @efb CheckBox checkBox, @efb TextView textView, @efb TextView textView2) {
        this.rootView = linearLayout;
        this.imgCancel = linearLayout2;
        this.imgTransView = imageView;
        this.showCheckbox = checkBox;
        this.textTip = textView;
        this.txtTip = textView2;
    }

    @efb
    public static PhoneEarShowTipBinding bind(@efb View view) {
        int i = C4201R.id.img_cancel;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C4201R.id.img_trans_view;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C4201R.id.show_checkbox;
                CheckBox checkBox = (CheckBox) view.findViewById(i);
                if (checkBox != null) {
                    i = C4201R.id.text_tip;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = C4201R.id.txt_tip;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new PhoneEarShowTipBinding((LinearLayout) view, linearLayout, imageView, checkBox, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static PhoneEarShowTipBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static PhoneEarShowTipBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4201R.layout.phone_ear_show_tip, viewGroup, false);
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
