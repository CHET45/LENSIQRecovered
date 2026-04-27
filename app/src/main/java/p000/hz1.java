package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.List;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface hz1 {

    /* JADX INFO: renamed from: hz1$a */
    public interface InterfaceC7085a {
        @hib
        hz1 createProgressiveMediaExtractor(int i, C1213a c1213a, boolean z, List<C1213a> list, @hib q6h q6hVar, j0d j0dVar);

        @op1
        default InterfaceC7085a experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        @op1
        default InterfaceC7085a experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return this;
        }

        default C1213a getOutputTextFormat(C1213a c1213a) {
            return c1213a;
        }

        @op1
        default InterfaceC7085a setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
            return this;
        }
    }

    /* JADX INFO: renamed from: hz1$b */
    public interface InterfaceC7086b {
        q6h track(int i, int i2);
    }

    @hib
    mz1 getChunkIndex();

    @hib
    C1213a[] getSampleFormats();

    void init(@hib InterfaceC7086b interfaceC7086b, long j, long j2);

    boolean read(ak5 ak5Var) throws IOException;

    void release();
}
