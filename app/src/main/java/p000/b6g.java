package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class b6g implements um0 {

    /* JADX INFO: renamed from: a */
    public final String f12816a;

    private b6g(String str) {
        this.f12816a = str;
    }

    public static b6g parseFrom(jhc jhcVar) {
        return new b6g(jhcVar.readString(jhcVar.bytesLeft()));
    }

    @Override // p000.um0
    public int getType() {
        return 1852994675;
    }
}
