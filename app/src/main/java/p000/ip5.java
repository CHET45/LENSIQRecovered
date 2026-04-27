package p000;

import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class ip5 extends AbstractC12415s3 {

    /* JADX INFO: renamed from: c */
    @yfb
    public final C7551a f47829c = new C7551a();

    /* JADX INFO: renamed from: ip5$a */
    public static final class C7551a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p000.AbstractC12415s3
    @yfb
    public Random getImpl() {
        Random random = this.f47829c.get();
        md8.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
