package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p000.afh;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l31<R> implements efh<R> {

    /* JADX INFO: renamed from: a */
    public final efh<Drawable> f56053a;

    /* JADX INFO: renamed from: l31$a */
    public final class C8593a implements afh<R> {

        /* JADX INFO: renamed from: a */
        public final afh<Drawable> f56054a;

        public C8593a(afh<Drawable> afhVar) {
            this.f56054a = afhVar;
        }

        @Override // p000.afh
        public boolean transition(R r, afh.InterfaceC0213a interfaceC0213a) {
            return this.f56054a.transition(new BitmapDrawable(interfaceC0213a.getView().getResources(), l31.this.mo15291a(r)), interfaceC0213a);
        }
    }

    public l31(efh<Drawable> efhVar) {
        this.f56053a = efhVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract Bitmap mo15291a(R r);

    @Override // p000.efh
    public afh<R> build(hh3 hh3Var, boolean z) {
        return new C8593a(this.f56053a.build(hh3Var, z));
    }
}
