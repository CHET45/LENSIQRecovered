package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vy2 {

    /* JADX INFO: renamed from: vy2$a */
    public static final class C14295a extends vy2 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final lp8<?> f92651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14295a(@yfb lp8<?> lp8Var) {
            super(null);
            md8.checkNotNullParameter(lp8Var, "serializer");
            this.f92651a = lp8Var;
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C14295a) && md8.areEqual(((C14295a) obj).f92651a, this.f92651a);
        }

        @yfb
        public final lp8<?> getSerializer() {
            return this.f92651a;
        }

        public int hashCode() {
            return this.f92651a.hashCode();
        }

        @Override // p000.vy2
        @yfb
        public lp8<?> invoke(@yfb List<? extends lp8<?>> list) {
            md8.checkNotNullParameter(list, "typeArgumentsSerializers");
            return this.f92651a;
        }
    }

    /* JADX INFO: renamed from: vy2$b */
    public static final class C14296b extends vy2 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final qy6<List<? extends lp8<?>>, lp8<?>> f92652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14296b(@yfb qy6<? super List<? extends lp8<?>>, ? extends lp8<?>> qy6Var) {
            super(null);
            md8.checkNotNullParameter(qy6Var, "provider");
            this.f92652a = qy6Var;
        }

        @yfb
        public final qy6<List<? extends lp8<?>>, lp8<?>> getProvider() {
            return this.f92652a;
        }

        @Override // p000.vy2
        @yfb
        public lp8<?> invoke(@yfb List<? extends lp8<?>> list) {
            md8.checkNotNullParameter(list, "typeArgumentsSerializers");
            return this.f92652a.invoke(list);
        }
    }

    public /* synthetic */ vy2(jt3 jt3Var) {
        this();
    }

    @yfb
    public abstract lp8<?> invoke(@yfb List<? extends lp8<?>> list);

    private vy2() {
    }
}
