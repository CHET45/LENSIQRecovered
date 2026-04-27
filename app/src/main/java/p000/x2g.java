package p000;

/* JADX INFO: loaded from: classes.dex */
public interface x2g {

    /* JADX INFO: renamed from: x2g$a */
    public static final class C14888a {
        @gib
        @Deprecated
        public static z2g mergeRecords(@yfb x2g x2gVar, @yfb z2g z2gVar, @yfb z2g z2gVar2, @yfb z2g z2gVar3) {
            return x2g.super.mergeRecords(z2gVar, z2gVar2, z2gVar3);
        }
    }

    @yfb
    z2g getFirstStateRecord();

    @gib
    default z2g mergeRecords(@yfb z2g z2gVar, @yfb z2g z2gVar2, @yfb z2g z2gVar3) {
        return null;
    }

    void prependStateRecord(@yfb z2g z2gVar);
}
