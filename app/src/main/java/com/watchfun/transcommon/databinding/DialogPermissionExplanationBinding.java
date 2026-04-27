package com.watchfun.transcommon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.transcommon.C4201R;
import p000.efb;
import p000.hib;
import p000.j8i;

/* JADX INFO: loaded from: classes5.dex */
public final class DialogPermissionExplanationBinding implements j8i {

    @efb
    public final TextView dialogAllowTextRightTv;

    @efb
    public final LinearLayout dialogClearTextContainerLayout;

    @efb
    public final LinearLayout dialogClearTextEditLayout;

    @efb
    public final View dialogClearTextHorizontalDivide;

    @efb
    public final LinearLayout dialogClearTextMainLayout;

    @efb
    public final TextView dialogClearTextTipTv;

    @efb
    public final TextView dialogClearTextTitleTv;

    @efb
    public final View dialogClearTextVerticalDivide;

    @efb
    public final TextView dialogRefuseTextLeftTv;

    @efb
    public final LinearLayout dialogTextBottomLayout;

    @efb
    private final LinearLayout rootView;

    private DialogPermissionExplanationBinding(@efb LinearLayout linearLayout, @efb TextView textView, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb View view, @efb LinearLayout linearLayout4, @efb TextView textView2, @efb TextView textView3, @efb View view2, @efb TextView textView4, @efb LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.dialogAllowTextRightTv = textView;
        this.dialogClearTextContainerLayout = linearLayout2;
        this.dialogClearTextEditLayout = linearLayout3;
        this.dialogClearTextHorizontalDivide = view;
        this.dialogClearTextMainLayout = linearLayout4;
        this.dialogClearTextTipTv = textView2;
        this.dialogClearTextTitleTv = textView3;
        this.dialogClearTextVerticalDivide = view2;
        this.dialogRefuseTextLeftTv = textView4;
        this.dialogTextBottomLayout = linearLayout5;
    }

    @efb
    public static DialogPermissionExplanationBinding bind(@efb View view) {
        View viewFindViewById;
        View viewFindViewById2;
        int i = C4201R.id.dialog_allow_text_right_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4201R.id.dialog_clear_text_container_layout;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C4201R.id.dialog_clear_text_edit_layout;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null && (viewFindViewById = view.findViewById((i = C4201R.id.dialog_clear_text_horizontal_divide))) != null) {
                    i = C4201R.id.dialog_clear_text_main_layout;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                    if (linearLayout3 != null) {
                        i = C4201R.id.dialog_clear_text_tip_tv;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C4201R.id.dialog_clear_text_title_tv;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null && (viewFindViewById2 = view.findViewById((i = C4201R.id.dialog_clear_text_vertical_divide))) != null) {
                                i = C4201R.id.dialog_refuse_text_left_tv;
                                TextView textView4 = (TextView) view.findViewById(i);
                                if (textView4 != null) {
                                    i = C4201R.id.dialog_text_bottom_layout;
                                    LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                                    if (linearLayout4 != null) {
                                        return new DialogPermissionExplanationBinding((LinearLayout) view, textView, linearLayout, linearLayout2, viewFindViewById, linearLayout3, textView2, textView3, viewFindViewById2, textView4, linearLayout4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static DialogPermissionExplanationBinding inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static DialogPermissionExplanationBinding inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4201R.layout.dialog_permission_explanation, viewGroup, false);
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
