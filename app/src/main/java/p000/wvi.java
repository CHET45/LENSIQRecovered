package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum wvi implements nt2 {
    TEXT(0),
    AUDIO(1),
    IMAGE(2),
    VIDEO(3),
    PER(4),
    OTHER(-1);


    /* JADX INFO: renamed from: a */
    public final int f95577a;

    wvi(int i) {
        this.f95577a = i;
    }

    /* JADX INFO: renamed from: a */
    public static wvi m24846a(int i) {
        wvi wviVar = TEXT;
        if (i == wviVar.f95577a) {
            return wviVar;
        }
        wvi wviVar2 = AUDIO;
        if (i == wviVar2.f95577a) {
            return wviVar2;
        }
        wvi wviVar3 = IMAGE;
        if (i == wviVar3.f95577a) {
            return wviVar3;
        }
        wvi wviVar4 = VIDEO;
        if (i == wviVar4.f95577a) {
            return wviVar4;
        }
        wvi wviVar5 = PER;
        if (i == wviVar5.f95577a) {
            return wviVar5;
        }
        wvi wviVar6 = OTHER;
        if (i == wviVar6.f95577a) {
            return wviVar6;
        }
        throw new IllegalArgumentException("type not supported");
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f95577a;
    }
}
