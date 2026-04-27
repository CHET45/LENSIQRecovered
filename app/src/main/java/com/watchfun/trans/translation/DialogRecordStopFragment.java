package com.watchfun.trans.translation;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.watchfun.base.BaseDialogFragment;
import p000.dc4;
import p000.efb;
import p000.hib;
import p000.t2c;

/* JADX INFO: loaded from: classes6.dex */
public class DialogRecordStopFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public dc4 f25706c;

    /* JADX INFO: renamed from: d */
    public t2c f25707d;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.DialogRecordStopFragment$a */
    public class ViewOnClickListenerC4139a implements View.OnClickListener {
        public ViewOnClickListenerC4139a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordStopFragment.this.dismiss();
            if (DialogRecordStopFragment.this.f25707d != null) {
                DialogRecordStopFragment.this.f25707d.onKeyEvent(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.DialogRecordStopFragment$b */
    public class ViewOnClickListenerC4140b implements View.OnClickListener {
        public ViewOnClickListenerC4140b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordStopFragment.this.dismiss();
            if (DialogRecordStopFragment.this.f25707d != null) {
                DialogRecordStopFragment.this.f25707d.onKeyEvent(1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.f25706c.f29272d.setOnClickListener(new ViewOnClickListenerC4139a());
        this.f25706c.f29273e.setOnClickListener(new ViewOnClickListenerC4140b());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater inflater, @hib ViewGroup container, @hib Bundle savedInstanceState) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dc4 dc4VarInflate = dc4.inflate(inflater, container, false);
        this.f25706c = dc4VarInflate;
        return dc4VarInflate.getRoot();
    }

    public void setOnEventDialog(t2c onEventDialog) {
        this.f25707d = onEventDialog;
    }
}
