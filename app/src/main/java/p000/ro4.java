package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface ro4<T> {
    @gib
    T closestAnchor(float f);

    @gib
    T closestAnchor(float f, boolean z);

    void forEach(@yfb gz6<? super T, ? super Float, bth> gz6Var);

    int getSize();

    boolean hasAnchorFor(T t);

    float maxAnchor();

    float minAnchor();

    float positionOf(T t);
}
