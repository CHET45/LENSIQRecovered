package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p000.afh;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iw7<Z> extends tbi<ImageView, Z> implements afh.InterfaceC0213a {

    /* JADX INFO: renamed from: F */
    @hib
    public Animatable f48650F;

    public iw7(ImageView imageView) {
        super(imageView);
    }

    private void maybeUpdateAnimatable(@hib Z z) {
        if (!(z instanceof Animatable)) {
            this.f48650F = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f48650F = animatable;
        animatable.start();
    }

    private void setResourceInternal(@hib Z z) {
        mo10187c(z);
        maybeUpdateAnimatable(z);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10187c(@hib Z z);

    @Override // p000.afh.InterfaceC0213a
    @hib
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.f84184a).getDrawable();
    }

    @Override // p000.tbi, p000.gu0, p000.jmg
    public void onLoadCleared(@hib Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f48650F;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // p000.gu0, p000.jmg
    public void onLoadFailed(@hib Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // p000.tbi, p000.gu0, p000.jmg
    public void onLoadStarted(@hib Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // p000.jmg
    public void onResourceReady(@efb Z z, @hib afh<? super Z> afhVar) {
        if (afhVar == null || !afhVar.transition(z, this)) {
            setResourceInternal(z);
        } else {
            maybeUpdateAnimatable(z);
        }
    }

    @Override // p000.gu0, p000.e59
    public void onStart() {
        Animatable animatable = this.f48650F;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p000.gu0, p000.e59
    public void onStop() {
        Animatable animatable = this.f48650F;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p000.afh.InterfaceC0213a
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.f84184a).setImageDrawable(drawable);
    }

    @Deprecated
    public iw7(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
