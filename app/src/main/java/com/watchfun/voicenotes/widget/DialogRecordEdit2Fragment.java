package com.watchfun.voicenotes.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.watchfun.base.BaseDialogFragment;
import com.watchfun.voicenotes.CommonWebViewActivity;
import p000.b1i;
import p000.efb;
import p000.hib;
import p000.u2c;
import p000.wa4;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRecordEdit2Fragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: c */
    public u2c f26478c;

    /* JADX INFO: renamed from: d */
    public wa4 f26479d;

    /* JADX INFO: renamed from: e */
    public String f26480e;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordEdit2Fragment$a */
    public class ViewOnClickListenerC4366a implements View.OnClickListener {
        public ViewOnClickListenerC4366a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordEdit2Fragment.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordEdit2Fragment$b */
    public class ViewOnClickListenerC4367b implements View.OnClickListener {
        public ViewOnClickListenerC4367b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordEdit2Fragment.this.dismiss();
            if (DialogRecordEdit2Fragment.this.f26478c != null) {
                DialogRecordEdit2Fragment.this.f26478c.onInput(DialogRecordEdit2Fragment.this.f26479d.f93802b.getText().toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.DialogRecordEdit2Fragment$c */
    public class ViewOnClickListenerC4368c implements View.OnClickListener {
        public ViewOnClickListenerC4368c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogRecordEdit2Fragment.this.f26479d.f93802b.setText("");
        }
    }

    public static DialogRecordEdit2Fragment getInstance(String str) {
        DialogRecordEdit2Fragment dialogRecordEdit2Fragment = new DialogRecordEdit2Fragment();
        Bundle bundle = new Bundle();
        bundle.putString(CommonWebViewActivity.f26185L, str);
        dialogRecordEdit2Fragment.setArguments(bundle);
        return dialogRecordEdit2Fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!TextUtils.isEmpty(this.f26480e)) {
            this.f26479d.f93806f.setText(this.f26480e);
        }
        this.f26479d.f93802b.setText(getArguments().getString(CommonWebViewActivity.f26185L));
        wa4 wa4Var = this.f26479d;
        b1i.setupTextWatcher(wa4Var.f93802b, wa4Var.f93805e);
        this.f26479d.f93804d.setOnClickListener(new ViewOnClickListenerC4366a());
        this.f26479d.f93805e.setOnClickListener(new ViewOnClickListenerC4367b());
        this.f26479d.f93803c.setOnClickListener(new ViewOnClickListenerC4368c());
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        wa4 wa4VarInflate = wa4.inflate(layoutInflater, viewGroup, false);
        this.f26479d = wa4VarInflate;
        return wa4VarInflate.getRoot();
    }

    public void setOnEventEditDialog(u2c u2cVar) {
        this.f26478c = u2cVar;
    }

    public void setTitleTip(String str) {
        this.f26480e = str;
    }
}
