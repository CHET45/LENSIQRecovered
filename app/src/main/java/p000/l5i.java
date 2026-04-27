package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n101#2,2:77\n33#2,6:79\n103#2:85\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:77,2\n42#1:79,6\n42#1:85\n*E\n"})
public final class l5i {

    /* JADX INFO: renamed from: a */
    public final int f56250a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final float[] f56251b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final float[] f56252c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final int[] f56253d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final short[] f56254e;

    /* JADX INFO: renamed from: l5i$a */
    public static final class C8628a extends tt8 implements qy6<Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<izb> f56255a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8628a(List<izb> list) {
            super(1);
            this.f56255a = list;
        }

        @yfb
        public final Boolean invoke(int i) {
            return Boolean.valueOf(i < 0 || i >= this.f56255a.size());
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    public /* synthetic */ l5i(int i, List list, List list2, List list3, List list4, jt3 jt3Var) {
        this(i, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<w82> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = j92.m30490toArgb8_81llA(list.get(i).m32961unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<izb> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long jM30439unboximpl = list.get(i / 2).m30439unboximpl();
            fArr[i] = i % 2 == 0 ? izb.m30429getXimpl(jM30439unboximpl) : izb.m30430getYimpl(jM30439unboximpl);
        }
        return fArr;
    }

    @yfb
    public final int[] getColors() {
        return this.f56253d;
    }

    @yfb
    public final short[] getIndices() {
        return this.f56254e;
    }

    @yfb
    public final float[] getPositions() {
        return this.f56251b;
    }

    @yfb
    public final float[] getTextureCoordinates() {
        return this.f56252c;
    }

    /* JADX INFO: renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m30810getVertexModec2xauaI() {
        return this.f56250a;
    }

    private l5i(int i, List<izb> list, List<izb> list2, List<w82> list3, List<Integer> list4) {
        this.f56250a = i;
        C8628a c8628a = new C8628a(list);
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c8628a.invoke(list4.get(i2)).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.f56251b = encodePointList(list);
        this.f56252c = encodePointList(list2);
        this.f56253d = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            sArr[i3] = (short) list4.get(i3).intValue();
        }
        this.f56254e = sArr;
    }
}
