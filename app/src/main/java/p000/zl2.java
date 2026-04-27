package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface zl2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C16170a f105372a = C16170a.f105373a;

    /* JADX INFO: renamed from: zl2$a */
    public static final class C16170a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C16170a f105373a = new C16170a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final Object f105374b = new a();

        /* JADX INFO: renamed from: zl2$a$a */
        public static final class a {
            @yfb
            public String toString() {
                return "Empty";
            }
        }

        private C16170a() {
        }

        @yfb
        public final Object getEmpty() {
            return f105374b;
        }

        @ha8
        public final void setTracer(@yfb ao2 ao2Var) {
            gm2.f40164a = ao2Var;
        }
    }

    @fl2
    static /* synthetic */ void getApplier$annotations() {
    }

    @ga8
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @ga8
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @fl2
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @fl2
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @fl2
    static /* synthetic */ void getInserting$annotations() {
    }

    @ga8
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @fl2
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @fl2
    static /* synthetic */ void getSkipping$annotations() {
    }

    @fl2
    <V, T> void apply(V v, @yfb gz6<? super T, ? super V, bth> gz6Var);

    @yfb
    @ga8
    dn2 buildContext();

    @fl2
    boolean changed(@gib Object obj);

    @fl2
    default boolean changed(boolean z) {
        return changed(z);
    }

    @fl2
    default boolean changedInstance(@gib Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    @ga8
    <T> T consume(@yfb kn2<T> kn2Var);

    @fl2
    <T> void createNode(@yfb ny6<? extends T> ny6Var);

    @fl2
    void deactivateToEndGroup(boolean z);

    @fl2
    void disableReusing();

    @dpg
    void disableSourceInformation();

    @fl2
    void enableReusing();

    @fl2
    void endDefaults();

    @fl2
    void endMovableGroup();

    @fl2
    void endNode();

    @ga8
    void endProvider();

    @ga8
    void endProviders();

    @fl2
    void endReplaceGroup();

    @fl2
    void endReplaceableGroup();

    @gib
    @fl2
    are endRestartGroup();

    @fl2
    void endReusableGroup();

    @fl2
    void endToMarker(int i);

    @yfb
    p40<?> getApplier();

    @yfb
    @dpg
    e13 getApplyCoroutineContext();

    @yfb
    @dpg
    sz2 getComposition();

    @yfb
    fn2 getCompositionData();

    int getCompoundKeyHash();

    @yfb
    qn2 getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @gib
    rsd getRecomposeScope();

    @gib
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @ga8
    void insertMovableContent(@yfb f0b<?> f0bVar, @gib Object obj);

    @ga8
    void insertMovableContentReferences(@yfb List<scc<i0b, i0b>> list);

    @fl2
    @yfb
    Object joinKey(@gib Object obj, @gib Object obj2);

    @ga8
    void recordSideEffect(@yfb ny6<bth> ny6Var);

    @ga8
    void recordUsed(@yfb rsd rsdVar);

    @gib
    @fl2
    Object rememberedValue();

    @fl2
    void skipCurrentGroup();

    @fl2
    void skipToGroupEnd();

    void sourceInformation(@yfb String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i, @yfb String str);

    @fl2
    void startDefaults();

    @fl2
    void startMovableGroup(int i, @gib Object obj);

    @fl2
    void startNode();

    @ga8
    void startProvider(@yfb did<?> didVar);

    @ga8
    void startProviders(@yfb did<?>[] didVarArr);

    @fl2
    void startReplaceGroup(int i);

    @fl2
    void startReplaceableGroup(int i);

    @fl2
    @yfb
    zl2 startRestartGroup(int i);

    @fl2
    void startReusableGroup(int i, @gib Object obj);

    @fl2
    void startReusableNode();

    @fl2
    void updateRememberedValue(@gib Object obj);

    @fl2
    void useNode();

    @fl2
    default boolean changed(char c) {
        return changed(c);
    }

    @fl2
    default boolean changed(byte b) {
        return changed(b);
    }

    @fl2
    default boolean changed(short s) {
        return changed(s);
    }

    @fl2
    default boolean changed(int i) {
        return changed(i);
    }

    @fl2
    default boolean changed(float f) {
        return changed(f);
    }

    @fl2
    default boolean changed(long j) {
        return changed(j);
    }

    @fl2
    default boolean changed(double d) {
        return changed(d);
    }
}
