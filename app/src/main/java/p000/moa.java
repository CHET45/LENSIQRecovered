package p000;

import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface moa extends vna.InterfaceC14174a {

    /* JADX INFO: renamed from: b */
    public static final moa f61634b = new C9436a();

    /* JADX INFO: renamed from: moa$a */
    public class C9436a implements moa {
        @Override // p000.vna.InterfaceC14174a
        public vna createMediaSource(aga agaVar) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.vna.InterfaceC14174a
        public int[] getSupportedTypes() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.vna.InterfaceC14174a
        public moa setDrmSessionManagerProvider(@hib rr4 rr4Var) {
            return this;
        }

        @Override // p000.vna.InterfaceC14174a
        public moa setLoadErrorHandlingPolicy(@hib ic9 ic9Var) {
            return this;
        }
    }
}
