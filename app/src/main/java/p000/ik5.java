package p000;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface ik5 {

    /* JADX INFO: renamed from: a */
    public static final ik5 f47233a = new ik5() { // from class: gk5
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return ik5.lambda$static$0();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[0];
    }

    xj5[] createExtractors();

    default xj5[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }

    @op1
    default ik5 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @op1
    @Deprecated
    default ik5 experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    default ik5 setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
        return this;
    }
}
