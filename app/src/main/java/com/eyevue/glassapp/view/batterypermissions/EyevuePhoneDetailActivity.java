package com.eyevue.glassapp.view.batterypermissions;

import com.watchfun.base.BaseActivity;
import p000.C9758na;

/* JADX INFO: loaded from: classes4.dex */
public class EyevuePhoneDetailActivity extends BaseActivity<C9758na> {

    /* JADX INFO: renamed from: a */
    public static final String f18542a = "phone_name";

    /* JADX INFO: renamed from: b */
    public static final String f18543b = "phone_image";

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C9758na getViewBinding() {
        return C9758na.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        int intExtra = getIntent().getIntExtra(f18542a, 0);
        int intExtra2 = getIntent().getIntExtra(f18543b, 0);
        ((C9758na) this.binding).f63771c.setTitle(getString(intExtra));
        ((C9758na) this.binding).f63771c.hideBottomLine();
        ((C9758na) this.binding).f63770b.setBackgroundResource(intExtra2);
    }
}
