package p000;

import java.util.Collections;
import p000.C7696j;
import p000.kq6;
import p000.tlg;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dh0 extends tlg {

    /* JADX INFO: renamed from: e */
    public static final int f29612e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f29613f = 7;

    /* JADX INFO: renamed from: g */
    public static final int f29614g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f29615h = 10;

    /* JADX INFO: renamed from: i */
    public static final int f29616i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f29617j = 1;

    /* JADX INFO: renamed from: k */
    public static final int[] f29618k = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f29619b;

    /* JADX INFO: renamed from: c */
    public boolean f29620c;

    /* JADX INFO: renamed from: d */
    public int f29621d;

    public dh0(r6h r6hVar) {
        super(r6hVar);
    }

    @Override // p000.tlg
    /* JADX INFO: renamed from: a */
    public boolean mo3841a(ihc ihcVar) throws tlg.C13099a {
        if (this.f29619b) {
            ihcVar.skipBytes(1);
        } else {
            int unsignedByte = ihcVar.readUnsignedByte();
            int i = (unsignedByte >> 4) & 15;
            this.f29621d = i;
            if (i == 2) {
                this.f85288a.format(new kq6.C8497b().setSampleMimeType("audio/mpeg").setChannelCount(1).setSampleRate(f29618k[(unsignedByte >> 2) & 3]).build());
                this.f29620c = true;
            } else if (i == 7 || i == 8) {
                this.f85288a.format(new kq6.C8497b().setSampleMimeType(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").setChannelCount(1).setSampleRate(8000).build());
                this.f29620c = true;
            } else if (i != 10) {
                throw new tlg.C13099a("Audio format not supported: " + this.f29621d);
            }
            this.f29619b = true;
        }
        return true;
    }

    @Override // p000.tlg
    /* JADX INFO: renamed from: b */
    public boolean mo3842b(ihc ihcVar, long j) throws xhc {
        if (this.f29621d == 2) {
            int iBytesLeft = ihcVar.bytesLeft();
            this.f85288a.sampleData(ihcVar, iBytesLeft);
            this.f85288a.sampleMetadata(j, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = ihcVar.readUnsignedByte();
        if (unsignedByte != 0 || this.f29620c) {
            if (this.f29621d == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = ihcVar.bytesLeft();
            this.f85288a.sampleData(ihcVar, iBytesLeft2);
            this.f85288a.sampleMetadata(j, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = ihcVar.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        ihcVar.readBytes(bArr, 0, iBytesLeft3);
        C7696j.c audioSpecificConfig = C7696j.parseAudioSpecificConfig(bArr);
        this.f85288a.format(new kq6.C8497b().setSampleMimeType("audio/mp4a-latm").setCodecs(audioSpecificConfig.f49195c).setChannelCount(audioSpecificConfig.f49194b).setSampleRate(audioSpecificConfig.f49193a).setInitializationData(Collections.singletonList(bArr)).build());
        this.f29620c = true;
        return false;
    }

    @Override // p000.tlg
    public void seek() {
    }
}
