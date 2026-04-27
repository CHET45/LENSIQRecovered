package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.jvd;
import p000.rad;
import p000.rm6;
import p000.xl7;

/* JADX INFO: loaded from: classes.dex */
public final class tt3 implements y08 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final tt3 f85805a = new tt3();

    /* JADX INFO: renamed from: tt3$a */
    public static final class C13187a extends InterfaceC0701e.d implements fp4 {

        /* JADX INFO: renamed from: M1 */
        public boolean f85806M1;

        /* JADX INFO: renamed from: X */
        @yfb
        public final q98 f85807X;

        /* JADX INFO: renamed from: Y */
        public boolean f85808Y;

        /* JADX INFO: renamed from: Z */
        public boolean f85809Z;

        /* JADX INFO: renamed from: tt3$a$a */
        @ck3(m4009c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", m4010f = "Indication.kt", m4011i = {}, m4012l = {240}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f85810a;

            /* JADX INFO: renamed from: tt3$a$a$a, reason: collision with other inner class name */
            public static final class C16531a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ jvd.C8119f f85812a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ jvd.C8119f f85813b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ jvd.C8119f f85814c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C13187a f85815d;

                public C16531a(jvd.C8119f c8119f, jvd.C8119f c8119f2, jvd.C8119f c8119f3, C13187a c13187a) {
                    this.f85812a = c8119f;
                    this.f85813b = c8119f2;
                    this.f85814c = c8119f3;
                    this.f85815d = c13187a;
                }

                @Override // p000.t66
                public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                    return emit((p98) obj, (zy2<? super bth>) zy2Var);
                }

                @gib
                public final Object emit(@yfb p98 p98Var, @yfb zy2<? super bth> zy2Var) {
                    boolean z = true;
                    if (p98Var instanceof rad.C11972b) {
                        this.f85812a.f52108a++;
                    } else if (p98Var instanceof rad.C11973c) {
                        jvd.C8119f c8119f = this.f85812a;
                        c8119f.f52108a--;
                    } else if (p98Var instanceof rad.C11971a) {
                        jvd.C8119f c8119f2 = this.f85812a;
                        c8119f2.f52108a--;
                    } else if (p98Var instanceof xl7.C15183a) {
                        this.f85813b.f52108a++;
                    } else if (p98Var instanceof xl7.C15184b) {
                        jvd.C8119f c8119f3 = this.f85813b;
                        c8119f3.f52108a--;
                    } else if (p98Var instanceof rm6.C12153a) {
                        this.f85814c.f52108a++;
                    } else if (p98Var instanceof rm6.C12154b) {
                        jvd.C8119f c8119f4 = this.f85814c;
                        c8119f4.f52108a--;
                    }
                    boolean z2 = false;
                    boolean z3 = this.f85812a.f52108a > 0;
                    boolean z4 = this.f85813b.f52108a > 0;
                    boolean z5 = this.f85814c.f52108a > 0;
                    if (this.f85815d.f85808Y != z3) {
                        this.f85815d.f85808Y = z3;
                        z2 = true;
                    }
                    if (this.f85815d.f85809Z != z4) {
                        this.f85815d.f85809Z = z4;
                        z2 = true;
                    }
                    if (this.f85815d.f85806M1 != z5) {
                        this.f85815d.f85806M1 = z5;
                    } else {
                        z = z2;
                    }
                    if (z) {
                        gp4.invalidateDraw(this.f85815d);
                    }
                    return bth.f14751a;
                }
            }

            public a(zy2<? super a> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return C13187a.this.new a(zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f85810a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    jvd.C8119f c8119f = new jvd.C8119f();
                    jvd.C8119f c8119f2 = new jvd.C8119f();
                    jvd.C8119f c8119f3 = new jvd.C8119f();
                    y56<p98> interactions = C13187a.this.f85807X.getInteractions();
                    C16531a c16531a = new C16531a(c8119f, c8119f2, c8119f3, C13187a.this);
                    this.f85810a = 1;
                    if (interactions.collect(c16531a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        public C13187a(@yfb q98 q98Var) {
            this.f85807X = q98Var;
        }

        @Override // p000.fp4
        public void draw(@yfb ov2 ov2Var) {
            ov2Var.drawContent();
            if (this.f85808Y) {
                ip4.m30248drawRectnJ9OG0$default(ov2Var, w82.m32950copywmQWz5c$default(w82.f93556b.m32977getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, ov2Var.mo30273getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.f85809Z || this.f85806M1) {
                ip4.m30248drawRectnJ9OG0$default(ov2Var, w82.m32950copywmQWz5c$default(w82.f93556b.m32977getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, ov2Var.mo30273getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.p002ui.InterfaceC0701e.d
        public void onAttach() {
            fg1.launch$default(getCoroutineScope(), null, null, new a(null), 3, null);
        }
    }

    private tt3() {
    }

    @Override // p000.y08
    @yfb
    public v34 create(@yfb q98 q98Var) {
        return new C13187a(q98Var);
    }

    @Override // p000.y08
    public boolean equals(@gib Object obj) {
        return obj == this;
    }

    @Override // p000.y08
    public int hashCode() {
        return -1;
    }
}
