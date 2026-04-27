package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class nyf extends qif {

    /* JADX INFO: renamed from: d */
    public static final int f66092d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f66093e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f66094f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f66095g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f66096h = 255;

    /* JADX INFO: renamed from: a */
    public final ihc f66097a = new ihc();

    /* JADX INFO: renamed from: b */
    public final ghc f66098b = new ghc();

    /* JADX INFO: renamed from: c */
    public g2h f66099c;

    @Override // p000.qif
    /* JADX INFO: renamed from: a */
    public Metadata mo3372a(zta ztaVar, ByteBuffer byteBuffer) {
        g2h g2hVar = this.f66099c;
        if (g2hVar == null || ztaVar.f106068N != g2hVar.getTimestampOffsetUs()) {
            g2h g2hVar2 = new g2h(ztaVar.f82164f);
            this.f66099c = g2hVar2;
            g2hVar2.adjustSampleTimestamp(ztaVar.f82164f - ztaVar.f106068N);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f66097a.reset(bArrArray, iLimit);
        this.f66098b.reset(bArrArray, iLimit);
        this.f66098b.skipBits(39);
        long bits = (((long) this.f66098b.readBits(1)) << 32) | ((long) this.f66098b.readBits(32));
        this.f66098b.skipBits(20);
        int bits2 = this.f66098b.readBits(12);
        int bits3 = this.f66098b.readBits(8);
        this.f66097a.skipBytes(14);
        Metadata.Entry entryM5543b = bits3 != 0 ? bits3 != 255 ? bits3 != 4 ? bits3 != 5 ? bits3 != 6 ? null : TimeSignalCommand.m5543b(this.f66097a, bits, this.f66099c) : SpliceInsertCommand.m5536b(this.f66097a, bits, this.f66099c) : SpliceScheduleCommand.m5537b(this.f66097a) : PrivateCommand.m5535b(this.f66097a, bits2, bits) : new SpliceNullCommand();
        return entryM5543b == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entryM5543b);
    }
}
