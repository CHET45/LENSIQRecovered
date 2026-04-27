package p000;

import p000.js8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1095:1\n26#2:1096\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n*L\n527#1:1096\n*E\n"})
@e0g(parameters = 0)
public abstract class ns8<T, E extends js8<T>> {

    /* JADX INFO: renamed from: d */
    public static final int f65496d = 8;

    /* JADX INFO: renamed from: a */
    public int f65497a;

    /* JADX INFO: renamed from: b */
    public int f65498b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final i5b<E> f65499c;

    public /* synthetic */ ns8(jt3 jt3Var) {
        this();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @yfb
    /* JADX INFO: renamed from: at */
    public E mo17540at(T t, @h78(from = 0) int i) {
        E e = (E) createEntityFor$animation_core_release(t);
        this.f65499c.set(i, e);
        return e;
    }

    @yfb
    public E atFraction(T t, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return (E) mo17540at(t, Math.round(this.f65497a * f));
    }

    @yfb
    public abstract E createEntityFor$animation_core_release(T t);

    @h78(from = 0)
    public final int getDelayMillis() {
        return this.f65498b;
    }

    @h78(from = 0)
    public final int getDurationMillis() {
        return this.f65497a;
    }

    @yfb
    public final i5b<E> getKeyframes$animation_core_release() {
        return this.f65499c;
    }

    public final void setDelayMillis(@h78(from = 0) int i) {
        this.f65498b = i;
    }

    public final void setDurationMillis(@h78(from = 0) int i) {
        this.f65497a = i;
    }

    @yfb
    public final E using(@yfb E e, @yfb hv4 hv4Var) {
        e.setEasing$animation_core_release(hv4Var);
        return e;
    }

    private ns8() {
        this.f65497a = 300;
        this.f65499c = z68.mutableIntObjectMapOf();
    }
}
