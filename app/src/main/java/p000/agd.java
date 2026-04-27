package p000;

import p000.jo1;
import p000.tkb;

/* JADX INFO: loaded from: classes3.dex */
public class agd extends jo1<tkb.AbstractC13084a, tkb, Void> {

    /* JADX INFO: renamed from: m */
    public static final jo1.AbstractC7989a<tkb.AbstractC13084a, tkb, Void> f1584m = new C0244a();

    /* JADX INFO: renamed from: agd$a */
    public class C0244a extends jo1.AbstractC7989a<tkb.AbstractC13084a, tkb, Void> {
        @Override // p000.jo1.AbstractC7989a
        public void onNotifyCallback(tkb.AbstractC13084a abstractC13084a, tkb tkbVar, int i, Void r4) {
            abstractC13084a.onPropertyChanged(tkbVar, i);
        }
    }

    public agd() {
        super(f1584m);
    }

    public void notifyChange(@efb tkb tkbVar, int i) {
        notifyCallbacks(tkbVar, i, null);
    }
}
