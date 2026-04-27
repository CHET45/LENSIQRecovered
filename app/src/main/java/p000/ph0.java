package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum ph0 implements ot2 {
    MP3(amc.f2088w),
    WAV(st5.f82814b),
    AAC("aac"),
    PCM(st5.f82815c);


    /* JADX INFO: renamed from: a */
    public final String f70778a;

    ph0(String str) {
        this.f70778a = str;
    }

    @Override // p000.ot2
    public String getValue() {
        return this.f70778a;
    }
}
