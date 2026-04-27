package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a6g implements tm0 {

    /* JADX INFO: renamed from: a */
    public final String f512a;

    private a6g(String str) {
        this.f512a = str;
    }

    public static a6g parseFrom(ihc ihcVar) {
        return new a6g(ihcVar.readString(ihcVar.bytesLeft()));
    }

    @Override // p000.tm0
    public int getType() {
        return 1852994675;
    }
}
