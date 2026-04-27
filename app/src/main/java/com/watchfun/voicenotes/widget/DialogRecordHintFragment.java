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
import p000.tb4;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecordHintFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public s2c f26494c;

    /* JADX INFO: renamed from: d */
    public tb4 f26495d;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordHintFragment$a */
    public class ViewOnClickListenerC4374a implements View.OnClickListener {
        public ViewOnClickListenerC4374a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordHintFragment.this.dismiss();
            if (DialogRecordHintFragment.this.f26494c != null) {
                DialogRecordHintFragment.this.f26494c.onKeyEvent(1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f26495d.f84140b.setOnClickListener(new ViewOnClickListenerC4374a());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        tb4 tb4VarInflate = tb4.inflate(layoutInflater, viewGroup, false);
        this.f26495d = tb4VarInflate;
        return tb4VarInflate.getRoot();
    }

    public void setOnEventDialog(s2c s2cVar) {
        this.f26494c = s2cVar;
    }
}
