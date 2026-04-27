package com.watchfun.voicenotes.widget;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.watchfun.base.BaseDialogFragment;
import p000.efb;
import p000.hib;
import p000.s2c;
import p000.sb4;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecord2Fragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public s2c f26471c;

    /* JADX INFO: renamed from: d */
    public sb4 f26472d;

    /* JADX INFO: renamed from: e */
    public String f26473e;

    /* JADX INFO: renamed from: f */
    public String f26474f;

    /* JADX INFO: renamed from: m */
    public String f26475m;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecord2Fragment$a */
    public class ViewOnClickListenerC4364a implements View.OnClickListener {
        public ViewOnClickListenerC4364a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecord2Fragment.this.dismiss();
            if (DialogRecord2Fragment.this.f26471c != null) {
                DialogRecord2Fragment.this.f26471c.onKeyEvent(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecord2Fragment$b */
    public class ViewOnClickListenerC4365b implements View.OnClickListener {
        public ViewOnClickListenerC4365b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecord2Fragment.this.dismiss();
            if (DialogRecord2Fragment.this.f26471c != null) {
                DialogRecord2Fragment.this.f26471c.onKeyEvent(1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f26472d.f81111d.setOnClickListener(new ViewOnClickListenerC4364a());
        this.f26472d.f81113f.setOnClickListener(new ViewOnClickListenerC4365b());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        Window window;
        this.f26472d = sb4.inflate(layoutInflater, viewGroup, false);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        if (!TextUtils.isEmpty(this.f26473e)) {
            this.f26472d.f81112e.setText(this.f26473e);
        }
        if (!TextUtils.isEmpty(this.f26474f)) {
            this.f26472d.f81111d.setText(this.f26474f);
        }
        if (!TextUtils.isEmpty(this.f26475m)) {
            this.f26472d.f81113f.setText(this.f26475m);
        }
        return this.f26472d.getRoot();
    }

    public void setLeftText(String str) {
        this.f26474f = str;
    }

    public void setOnEventDialog(s2c s2cVar) {
        this.f26471c = s2cVar;
    }

    public void setRightText(String str) {
        this.f26475m = str;
    }

    public void setTitle(String str) {
        this.f26473e = str;
    }
}
