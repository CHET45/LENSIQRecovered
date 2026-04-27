package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface fve<R> {

    /* JADX INFO: renamed from: fve$a */
    public static final class C5999a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void invoke(@yfb fve<? super R> fveVar, @yfb lve<? super P, ? extends Q> lveVar, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var) {
            fveVar.invoke(lveVar, null, gz6Var);
        }

        @wg5
        @ip9
        @q64(level = u64.f86866b, message = "Replaced with the same extension function", replaceWith = @i2e(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        public static <R> void onTimeout(@yfb fve<? super R> fveVar, long j, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var) {
            x4c.onTimeout(fveVar, j, qy6Var);
        }
    }

    void invoke(@yfb hve hveVar, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var);

    <Q> void invoke(@yfb jve<? extends Q> jveVar, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var);

    <P, Q> void invoke(@yfb lve<? super P, ? extends Q> lveVar, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var);

    <P, Q> void invoke(@yfb lve<? super P, ? extends Q> lveVar, P p, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var);

    @wg5
    @ip9
    @q64(level = u64.f86866b, message = "Replaced with the same extension function", replaceWith = @i2e(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    void onTimeout(long j, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var);
}
