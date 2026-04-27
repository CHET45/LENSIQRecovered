package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f36 {

    /* JADX INFO: renamed from: m */
    public static final String f34978m = "FlacStreamMetadata";

    /* JADX INFO: renamed from: n */
    public static final int f34979n = -1;

    /* JADX INFO: renamed from: a */
    public final int f34980a;

    /* JADX INFO: renamed from: b */
    public final int f34981b;

    /* JADX INFO: renamed from: c */
    public final int f34982c;

    /* JADX INFO: renamed from: d */
    public final int f34983d;

    /* JADX INFO: renamed from: e */
    public final int f34984e;

    /* JADX INFO: renamed from: f */
    public final int f34985f;

    /* JADX INFO: renamed from: g */
    public final int f34986g;

    /* JADX INFO: renamed from: h */
    public final int f34987h;

    /* JADX INFO: renamed from: i */
    public final int f34988i;

    /* JADX INFO: renamed from: j */
    public final long f34989j;

    /* JADX INFO: renamed from: k */
    @hib
    public final C5581a f34990k;

    /* JADX INFO: renamed from: l */
    @hib
    public final Metadata f34991l;

    /* JADX INFO: renamed from: f36$a */
    public static class C5581a {

        /* JADX INFO: renamed from: a */
        public final long[] f34992a;

        /* JADX INFO: renamed from: b */
        public final long[] f34993b;

        public C5581a(long[] jArr, long[] jArr2) {
            this.f34992a = jArr;
            this.f34993b = jArr2;
        }
    }

    public f36(byte[] bArr, int i) {
        ghc ghcVar = new ghc(bArr);
        ghcVar.setPosition(i * 8);
        this.f34980a = ghcVar.readBits(16);
        this.f34981b = ghcVar.readBits(16);
        this.f34982c = ghcVar.readBits(24);
        this.f34983d = ghcVar.readBits(24);
        int bits = ghcVar.readBits(20);
        this.f34984e = bits;
        this.f34985f = getSampleRateLookupKey(bits);
        this.f34986g = ghcVar.readBits(3) + 1;
        int bits2 = ghcVar.readBits(5) + 1;
        this.f34987h = bits2;
        this.f34988i = getBitsPerSampleLookupKey(bits2);
        this.f34989j = ghcVar.readBitsToLong(36);
        this.f34990k = null;
        this.f34991l = null;
    }

    @hib
    private static Metadata concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        Metadata vorbisComments = pgi.parseVorbisComments(list);
        if (vorbisComments == null && list2.isEmpty()) {
            return null;
        }
        return new Metadata(list2).copyWithAppendedEntriesFrom(vorbisComments);
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
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
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

    public f36 copyWithPictureFrames(List<PictureFrame> list) {
        return new f36(this.f34980a, this.f34981b, this.f34982c, this.f34983d, this.f34984e, this.f34986g, this.f34987h, this.f34989j, this.f34990k, getMetadataCopyWithAppendedEntriesFrom(new Metadata(list)));
    }

    public f36 copyWithSeekTable(@hib C5581a c5581a) {
        return new f36(this.f34980a, this.f34981b, this.f34982c, this.f34983d, this.f34984e, this.f34986g, this.f34987h, this.f34989j, c5581a, this.f34991l);
    }

    public f36 copyWithVorbisComments(List<String> list) {
        return new f36(this.f34980a, this.f34981b, this.f34982c, this.f34983d, this.f34984e, this.f34986g, this.f34987h, this.f34989j, this.f34990k, getMetadataCopyWithAppendedEntriesFrom(pgi.parseVorbisComments(list)));
    }

    public long getApproxBytesPerFrame() {
        long j;
        long j2;
        int i = this.f34983d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f34982c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f34980a;
            j = ((((i2 != this.f34981b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i2) * ((long) this.f34986g)) * ((long) this.f34987h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public int getDecodedBitrate() {
        return this.f34987h * this.f34984e * this.f34986g;
    }

    public long getDurationUs() {
        long j = this.f34989j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f34984e);
    }

    public kq6 getFormat(byte[] bArr, @hib Metadata metadata) {
        bArr[4] = -128;
        int i = this.f34983d;
        if (i <= 0) {
            i = -1;
        }
        return new kq6.C8497b().setSampleMimeType("audio/flac").setMaxInputSize(i).setChannelCount(this.f34986g).setSampleRate(this.f34984e).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(metadata)).build();
    }

    public int getMaxDecodedFrameSize() {
        return this.f34981b * this.f34986g * (this.f34987h / 8);
    }

    @hib
    public Metadata getMetadataCopyWithAppendedEntriesFrom(@hib Metadata metadata) {
        Metadata metadata2 = this.f34991l;
        return metadata2 == null ? metadata : metadata2.copyWithAppendedEntriesFrom(metadata);
    }

    public long getSampleNumber(long j) {
        return x0i.constrainValue((j * ((long) this.f34984e)) / 1000000, 0L, this.f34989j - 1);
    }

    public f36(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i, i2, i3, i4, i5, i6, i7, j, (C5581a) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private f36(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @hib C5581a c5581a, @hib Metadata metadata) {
        this.f34980a = i;
        this.f34981b = i2;
        this.f34982c = i3;
        this.f34983d = i4;
        this.f34984e = i5;
        this.f34985f = getSampleRateLookupKey(i5);
        this.f34986g = i6;
        this.f34987h = i7;
        this.f34988i = getBitsPerSampleLookupKey(i7);
        this.f34989j = j;
        this.f34990k = c5581a;
        this.f34991l = metadata;
    }
}
