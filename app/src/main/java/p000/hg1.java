package p000;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.bt4;
import p000.goh;
import p000.iqh;
import p000.m1i;
import p000.oph;
import p000.woh;

/* JADX INFO: loaded from: classes7.dex */
public final class hg1 {
    @ph5
    public static final /* synthetic */ <T, E extends T> lp8<E[]> ArraySerializer(lp8<E> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "elementSerializer");
        md8.reifiedOperationMarker(4, "T");
        return ArraySerializer(vvd.getOrCreateKotlinClass(Object.class), lp8Var);
    }

    @yfb
    public static final lp8<boolean[]> BooleanArraySerializer() {
        return ta1.f84070c;
    }

    @yfb
    public static final lp8<byte[]> ByteArraySerializer() {
        return mi1.f61052c;
    }

    @yfb
    public static final lp8<char[]> CharArraySerializer() {
        return nv1.f65776c;
    }

    @yfb
    public static final lp8<double[]> DoubleArraySerializer() {
        return wj4.f94408c;
    }

    @yfb
    public static final lp8<float[]> FloatArraySerializer() {
        return c46.f15757c;
    }

    @yfb
    public static final lp8<int[]> IntArraySerializer() {
        return e68.f31901c;
    }

    @yfb
    public static final <T> lp8<List<T>> ListSerializer(@yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "elementSerializer");
        return new t60(lp8Var);
    }

    @yfb
    public static final lp8<long[]> LongArraySerializer() {
        return uk9.f88236c;
    }

    @yfb
    public static final <K, V> lp8<Map.Entry<K, V>> MapEntrySerializer(@yfb lp8<K> lp8Var, @yfb lp8<V> lp8Var2) {
        md8.checkNotNullParameter(lp8Var, "keySerializer");
        md8.checkNotNullParameter(lp8Var2, "valueSerializer");
        return new qs9(lp8Var, lp8Var2);
    }

    @yfb
    public static final <K, V> lp8<Map<K, V>> MapSerializer(@yfb lp8<K> lp8Var, @yfb lp8<V> lp8Var2) {
        md8.checkNotNullParameter(lp8Var, "keySerializer");
        md8.checkNotNullParameter(lp8Var2, "valueSerializer");
        return new p79(lp8Var, lp8Var2);
    }

    @ph5
    @yfb
    public static final lp8 NothingSerializer() {
        return hgb.f43598a;
    }

    @yfb
    public static final <K, V> lp8<scc<K, V>> PairSerializer(@yfb lp8<K> lp8Var, @yfb lp8<V> lp8Var2) {
        md8.checkNotNullParameter(lp8Var, "keySerializer");
        md8.checkNotNullParameter(lp8Var2, "valueSerializer");
        return new wcc(lp8Var, lp8Var2);
    }

    @yfb
    public static final <T> lp8<Set<T>> SetSerializer(@yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "elementSerializer");
        return new u79(lp8Var);
    }

    @yfb
    public static final lp8<short[]> ShortArraySerializer() {
        return saf.f81063c;
    }

    @yfb
    public static final <A, B, C> lp8<djh<A, B, C>> TripleSerializer(@yfb lp8<A> lp8Var, @yfb lp8<B> lp8Var2, @yfb lp8<C> lp8Var3) {
        md8.checkNotNullParameter(lp8Var, "aSerializer");
        md8.checkNotNullParameter(lp8Var2, "bSerializer");
        md8.checkNotNullParameter(lp8Var3, "cSerializer");
        return new fjh(lp8Var, lp8Var2, lp8Var3);
    }

    @ph5
    @yfb
    @yh5
    public static final lp8<hoh> UByteArraySerializer() {
        return koh.f54879c;
    }

    @ph5
    @yfb
    @yh5
    public static final lp8<fph> UIntArraySerializer() {
        return iph.f47864c;
    }

    @ph5
    @yfb
    @yh5
    public static final lp8<pph> ULongArraySerializer() {
        return sph.f82568c;
    }

    @ph5
    @yfb
    @yh5
    public static final lp8<jqh> UShortArraySerializer() {
        return mqh.f61774c;
    }

    @yfb
    public static final <T> lp8<T> getNullable(@yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "<this>");
        return lp8Var.getDescriptor().isNullable() ? lp8Var : new qib(lp8Var);
    }

    public static /* synthetic */ void getNullable$annotations(lp8 lp8Var) {
    }

    @yfb
    public static final lp8<Character> serializer(@yfb rv1 rv1Var) {
        md8.checkNotNullParameter(rv1Var, "<this>");
        return fw1.f37857a;
    }

    @ph5
    @yfb
    public static final <T, E extends T> lp8<E[]> ArraySerializer(@yfb oo8<T> oo8Var, @yfb lp8<E> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(lp8Var, "elementSerializer");
        return new mvd(oo8Var, lp8Var);
    }

    @yfb
    public static final lp8<Byte> serializer(@yfb kj1 kj1Var) {
        md8.checkNotNullParameter(kj1Var, "<this>");
        return pj1.f71062a;
    }

    @yfb
    public static final lp8<Short> serializer(@yfb taf tafVar) {
        md8.checkNotNullParameter(tafVar, "<this>");
        return vaf.f90484a;
    }

    @yfb
    public static final lp8<Integer> serializer(@yfb f68 f68Var) {
        md8.checkNotNullParameter(f68Var, "<this>");
        return o78.f66598a;
    }

    @yfb
    public static final lp8<Long> serializer(@yfb wk9 wk9Var) {
        md8.checkNotNullParameter(wk9Var, "<this>");
        return wl9.f94628a;
    }

    @yfb
    public static final lp8<Float> serializer(@yfb d46 d46Var) {
        md8.checkNotNullParameter(d46Var, "<this>");
        return a56.f424a;
    }

    @yfb
    public static final lp8<Double> serializer(@yfb ak4 ak4Var) {
        md8.checkNotNullParameter(ak4Var, "<this>");
        return fk4.f36907a;
    }

    @yfb
    public static final lp8<Boolean> serializer(@yfb va1 va1Var) {
        md8.checkNotNullParameter(va1Var, "<this>");
        return ya1.f100910a;
    }

    @yfb
    public static final lp8<bth> serializer(@yfb bth bthVar) {
        md8.checkNotNullParameter(bthVar, "<this>");
        return fth.f37729b;
    }

    @yfb
    public static final lp8<String> serializer(@yfb l7g l7gVar) {
        md8.checkNotNullParameter(l7gVar, "<this>");
        return i8g.f46073a;
    }

    @yfb
    public static final lp8<woh> serializer(@yfb woh.C14731a c14731a) {
        md8.checkNotNullParameter(c14731a, "<this>");
        return nph.f65234a;
    }

    @yfb
    public static final lp8<oph> serializer(@yfb oph.C10496a c10496a) {
        md8.checkNotNullParameter(c10496a, "<this>");
        return xph.f98886a;
    }

    @yfb
    public static final lp8<goh> serializer(@yfb goh.C6451a c6451a) {
        md8.checkNotNullParameter(c6451a, "<this>");
        return moh.f61636a;
    }

    @yfb
    public static final lp8<iqh> serializer(@yfb iqh.C7568a c7568a) {
        md8.checkNotNullParameter(c7568a, "<this>");
        return oqh.f68332a;
    }

    @yfb
    public static final lp8<bt4> serializer(@yfb bt4.C2044a c2044a) {
        md8.checkNotNullParameter(c2044a, "<this>");
        return kt4.f55286a;
    }

    @yfb
    @zh5
    public static final lp8<m1i> serializer(@yfb m1i.C9095a c9095a) {
        md8.checkNotNullParameter(c9095a, "<this>");
        return t1i.f83441a;
    }
}
