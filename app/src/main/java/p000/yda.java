package p000;

import java.util.List;
import p000.oea;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface yda {

    /* JADX INFO: renamed from: a */
    public static final yda f101240a = new yda() { // from class: vda
        @Override // p000.yda
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return oea.getDecoderInfos(str, z, z2);
        }
    };

    List<kda> getDecoderInfos(String str, boolean z, boolean z2) throws oea.C10346c;
}
