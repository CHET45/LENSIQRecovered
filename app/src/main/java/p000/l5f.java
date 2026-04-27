package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class l5f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final r0h f56247a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final n1i f56248b;

    @a28
    public l5f(@yfb r0h r0hVar, @yfb n1i n1iVar) {
        md8.checkNotNullParameter(r0hVar, "timeProvider");
        md8.checkNotNullParameter(n1iVar, "uuidGenerator");
        this.f56247a = r0hVar;
        this.f56248b = n1iVar;
    }

    private final String generateSessionId() {
        String string = this.f56248b.next().toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        String lowerCase = h9g.replace$default(string, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @yfb
    public final d5f generateNewSession(@gib d5f d5fVar) {
        String firstSessionId;
        String strGenerateSessionId = generateSessionId();
        return new d5f(strGenerateSessionId, (d5fVar == null || (firstSessionId = d5fVar.getFirstSessionId()) == null) ? strGenerateSessionId : firstSessionId, d5fVar != null ? d5fVar.getSessionIndex() + 1 : 0, this.f56247a.currentTime().getUs());
    }
}
