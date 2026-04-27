package p000;

import p000.tkb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ss0 extends rs0 {

    /* JADX INFO: renamed from: ss0$a */
    public class C12762a extends tkb.AbstractC13084a {
        public C12762a() {
        }

        @Override // p000.tkb.AbstractC13084a
        public void onPropertyChanged(tkb tkbVar, int i) {
            ss0.this.notifyChange();
        }
    }

    public ss0() {
    }

    public ss0(tkb... tkbVarArr) {
        if (tkbVarArr == null || tkbVarArr.length == 0) {
            return;
        }
        C12762a c12762a = new C12762a();
        for (tkb tkbVar : tkbVarArr) {
            tkbVar.addOnPropertyChangedCallback(c12762a);
        }
    }
}
