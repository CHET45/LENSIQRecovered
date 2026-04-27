package com.watchfun.transcommon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transcommon.C4201R;
import p000.efb;
import p000.hib;
import p000.j8i;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityAiSelectTarnsBinding implements j8i {

    @efb
    public final ImageView ivBack;

    @efb
    private final LinearLayout rootView;

    @efb
    public final EditText searchEdit;

    @efb
    public final RecyclerView selectTransRc;

    @efb
    public final RelativeLayout title;

    @efb
    public final TextView tvNum;

    @efb
    public final TextView tvTitle;

    private ActivityAiSelectTarnsBinding(@efb LinearLayout linearLayout, @efb ImageView imageView, @efb EditText editText, @efb RecyclerView recyclerView, @efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2) {
        this.rootView = linearLayout;
        this.ivBack = imageView;
        this.searchEdit = editText;
        this.selectTransRc = recyclerView;
        this.title = relativeLayout;
        this.tvNum = textView;
        this.tvTitle = textView2;
    }

    @efb
    public static ActivityAiSelectTarnsBinding bind(@efb View view) {
        int i = C4201R.id.iv_back;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C4201R.id.search_edit;
            EditText editText = (EditText) view.findViewById(i);
            if (editText != null) {
                i = C4201R.id.select_trans_rc;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                if (recyclerView != null) {
                    i = C4201R.id.title;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C4201R.id.tv_num;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = C4201R.id.tv_title;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                return new ActivityAiSelectTarnsBinding((LinearLayout) view, imageView, editText, recyclerView, relativeLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ActivityAiSelectTarnsBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ActivityAiSelectTarnsBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4201R.layout.activity_ai_select_tarns, viewGroup, false);
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
