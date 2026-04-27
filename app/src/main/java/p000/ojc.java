package p000;

/* JADX INFO: loaded from: classes.dex */
public interface ojc {

    /* JADX INFO: renamed from: ojc$a */
    public static final class C10394a {
    }

    static /* synthetic */ boolean getSegment$default(ojc ojcVar, float f, float f2, vic vicVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return ojcVar.getSegment(f, f2, vicVar, z);
    }

    float getLength();

    /* JADX INFO: renamed from: getPosition-tuRUvjQ */
    long mo30402getPositiontuRUvjQ(float f);

    boolean getSegment(float f, float f2, @yfb vic vicVar, boolean z);

    /* JADX INFO: renamed from: getTangent-tuRUvjQ */
    long mo30403getTangenttuRUvjQ(float f);

    void setPath(@gib vic vicVar, boolean z);
}
