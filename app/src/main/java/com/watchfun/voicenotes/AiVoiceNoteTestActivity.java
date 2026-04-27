package com.watchfun.voicenotes;

import android.content.Intent;
import android.view.View;
import com.watchfun.base.BaseActivity;
import p000.C6754h9;
import p000.igg;

/* JADX INFO: loaded from: classes7.dex */
public class AiVoiceNoteTestActivity extends BaseActivity<C6754h9> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        startActivity(new Intent(this, (Class<?>) VoiceNoteActivityV2.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        startActivity(new Intent(this, (Class<?>) VoiceNoteActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(View view) {
        startActivity(new Intent(this, (Class<?>) VoiceNoteActivityV1.class));
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6754h9 getViewBinding() {
        return C6754h9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    @igg({"ClickableViewAccessibility"})
    public void initView() {
        super.initView();
        ((C6754h9) this.binding).f42937e.setOnClickListener(new View.OnClickListener() { // from class: il
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47330a.lambda$initView$0(view);
            }
        });
        ((C6754h9) this.binding).f42934b.setOnClickListener(new View.OnClickListener() { // from class: jl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51080a.lambda$initView$1(view);
            }
        });
        ((C6754h9) this.binding).f42935c.setOnClickListener(new View.OnClickListener() { // from class: kl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54584a.lambda$initView$2(view);
            }
        });
        ((C6754h9) this.binding).f42936d.setOnClickListener(new View.OnClickListener() { // from class: ll
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f58030a.lambda$initView$3(view);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @igg({"MissingSuperCall"})
    public void onBackPressed() {
        finish();
    }
}
