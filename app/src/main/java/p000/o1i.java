package p000;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class o1i implements n1i {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final o1i f66257a = new o1i();

    private o1i() {
    }

    @Override // p000.n1i
    @yfb
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        md8.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
