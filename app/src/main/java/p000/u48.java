package p000;

import android.os.Build;
import android.view.View;
import java.util.List;
import p000.xli;

/* JADX INFO: loaded from: classes.dex */
public final class u48 extends xli.AbstractC15190b implements Runnable, t1c, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C */
    @gib
    public smi f86807C;

    /* JADX INFO: renamed from: e */
    @yfb
    public final foi f86808e;

    /* JADX INFO: renamed from: f */
    public boolean f86809f;

    /* JADX INFO: renamed from: m */
    public boolean f86810m;

    public u48(@yfb foi foiVar) {
        super(!foiVar.getConsumes() ? 1 : 0);
        this.f86808e = foiVar;
    }

    @yfb
    public final foi getComposeInsets() {
        return this.f86808e;
    }

    public final boolean getPrepared() {
        return this.f86809f;
    }

    public final boolean getRunningAnimation() {
        return this.f86810m;
    }

    @gib
    public final smi getSavedInsets() {
        return this.f86807C;
    }

    @Override // p000.t1c
    @yfb
    public smi onApplyWindowInsets(@yfb View view, @yfb smi smiVar) {
        this.f86807C = smiVar;
        this.f86808e.updateImeAnimationTarget(smiVar);
        if (this.f86809f) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f86810m) {
            this.f86808e.updateImeAnimationSource(smiVar);
            foi.update$default(this.f86808e, smiVar, 0, 2, null);
        }
        return this.f86808e.getConsumes() ? smi.f82271c : smiVar;
    }

    @Override // p000.xli.AbstractC15190b
    public void onEnd(@yfb xli xliVar) {
        this.f86809f = false;
        this.f86810m = false;
        smi smiVar = this.f86807C;
        if (xliVar.getDurationMillis() != 0 && smiVar != null) {
            this.f86808e.updateImeAnimationSource(smiVar);
            this.f86808e.updateImeAnimationTarget(smiVar);
            foi.update$default(this.f86808e, smiVar, 0, 2, null);
        }
        this.f86807C = null;
        super.onEnd(xliVar);
    }

    @Override // p000.xli.AbstractC15190b
    public void onPrepare(@yfb xli xliVar) {
        this.f86809f = true;
        this.f86810m = true;
        super.onPrepare(xliVar);
    }

    @Override // p000.xli.AbstractC15190b
    @yfb
    public smi onProgress(@yfb smi smiVar, @yfb List<xli> list) {
        foi.update$default(this.f86808e, smiVar, 0, 2, null);
        return this.f86808e.getConsumes() ? smi.f82271c : smiVar;
    }

    @Override // p000.xli.AbstractC15190b
    @yfb
    public xli.C15189a onStart(@yfb xli xliVar, @yfb xli.C15189a c15189a) {
        this.f86809f = false;
        return super.onStart(xliVar, c15189a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@yfb View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@yfb View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f86809f) {
            this.f86809f = false;
            this.f86810m = false;
            smi smiVar = this.f86807C;
            if (smiVar != null) {
                this.f86808e.updateImeAnimationSource(smiVar);
                foi.update$default(this.f86808e, smiVar, 0, 2, null);
                this.f86807C = null;
            }
        }
    }

    public final void setPrepared(boolean z) {
        this.f86809f = z;
    }

    public final void setRunningAnimation(boolean z) {
        this.f86810m = z;
    }

    public final void setSavedInsets(@gib smi smiVar) {
        this.f86807C = smiVar;
    }
}
