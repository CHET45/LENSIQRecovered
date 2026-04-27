package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class e36 {

    /* JADX INFO: renamed from: m */
    public static final String f31639m = "FlacStreamMetadata";

    /* JADX INFO: renamed from: n */
    public static final int f31640n = -1;

    /* JADX INFO: renamed from: a */
    public final int f31641a;

    /* JADX INFO: renamed from: b */
    public final int f31642b;

    /* JADX INFO: renamed from: c */
    public final int f31643c;

    /* JADX INFO: renamed from: d */
    public final int f31644d;

    /* JADX INFO: renamed from: e */
    public final int f31645e;

    /* JADX INFO: renamed from: f */
    public final int f31646f;

    /* JADX INFO: renamed from: g */
    public final int f31647g;

    /* JADX INFO: renamed from: h */
    public final int f31648h;

    /* JADX INFO: renamed from: i */
    public final int f31649i;

    /* JADX INFO: renamed from: j */
    public final long f31650j;

    /* JADX INFO: renamed from: k */
    @hib
    public final C5065a f31651k;

    /* JADX INFO: renamed from: l */
    @hib
    public final eta f31652l;

    /* JADX INFO: renamed from: e36$a */
    public static class C5065a {

        /* JADX INFO: renamed from: a */
        public final long[] f31653a;

        /* JADX INFO: renamed from: b */
        public final long[] f31654b;

        public C5065a(long[] jArr, long[] jArr2) {
            this.f31653a = jArr;
            this.f31654b = jArr2;
        }
    }

    public e36(byte[] bArr, int i) {
        hhc hhcVar = new hhc(bArr);
        hhcVar.setPosition(i * 8);
        this.f31641a = hhcVar.readBits(16);
        this.f31642b = hhcVar.readBits(16);
        this.f31643c = hhcVar.readBits(24);
        this.f31644d = hhcVar.readBits(24);
        int bits = hhcVar.readBits(20);
        this.f31645e = bits;
        this.f31646f = getSampleRateLookupKey(bits);
        this.f31647g = hhcVar.readBits(3) + 1;
        int bits2 = hhcVar.readBits(5) + 1;
        this.f31648h = bits2;
        this.f31649i = getBitsPerSampleLookupKey(bits2);
        this.f31650j = hhcVar.readBitsToLong(36);
        this.f31651k = null;
        this.f31652l = null;
    }

    @hib
    private static eta concatenateVorbisMetadata(List<String> list, List<svc> list2) {
        eta vorbisComments = ogi.parseVorbisComments(list);
        if (vorbisComments == null && list2.isEmpty()) {
            return null;
        }
        return new eta(list2).copyWithAppendedEntriesFrom(vorbisComments);
    }

    private static int getBitsPerSampleLookupKey(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int getSampleRateLookupKey(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public e36 copyWithPictureFrames(List<svc> list) {
        return new e36(this.f31641a, this.f31642b, this.f31643c, this.f31644d, this.f31645e, this.f31647g, this.f31648h, this.f31650j, this.f31651k, getMetadataCopyWithAppendedEntriesFrom(new eta(list)));
    }

    public e36 copyWithSeekTable(@hib C5065a c5065a) {
        return new e36(this.f31641a, this.f31642b, this.f31643c, this.f31644d, this.f31645e, this.f31647g, this.f31648h, this.f31650j, c5065a, this.f31652l);
    }

    public e36 copyWithVorbisComments(List<String> list) {
        return new e36(this.f31641a, this.f31642b, this.f31643c, this.f31644d, this.f31645e, this.f31647g, this.f31648h, this.f31650j, this.f31651k, getMetadataCopyWithAppendedEntriesFrom(ogi.parseVorbisComments(list)));
    }

    public long getApproxBytesPerFrame() {
        long j;
        long j2;
        int i = this.f31644d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f31643c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f31641a;
            j = ((((i2 != this.f31642b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i2) * ((long) this.f31647g)) * ((long) this.f31648h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public int getDecodedBitrate() {
        return this.f31648h * this.f31645e * this.f31647g;
    }

    public long getDurationUs() {
        long j = this.f31650j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f31645e);
    }

    public C1213a getFormat(byte[] bArr, @hib eta etaVar) {
        bArr[4] = -128;
        int i = this.f31644d;
        if (i <= 0) {
            i = -1;
        }
        return new C1213a.b().setSampleMimeType("audio/flac").setMaxInputSize(i).setChannelCount(this.f31647g).setSampleRate(this.f31645e).setPcmEncoding(t0i.getPcmEncoding(this.f31648h)).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(etaVar)).build();
    }

    public int getMaxDecodedFrameSize() {
        return this.f31642b * this.f31647g * (this.f31648h / 8);
    }

    @hib
    public eta getMetadataCopyWithAppendedEntriesFrom(@hib eta etaVar) {
        eta etaVar2 = this.f31652l;
        return etaVar2 == null ? etaVar : etaVar2.copyWithAppendedEntriesFrom(etaVar);
    }

    public long getSampleNumber(long j) {
        return t0i.constrainValue((j * ((long) this.f31645e)) / 1000000, 0L, this.f31650j - 1);
    }

    public e36(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ArrayList<String> arrayList, ArrayList<svc> arrayList2) {
        this(i, i2, i3, i4, i5, i6, i7, j, (C5065a) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private e36(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @hib C5065a c5065a, @hib eta etaVar) {
        this.f31641a = i;
        this.f31642b = i2;
        this.f31643c = i3;
        this.f31644d = i4;
        this.f31645e = i5;
        this.f31646f = getSampleRateLookupKey(i5);
        this.f31647g = i6;
        this.f31648h = i7;
        this.f31649i = getBitsPerSampleLookupKey(i7);
        this.f31650j = j;
        this.f31651k = c5065a;
        this.f31652l = etaVar;
    }
}
