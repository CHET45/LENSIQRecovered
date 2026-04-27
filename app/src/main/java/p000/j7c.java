package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.f6g;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j7c extends f6g {

    /* JADX INFO: renamed from: s */
    public static final byte[] f49714s = {BuiltinOptions.SplitVOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ScatterNdOptions, 100};

    /* JADX INFO: renamed from: t */
    public static final byte[] f49715t = {BuiltinOptions.SplitVOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.ScatterNdOptions, 103, BuiltinOptions.BucketizeOptions};

    /* JADX INFO: renamed from: r */
    public boolean f49716r;

    private static boolean peekPacketStartsWith(ihc ihcVar, byte[] bArr) {
        if (ihcVar.bytesLeft() < bArr.length) {
            return false;
        }
        int position = ihcVar.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        ihcVar.readBytes(bArr2, 0, bArr.length);
        ihcVar.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(ihc ihcVar) {
        return peekPacketStartsWith(ihcVar, f49714s);
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: e */
    public long mo2868e(ihc ihcVar) {
        return m10676b(l7c.getPacketDurationUs(ihcVar.getData()));
    }

    @Override // p000.f6g
    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public boolean mo2869g(ihc ihcVar, long j, f6g.C5642b c5642b) throws xhc {
        if (peekPacketStartsWith(ihcVar, f49714s)) {
            byte[] bArrCopyOf = Arrays.copyOf(ihcVar.getData(), ihcVar.limit());
            int channelCount = l7c.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = l7c.buildInitializationData(bArrCopyOf);
            if (c5642b.f35532a != null) {
                return true;
            }
            c5642b.f35532a = new kq6.C8497b().setSampleMimeType("audio/opus").setChannelCount(channelCount).setSampleRate(48000).setInitializationData(listBuildInitializationData).build();
            return true;
        }
        byte[] bArr = f49715t;
        if (!peekPacketStartsWith(ihcVar, bArr)) {
            u80.checkStateNotNull(c5642b.f35532a);
            return false;
        }
        u80.checkStateNotNull(c5642b.f35532a);
        if (this.f49716r) {
            return true;
        }
        this.f49716r = true;
        ihcVar.skipBytes(bArr.length);
        Metadata vorbisComments = pgi.parseVorbisComments(kx7.copyOf(pgi.readVorbisCommentHeader(ihcVar, false, false).f70722b));
        if (vorbisComments == null) {
            return true;
        }
        c5642b.f35532a = c5642b.f35532a.buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(c5642b.f35532a.f54987H)).build();
        return true;
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: h */
    public void mo2870h(boolean z) {
        super.mo2870h(z);
        if (z) {
            this.f49716r = false;
        }
    }
}
