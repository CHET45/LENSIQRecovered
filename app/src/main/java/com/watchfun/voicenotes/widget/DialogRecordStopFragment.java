package com.watchfun.voicenotes.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.watchfun.base.BaseDialogFragment;
import p000.ec4;
import p000.efb;
import p000.hib;
import p000.s2c;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecordStopFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public ec4 f26502c;

    /* JADX INFO: renamed from: d */
    public s2c f26503d;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordStopFragment$a */
    public class ViewOnClickListenerC4378a implements View.OnClickListener {
        public ViewOnClickListenerC4378a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordStopFragment.this.dismiss();
            if (DialogRecordStopFragment.this.f26503d != null) {
                DialogRecordStopFragment.this.f26503d.onKeyEvent(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordStopFragment$b */
    public class ViewOnClickListenerC4379b implements View.OnClickListener {
        public ViewOnClickListenerC4379b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordStopFragment.this.dismiss();
            if (DialogRecordStopFragment.this.f26503d != null) {
                DialogRecordStopFragment.this.f26503d.onKeyEvent(1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f26502c.f32609d.setOnClickListener(new ViewOnClickListenerC4378a());
        this.f26502c.f32610e.setOnClickListener(new ViewOnClickListenerC4379b());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ec4 ec4VarInflate = ec4.inflate(layoutInflater, viewGroup, false);
        this.f26502c = ec4VarInflate;
        return ec4VarInflate.getRoot();
    }

    public void setOnEventDialog(s2c s2cVar) {
        this.f26503d = s2cVar;
    }
}
