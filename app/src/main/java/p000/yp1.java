package p000;

import android.graphics.Typeface;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class yp1 extends kqg {

    /* JADX INFO: renamed from: a */
    public final Typeface f102461a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15754a f102462b;

    /* JADX INFO: renamed from: c */
    public boolean f102463c;

    /* JADX INFO: renamed from: yp1$a */
    public interface InterfaceC15754a {
        void apply(Typeface typeface);
    }

    public yp1(InterfaceC15754a interfaceC15754a, Typeface typeface) {
        this.f102461a = typeface;
        this.f102462b = interfaceC15754a;
    }

    private void updateIfNotCancelled(Typeface typeface) {
        if (this.f102463c) {
            return;
        }
        this.f102462b.apply(typeface);
    }

    public void cancel() {
        this.f102463c = true;
    }

    @Override // p000.kqg
    public void onFontRetrievalFailed(int i) {
        updateIfNotCancelled(this.f102461a);
    }

    @Override // p000.kqg
    public void onFontRetrieved(Typeface typeface, boolean z) {
        updateIfNotCancelled(typeface);
    }
}
