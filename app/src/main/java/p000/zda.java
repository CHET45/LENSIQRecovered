package p000;

import java.util.List;
import p000.nea;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface zda {

    /* JADX INFO: renamed from: a */
    public static final zda f104850a = new zda() { // from class: wda
        @Override // p000.zda
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return nea.getDecoderInfos(str, z, z2);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final zda f104851b = new zda() { // from class: xda
        @Override // p000.zda
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return zda.lambda$static$0(str, z, z2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List lambda$static$0(String str, boolean z, boolean z2) throws nea.C9821c {
        return nea.getDecoderInfosSortedBySoftwareOnly(f104850a.getDecoderInfos(str, z, z2));
    }

    List<lda> getDecoderInfos(String str, boolean z, boolean z2) throws nea.C9821c;
}
