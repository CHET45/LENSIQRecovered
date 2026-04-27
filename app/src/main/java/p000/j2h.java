package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface j2h {
    j2h copyOf();

    default long getLastTimestampUs() {
        return -9223372036854775807L;
    }

    boolean hasNext();

    long next();
}
