package com.watchfun.voicenotes.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.watchfun.voicenotes.C4297R;
import p000.C6365gl;
import p000.igg;

/* JADX INFO: loaded from: classes7.dex */
public class AiVoiceNoteLoadingView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final C6365gl f26459a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4362a f26460b;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.AiVoiceNoteLoadingView$a */
    public interface InterfaceC4362a {
        void onRetry();
    }

    public AiVoiceNoteLoadingView(Context context) {
        this(context, null);
    }

    private void setViewHide(View... viewArr) {
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
        }
    }

    private void setViewShow(View... viewArr) {
        for (View view : viewArr) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        }
    }

    public C6365gl getBinding() {
        return this.f26459a;
    }

    public void hide() {
        setVisibility(8);
    }

    public void hideAllView() {
        setViewHide(this);
    }

    @Override // android.view.View.OnClickListener
    @igg({"NonConstantResourceId"})
    public void onClick(View view) {
        InterfaceC4362a interfaceC4362a;
        if (view.getId() != C4297R.id.tv_again || (interfaceC4362a = this.f26460b) == null) {
            return;
        }
        interfaceC4362a.onRetry();
    }

    public void setLoadingViewCallBack(InterfaceC4362a interfaceC4362a) {
        this.f26460b = interfaceC4362a;
    }

    public void showLoadingView() {
        C6365gl c6365gl = this.f26459a;
        setViewShow(this, c6365gl.f40070b, c6365gl.f40073e);
        C6365gl c6365gl2 = this.f26459a;
        setViewHide(c6365gl2.f40074f, c6365gl2.f40075m, c6365gl2.f40072d);
    }

    public void showNoDataView() {
        setViewShow(this, this.f26459a.f40074f);
        C6365gl c6365gl = this.f26459a;
        setViewHide(c6365gl.f40070b, c6365gl.f40073e, c6365gl.f40075m, c6365gl.f40072d);
    }

    public void showNoNetView() {
        C6365gl c6365gl = this.f26459a;
        setViewShow(this, c6365gl.f40075m, c6365gl.f40072d);
        C6365gl c6365gl2 = this.f26459a;
        setViewHide(c6365gl2.f40070b, c6365gl2.f40073e, c6365gl2.f40074f);
    }

    public AiVoiceNoteLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiVoiceNoteLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6365gl c6365glInflate = C6365gl.inflate(LayoutInflater.from(context));
        this.f26459a = c6365glInflate;
        showLoadingView();
        c6365glInflate.f40072d.setOnClickListener(this);
        c6365glInflate.f40072d.setEnabled(true);
        addView(c6365glInflate.getRoot());
    }
}
