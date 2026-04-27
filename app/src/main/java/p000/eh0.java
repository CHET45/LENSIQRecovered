package p000;

import androidx.media3.common.C1213a;
import java.util.Collections;
import p000.C7091i;
import p000.slg;

/* JADX INFO: loaded from: classes3.dex */
public final class eh0 extends slg {

    /* JADX INFO: renamed from: e */
    public static final int f32957e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f32958f = 7;

    /* JADX INFO: renamed from: g */
    public static final int f32959g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f32960h = 10;

    /* JADX INFO: renamed from: i */
    public static final int f32961i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f32962j = 1;

    /* JADX INFO: renamed from: k */
    public static final int[] f32963k = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f32964b;

    /* JADX INFO: renamed from: c */
    public boolean f32965c;

    /* JADX INFO: renamed from: d */
    public int f32966d;

    public eh0(q6h q6hVar) {
        super(q6hVar);
    }

    @Override // p000.slg
    /* JADX INFO: renamed from: a */
    public boolean mo8983a(jhc jhcVar) throws slg.C12653a {
        if (this.f32964b) {
            jhcVar.skipBytes(1);
        } else {
            int unsignedByte = jhcVar.readUnsignedByte();
            int i = (unsignedByte >> 4) & 15;
            this.f32966d = i;
            if (i == 2) {
                this.f82196a.format(new C1213a.b().setContainerMimeType("video/x-flv").setSampleMimeType("audio/mpeg").setChannelCount(1).setSampleRate(f32963k[(unsignedByte >> 2) & 3]).build());
                this.f32965c = true;
            } else if (i == 7 || i == 8) {
                this.f82196a.format(new C1213a.b().setContainerMimeType("video/x-flv").setSampleMimeType(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").setChannelCount(1).setSampleRate(8000).build());
                this.f32965c = true;
            } else if (i != 10) {
                throw new slg.C12653a("Audio format not supported: " + this.f32966d);
            }
            this.f32964b = true;
        }
        return true;
    }

    @Override // p000.slg
    /* JADX INFO: renamed from: b */
    public boolean mo8984b(jhc jhcVar, long j) throws yhc {
        if (this.f32966d == 2) {
            int iBytesLeft = jhcVar.bytesLeft();
            this.f82196a.sampleData(jhcVar, iBytesLeft);
            this.f82196a.sampleMetadata(j, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = jhcVar.readUnsignedByte();
        if (unsignedByte != 0 || this.f32965c) {
            if (this.f32966d == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = jhcVar.bytesLeft();
            this.f82196a.sampleData(jhcVar, iBytesLeft2);
            this.f82196a.sampleMetadata(j, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = jhcVar.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        jhcVar.readBytes(bArr, 0, iBytesLeft3);
        C7091i.c audioSpecificConfig = C7091i.parseAudioSpecificConfig(bArr);
        this.f82196a.format(new C1213a.b().setContainerMimeType("video/x-flv").setSampleMimeType("audio/mp4a-latm").setCodecs(audioSpecificConfig.f45333c).setChannelCount(audioSpecificConfig.f45332b).setSampleRate(audioSpecificConfig.f45331a).setInitializationData(Collections.singletonList(bArr)).build());
        this.f32965c = true;
        return false;
    }

    @Override // p000.slg
    public void seek() {
    }
}
