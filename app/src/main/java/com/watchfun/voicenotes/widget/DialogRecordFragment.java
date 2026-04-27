package com.watchfun.voicenotes.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.watchfun.base.BaseDialogFragment;
import p000.efb;
import p000.hib;
import p000.s2c;
import p000.vb4;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecordFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public s2c f26490c;

    /* JADX INFO: renamed from: d */
    public vb4 f26491d;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordFragment$a */
    public class ViewOnClickListenerC4372a implements View.OnClickListener {
        public ViewOnClickListenerC4372a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordFragment.this.dismiss();
            if (DialogRecordFragment.this.f26490c != null) {
                DialogRecordFragment.this.f26490c.onKeyEvent(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordFragment$b */
    public class ViewOnClickListenerC4373b implements View.OnClickListener {
        public ViewOnClickListenerC4373b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordFragment.this.dismiss();
            if (DialogRecordFragment.this.f26490c != null) {
                DialogRecordFragment.this.f26490c.onKeyEvent(1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f26491d.f90544d.setOnClickListener(new ViewOnClickListenerC4372a());
        this.f26491d.f90545e.setOnClickListener(new ViewOnClickListenerC4373b());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        vb4 vb4VarInflate = vb4.inflate(layoutInflater, viewGroup, false);
        this.f26491d = vb4VarInflate;
        return vb4VarInflate.getRoot();
    }

    public void setOnEventDialog(s2c s2cVar) {
        this.f26490c = s2cVar;
    }
}
