package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class bq6 {

    /* JADX INFO: renamed from: a */
    public static final String f14484a = "ForcedSender";

    private bq6() {
    }

    @xqi
    @igg({"DiscouragedApi"})
    public static void sendBlocking(zgh<?> zghVar, acd acdVar) {
        if (!(zghVar instanceof hhh)) {
            tj9.m22698w(f14484a, "Expected instance of `TransportImpl`, got `%s`.", zghVar);
        } else {
            nhh.getInstance().getUploader().logAndUpdateState(((hhh) zghVar).m12396b().withPriority(acdVar), 1);
        }
    }
}
