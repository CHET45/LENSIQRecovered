package com.eyevue.glassapp.view.theme;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.watchfun.base.BaseActivity;
import p000.C14524wa;
import p000.dxg;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueThemeActivity extends BaseActivity<C14524wa> {

    /* JADX INFO: renamed from: a */
    public int[] f19170a = {C2531R.string.eyevue_theme_light, C2531R.string.eyevue_theme_dark};

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C14524wa getViewBinding() {
        return C14524wa.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C14524wa) this.binding).f93787c.setTitle(C2531R.string.eyevue_title_theme, this);
        ((C14524wa) this.binding).f93787c.hideBottomLine();
        dxg dxgVar = new dxg(this);
        dxgVar.setData(this.f19170a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        ((C14524wa) this.binding).f93786b.setLayoutManager(linearLayoutManager);
        ((C14524wa) this.binding).f93786b.setAdapter(dxgVar);
    }
}
