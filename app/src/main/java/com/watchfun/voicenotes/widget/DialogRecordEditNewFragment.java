package com.watchfun.voicenotes.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.watchfun.base.BaseDialogFragment;
import com.watchfun.voicenotes.CommonWebViewActivity;
import p000.efb;
import p000.hib;
import p000.pa4;
import p000.u2c;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecordEditNewFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public u2c f26484c;

    /* JADX INFO: renamed from: d */
    public pa4 f26485d;

    /* JADX INFO: renamed from: e */
    public String f26486e;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordEditNewFragment$a */
    public class ViewOnClickListenerC4369a implements View.OnClickListener {
        public ViewOnClickListenerC4369a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordEditNewFragment.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordEditNewFragment$b */
    public class ViewOnClickListenerC4370b implements View.OnClickListener {
        public ViewOnClickListenerC4370b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordEditNewFragment.this.dismiss();
            if (DialogRecordEditNewFragment.this.f26484c != null) {
                DialogRecordEditNewFragment.this.f26484c.onInput(DialogRecordEditNewFragment.this.f26485d.f70146b.getText().toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordEditNewFragment$c */
    public class ViewOnClickListenerC4371c implements View.OnClickListener {
        public ViewOnClickListenerC4371c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordEditNewFragment.this.f26485d.f70146b.setText("");
        }
    }

    public static DialogRecordEditNewFragment getInstance(String str) {
        DialogRecordEditNewFragment dialogRecordEditNewFragment = new DialogRecordEditNewFragment();
        Bundle bundle = new Bundle();
        bundle.putString(CommonWebViewActivity.f26185L, str);
        dialogRecordEditNewFragment.setArguments(bundle);
        return dialogRecordEditNewFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!TextUtils.isEmpty(this.f26486e)) {
            this.f26485d.f70150f.setText(this.f26486e);
        }
        this.f26485d.f70146b.setText(getArguments().getString(CommonWebViewActivity.f26185L));
        this.f26485d.f70148d.setOnClickListener(new ViewOnClickListenerC4369a());
        this.f26485d.f70149e.setOnClickListener(new ViewOnClickListenerC4370b());
        this.f26485d.f70147c.setOnClickListener(new ViewOnClickListenerC4371c());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        pa4 pa4VarInflate = pa4.inflate(layoutInflater, viewGroup, false);
        this.f26485d = pa4VarInflate;
        return pa4VarInflate.getRoot();
    }

    public void setOnEventEditDialog(u2c u2cVar) {
        this.f26484c = u2cVar;
    }

    public void setTitleTip(String str) {
        this.f26486e = str;
    }
}
