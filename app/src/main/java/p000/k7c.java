package p000;

import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.e6g;

/* JADX INFO: loaded from: classes3.dex */
public final class k7c extends e6g {

    /* JADX INFO: renamed from: s */
    public static final byte[] f52744s = {BuiltinOptions.SplitVOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ScatterNdOptions, 100};

    /* JADX INFO: renamed from: t */
    public static final byte[] f52745t = {BuiltinOptions.SplitVOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.ScatterNdOptions, 103, BuiltinOptions.BucketizeOptions};

    /* JADX INFO: renamed from: r */
    public boolean f52746r;

    private static boolean peekPacketStartsWith(jhc jhcVar, byte[] bArr) {
        if (jhcVar.bytesLeft() < bArr.length) {
            return false;
        }
        int position = jhcVar.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        jhcVar.readBytes(bArr2, 0, bArr.length);
        jhcVar.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean verifyBitstreamType(jhc jhcVar) {
        return peekPacketStartsWith(jhcVar, f52744s);
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: e */
    public long mo121e(jhc jhcVar) {
        return m9754b(m7c.getPacketDurationUs(jhcVar.getData()));
    }

    @Override // p000.e6g
    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public boolean mo122g(jhc jhcVar, long j, e6g.C5148b c5148b) throws yhc {
        if (peekPacketStartsWith(jhcVar, f52744s)) {
            byte[] bArrCopyOf = Arrays.copyOf(jhcVar.getData(), jhcVar.limit());
            int channelCount = m7c.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = m7c.buildInitializationData(bArrCopyOf);
            if (c5148b.f31967a != null) {
                return true;
            }
            c5148b.f31967a = new C1213a.b().setContainerMimeType("audio/ogg").setSampleMimeType("audio/opus").setChannelCount(channelCount).setSampleRate(48000).setInitializationData(listBuildInitializationData).build();
            return true;
        }
        byte[] bArr = f52745t;
        if (!peekPacketStartsWith(jhcVar, bArr)) {
            v80.checkStateNotNull(c5148b.f31967a);
            return false;
        }
        v80.checkStateNotNull(c5148b.f31967a);
        if (this.f52746r) {
            return true;
        }
        this.f52746r = true;
        jhcVar.skipBytes(bArr.length);
        eta vorbisComments = ogi.parseVorbisComments(kx7.copyOf(ogi.readVorbisCommentHeader(jhcVar, false, false).f67592b));
        if (vorbisComments == null) {
            return true;
        }
        c5148b.f31967a = c5148b.f31967a.buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(c5148b.f31967a.f8288l)).build();
        return true;
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: h */
    public void mo123h(boolean z) {
        super.mo123h(z);
        if (z) {
            this.f52746r = false;
        }
    }
}
