package p000;

import p000.frb;
import p000.jo1;

/* JADX INFO: loaded from: classes3.dex */
public class hs9 extends jo1<frb.AbstractC5941a, frb, Object> {

    /* JADX INFO: renamed from: m */
    public static jo1.AbstractC7989a<frb.AbstractC5941a, frb, Object> f44706m = new C6988a();

    /* JADX INFO: renamed from: hs9$a */
    public class C6988a extends jo1.AbstractC7989a<frb.AbstractC5941a, frb, Object> {
        @Override // p000.jo1.AbstractC7989a
        public void onNotifyCallback(frb.AbstractC5941a abstractC5941a, frb frbVar, int i, Object obj) {
            abstractC5941a.onMapChanged(frbVar, obj);
        }
    }

    public hs9() {
        super(f44706m);
    }

    public void notifyChange(@efb frb frbVar, @hib Object obj) {
        notifyCallbacks(frbVar, 0, obj);
    }
}
