package com.watchfun.transphoto;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.view.View;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C7191i9;
import p000.vfe;

/* JADX INFO: loaded from: classes7.dex */
public class BilingualTransActivity extends BaseActivity<C7191i9> {

    /* JADX INFO: renamed from: d */
    public static final String f26018d = "key_original_text";

    /* JADX INFO: renamed from: e */
    public static final String f26019e = "key_translate_text";

    /* JADX INFO: renamed from: a */
    public String f26020a;

    /* JADX INFO: renamed from: b */
    public String f26021b;

    /* JADX INFO: renamed from: c */
    public long f26022c;

    private void copyText(String str) {
        if (System.currentTimeMillis() - this.f26022c <= 500) {
            return;
        }
        this.f26022c = System.currentTimeMillis();
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
        ToastUtils.showShort(getResources().getString(C4282R.string.text_already_copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        copyText(this.f26020a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        copyText(this.f26021b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(View view) {
        finish();
    }

    private void setStartBarUtil() {
        C4032a.setStatusBarDark(this, vfe.getInstance().getBoolean("THEME_DARK", false), true, false);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C7191i9 getViewBinding() {
        return C7191i9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else {
            this.f26020a = intent.getStringExtra(f26018d);
            this.f26021b = intent.getStringExtra(f26019e);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        setStartBarUtil();
        ((C7191i9) this.binding).f46081b.setOnClickListener(new View.OnClickListener() { // from class: t11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83338a.lambda$initView$0(view);
            }
        });
        ((C7191i9) this.binding).f46085f.setText(this.f26020a);
        ((C7191i9) this.binding).f46086m.setText(this.f26021b);
        ((C7191i9) this.binding).f46082c.setOnClickListener(new View.OnClickListener() { // from class: u11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86540a.lambda$initView$1(view);
            }
        });
        ((C7191i9) this.binding).f46083d.setOnClickListener(new View.OnClickListener() { // from class: v11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89648a.lambda$initView$2(view);
            }
        });
        ((C7191i9) this.binding).f46081b.setOnClickListener(new View.OnClickListener() { // from class: w11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93056a.lambda$initView$3(view);
            }
        });
    }
}
