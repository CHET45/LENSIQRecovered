package com.watchfun.voicenotes.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.watchfun.base.BaseDialogFragment;
import p000.efb;
import p000.gb4;
import p000.hib;
import p000.s2c;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecordMenuFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public s2c f26497c;

    /* JADX INFO: renamed from: d */
    public gb4 f26498d;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordMenuFragment$a */
    public class ViewOnClickListenerC4375a implements View.OnClickListener {
        public ViewOnClickListenerC4375a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordMenuFragment.this.dismiss();
            if (DialogRecordMenuFragment.this.f26497c != null) {
                DialogRecordMenuFragment.this.f26497c.onKeyEvent(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordMenuFragment$b */
    public class ViewOnClickListenerC4376b implements View.OnClickListener {
        public ViewOnClickListenerC4376b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordMenuFragment.this.dismiss();
            if (DialogRecordMenuFragment.this.f26497c != null) {
                DialogRecordMenuFragment.this.f26497c.onKeyEvent(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordMenuFragment$c */
    public class ViewOnClickListenerC4377c implements View.OnClickListener {
        public ViewOnClickListenerC4377c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordMenuFragment.this.dismiss();
            if (DialogRecordMenuFragment.this.f26497c != null) {
                DialogRecordMenuFragment.this.f26497c.onKeyEvent(2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f26498d.f39224b.setOnClickListener(new ViewOnClickListenerC4375a());
        this.f26498d.f39225c.setOnClickListener(new ViewOnClickListenerC4376b());
        this.f26498d.f39226d.setOnClickListener(new ViewOnClickListenerC4377c());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        gb4 gb4VarInflate = gb4.inflate(layoutInflater, viewGroup, false);
        this.f26498d = gb4VarInflate;
        return gb4VarInflate.getRoot();
    }

    public void setOnEventDialog(s2c s2cVar) {
        this.f26497c = s2cVar;
    }
}
