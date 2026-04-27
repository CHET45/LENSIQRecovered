package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c76 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f15901a = "kotlinx.coroutines.flow.defaultConcurrency";

    @yfb
    public static final <T> y56<T> asFlow(@yfb ny6<? extends T> ny6Var) {
        return d76.asFlow(ny6Var);
    }

    @yfb
    public static final <T> q9f<T> asSharedFlow(@yfb v6b<T> v6bVar) {
        return w76.asSharedFlow(v6bVar);
    }

    @yfb
    public static final <T> l2g<T> asStateFlow(@yfb a7b<T> a7bVar) {
        return w76.asStateFlow(a7bVar);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @i2e(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    public static final <T> y56<T> cache(@yfb y56<? extends T> y56Var) {
        return u76.cache(y56Var);
    }

    @yfb
    public static final <T> y56<T> callbackFlow(@yfb @cg1 gz6<? super vdd<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return d76.callbackFlow(gz6Var);
    }

    @yfb
    public static final <T> y56<T> cancellable(@yfb y56<? extends T> y56Var) {
        return h76.cancellable(y56Var);
    }

    @yfb
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> y56<T> m28222catch(@yfb y56<? extends T> y56Var, @yfb kz6<? super t66<? super T>, ? super Throwable, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return q76.m31934catch(y56Var, kz6Var);
    }

    @gib
    public static final <T> Object catchImpl(@yfb y56<? extends T> y56Var, @yfb t66<? super T> t66Var, @yfb zy2<? super Throwable> zy2Var) throws Throwable {
        return q76.catchImpl(y56Var, t66Var, zy2Var);
    }

    @yfb
    public static final <T> y56<T> channelFlow(@yfb @cg1 gz6<? super vdd<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return d76.channelFlow(gz6Var);
    }

    @wg5
    @yfb
    public static final <T> y56<List<T>> chunked(@yfb y56<? extends T> y56Var, int i) {
        return x76.chunked(y56Var, i);
    }

    @gib
    public static final Object collect(@yfb y56<?> y56Var, @yfb zy2<? super bth> zy2Var) {
        return f76.collect(y56Var, zy2Var);
    }

    @gib
    public static final <T> Object collectIndexed(@yfb y56<? extends T> y56Var, @yfb kz6<? super Integer, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, @yfb zy2<? super bth> zy2Var) {
        return f76.collectIndexed(y56Var, kz6Var, zy2Var);
    }

    @gib
    public static final <T> Object collectLatest(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        return f76.collectLatest(y56Var, gz6Var, zy2Var);
    }

    @gib
    public static final <T> Object collectWhile(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        return r76.collectWhile(y56Var, gz6Var, zy2Var);
    }

    @yfb
    public static final <T1, T2, T3, T4, T5, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb y56<? extends T5> y56Var5, @yfb uz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super zy2<? super R>, ? extends Object> uz6Var) {
        return y76.combine(y56Var, y56Var2, y56Var3, y56Var4, y56Var5, uz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb y56<? extends T5> y56Var5, @yfb uz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super zy2<? super R>, ? extends Object> uz6Var) {
        return u76.combineLatest(y56Var, y56Var2, y56Var3, y56Var4, y56Var5, uz6Var);
    }

    @yfb
    public static final <T1, T2, T3, T4, T5, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb y56<? extends T5> y56Var5, @yfb @cg1 xz6<? super t66<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super zy2<? super bth>, ? extends Object> xz6Var) {
        return y76.combineTransform(y56Var, y56Var2, y56Var3, y56Var4, y56Var5, xz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'compose' is 'let'", replaceWith = @i2e(expression = "let(transformer)", imports = {}))
    public static final <T, R> y56<R> compose(@yfb y56<? extends T> y56Var, @yfb qy6<? super y56<? extends T>, ? extends y56<? extends R>> qy6Var) {
        return u76.compose(y56Var, qy6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @i2e(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> y56<R> concatMap(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, ? extends y56<? extends R>> qy6Var) {
        return u76.concatMap(y56Var, qy6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @i2e(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> y56<T> concatWith(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        return u76.concatWith((y56) y56Var, (y56) y56Var2);
    }

    @yfb
    public static final <T> y56<T> conflate(@yfb y56<? extends T> y56Var) {
        return h76.conflate(y56Var);
    }

    @yfb
    public static final <T> y56<T> consumeAsFlow(@yfb hsd<? extends T> hsdVar) {
        return e76.consumeAsFlow(hsdVar);
    }

    @gib
    public static final <T> Object count(@yfb y56<? extends T> y56Var, @yfb zy2<? super Integer> zy2Var) {
        return i76.count(y56Var, zy2Var);
    }

    @d86
    @yfb
    public static final <T> y56<T> debounce(@yfb y56<? extends T> y56Var, long j) {
        return l76.debounce(y56Var, j);
    }

    @d86
    @yfb
    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> y56<T> m28223debounceHG0u8IE(@yfb y56<? extends T> y56Var, long j) {
        return l76.m30811debounceHG0u8IE(y56Var, j);
    }

    @d86
    @r9c
    @xn8(name = "debounceDuration")
    @yfb
    public static final <T> y56<T> debounceDuration(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, bt4> qy6Var) {
        return l76.debounceDuration(y56Var, qy6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @i2e(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> y56<T> delayEach(@yfb y56<? extends T> y56Var, long j) {
        return u76.delayEach(y56Var, j);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @i2e(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> y56<T> delayFlow(@yfb y56<? extends T> y56Var, long j) {
        return u76.delayFlow(y56Var, j);
    }

    @yfb
    public static final <T> y56<T> distinctUntilChanged(@yfb y56<? extends T> y56Var) {
        return o76.distinctUntilChanged(y56Var);
    }

    @yfb
    public static final <T, K> y56<T> distinctUntilChangedBy(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, ? extends K> qy6Var) {
        return o76.distinctUntilChangedBy(y56Var, qy6Var);
    }

    @yfb
    public static final <T> y56<T> drop(@yfb y56<? extends T> y56Var, int i) {
        return r76.drop(y56Var, i);
    }

    @yfb
    public static final <T> y56<T> dropWhile(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return r76.dropWhile(y56Var, gz6Var);
    }

    @gib
    public static final <T> Object emitAll(@yfb t66<? super T> t66Var, @yfb y56<? extends T> y56Var, @yfb zy2<? super bth> zy2Var) {
        return f76.emitAll(t66Var, y56Var, zy2Var);
    }

    @yfb
    public static final <T> y56<T> emptyFlow() {
        return d76.emptyFlow();
    }

    public static final void ensureActive(@yfb t66<?> t66Var) {
        p76.ensureActive(t66Var);
    }

    @yfb
    public static final <T> y56<T> filter(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return x76.filter(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> filterNot(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return x76.filterNot(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> filterNotNull(@yfb y56<? extends T> y56Var) {
        return x76.filterNotNull(y56Var);
    }

    @gib
    public static final <T> Object first(@yfb y56<? extends T> y56Var, @yfb zy2<? super T> zy2Var) {
        return v76.first(y56Var, zy2Var);
    }

    @gib
    public static final <T> Object firstOrNull(@yfb y56<? extends T> y56Var, @yfb zy2<? super T> zy2Var) {
        return v76.firstOrNull(y56Var, zy2Var);
    }

    @yfb
    public static final hsd<bth> fixedPeriodTicker(@yfb x13 x13Var, long j) {
        return l76.fixedPeriodTicker(x13Var, j);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue is 'flatMapConcat'", replaceWith = @i2e(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> y56<R> flatMap(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return u76.flatMap(y56Var, gz6Var);
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> flatMapConcat(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return s76.flatMapConcat(y56Var, gz6Var);
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> flatMapLatest(@yfb y56<? extends T> y56Var, @yfb @cg1 gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return s76.flatMapLatest(y56Var, gz6Var);
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> flatMapMerge(@yfb y56<? extends T> y56Var, int i, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return s76.flatMapMerge(y56Var, i, gz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @i2e(expression = "flattenConcat()", imports = {}))
    public static final <T> y56<T> flatten(@yfb y56<? extends y56<? extends T>> y56Var) {
        return u76.flatten(y56Var);
    }

    @wg5
    @yfb
    public static final <T> y56<T> flattenConcat(@yfb y56<? extends y56<? extends T>> y56Var) {
        return s76.flattenConcat(y56Var);
    }

    @wg5
    @yfb
    public static final <T> y56<T> flattenMerge(@yfb y56<? extends y56<? extends T>> y56Var, int i) {
        return s76.flattenMerge(y56Var, i);
    }

    @yfb
    public static final <T> y56<T> flow(@yfb @cg1 gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return d76.flow(gz6Var);
    }

    @yfb
    @xn8(name = "flowCombine")
    public static final <T1, T2, R> y56<R> flowCombine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return y76.flowCombine(y56Var, y56Var2, kz6Var);
    }

    @yfb
    @xn8(name = "flowCombineTransform")
    public static final <T1, T2, R> y56<R> flowCombineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb @cg1 oz6<? super t66<? super R>, ? super T1, ? super T2, ? super zy2<? super bth>, ? extends Object> oz6Var) {
        return y76.flowCombineTransform(y56Var, y56Var2, oz6Var);
    }

    @yfb
    public static final <T> y56<T> flowOf(T t) {
        return d76.flowOf(t);
    }

    @yfb
    public static final <T> y56<T> flowOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        return h76.flowOn(y56Var, e13Var);
    }

    @gib
    public static final <T, R> Object fold(@yfb y56<? extends T> y56Var, R r, @yfb kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var, @yfb zy2<? super R> zy2Var) {
        return v76.fold(y56Var, r, kz6Var, zy2Var);
    }

    @q64(level = u64.f86866b, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @i2e(expression = "collect(action)", imports = {}))
    public static final <T> void forEach(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        u76.forEach(y56Var, gz6Var);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return s76.getDEFAULT_CONCURRENCY();
    }

    @gib
    public static final <T> Object last(@yfb y56<? extends T> y56Var, @yfb zy2<? super T> zy2Var) {
        return v76.last(y56Var, zy2Var);
    }

    @gib
    public static final <T> Object lastOrNull(@yfb y56<? extends T> y56Var, @yfb zy2<? super T> zy2Var) {
        return v76.lastOrNull(y56Var, zy2Var);
    }

    @yfb
    public static final <T> jj8 launchIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var) {
        return f76.launchIn(y56Var, x13Var);
    }

    @yfb
    public static final <T, R> y56<R> map(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return x76.map(y56Var, gz6Var);
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> mapLatest(@yfb y56<? extends T> y56Var, @yfb @cg1 gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return s76.mapLatest(y56Var, gz6Var);
    }

    @yfb
    public static final <T, R> y56<R> mapNotNull(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return x76.mapNotNull(y56Var, gz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @i2e(expression = "flattenConcat()", imports = {}))
    public static final <T> y56<T> merge(@yfb y56<? extends y56<? extends T>> y56Var) {
        return u76.merge(y56Var);
    }

    @yfb
    public static final Void noImpl() {
        return u76.noImpl();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Collect flow in the desired context instead")
    public static final <T> y56<T> observeOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        return u76.observeOn(y56Var, e13Var);
    }

    @yfb
    public static final <T> y56<T> onCompletion(@yfb y56<? extends T> y56Var, @yfb kz6<? super t66<? super T>, ? super Throwable, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return p76.onCompletion(y56Var, kz6Var);
    }

    @yfb
    public static final <T> y56<T> onEach(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return x76.onEach(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> onEmpty(@yfb y56<? extends T> y56Var, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return p76.onEmpty(y56Var, gz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @i2e(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> y56<T> onErrorResume(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        return u76.onErrorResume(y56Var, y56Var2);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @i2e(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> y56<T> onErrorResumeNext(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        return u76.onErrorResumeNext(y56Var, y56Var2);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @i2e(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> y56<T> onErrorReturn(@yfb y56<? extends T> y56Var, T t) {
        return u76.onErrorReturn(y56Var, t);
    }

    @yfb
    public static final <T> y56<T> onStart(@yfb y56<? extends T> y56Var, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return p76.onStart(y56Var, gz6Var);
    }

    @yfb
    public static final <T> q9f<T> onSubscription(@yfb q9f<? extends T> q9fVar, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return w76.onSubscription(q9fVar, gz6Var);
    }

    @yfb
    public static final <T> hsd<T> produceIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var) {
        return e76.produceIn(y56Var, x13Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> y56<T> publish(@yfb y56<? extends T> y56Var) {
        return u76.publish(y56Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Collect flow in the desired context instead")
    public static final <T> y56<T> publishOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        return u76.publishOn(y56Var, e13Var);
    }

    @yfb
    public static final <T> y56<T> receiveAsFlow(@yfb hsd<? extends T> hsdVar) {
        return e76.receiveAsFlow(hsdVar);
    }

    @gib
    public static final <S, T extends S> Object reduce(@yfb y56<? extends T> y56Var, @yfb kz6<? super S, ? super T, ? super zy2<? super S>, ? extends Object> kz6Var, @yfb zy2<? super S> zy2Var) {
        return v76.reduce(y56Var, kz6Var, zy2Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> y56<T> replay(@yfb y56<? extends T> y56Var) {
        return u76.replay(y56Var);
    }

    @yfb
    public static final <T> y56<T> retry(@yfb y56<? extends T> y56Var, long j, @yfb gz6<? super Throwable, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return q76.retry(y56Var, j, gz6Var);
    }

    @yfb
    public static final <T> y56<T> retryWhen(@yfb y56<? extends T> y56Var, @yfb oz6<? super t66<? super T>, ? super Throwable, ? super Long, ? super zy2<? super Boolean>, ? extends Object> oz6Var) {
        return q76.retryWhen(y56Var, oz6Var);
    }

    @yfb
    public static final <T, R> y56<R> runningFold(@yfb y56<? extends T> y56Var, R r, @yfb @cg1 kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return x76.runningFold(y56Var, r, kz6Var);
    }

    @yfb
    public static final <T> y56<T> runningReduce(@yfb y56<? extends T> y56Var, @yfb kz6<? super T, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        return x76.runningReduce(y56Var, kz6Var);
    }

    @d86
    @yfb
    public static final <T> y56<T> sample(@yfb y56<? extends T> y56Var, long j) {
        return l76.sample(y56Var, j);
    }

    @d86
    @yfb
    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> y56<T> m28224sampleHG0u8IE(@yfb y56<? extends T> y56Var, long j) {
        return l76.m30812sampleHG0u8IE(y56Var, j);
    }

    @yfb
    public static final <T, R> y56<R> scan(@yfb y56<? extends T> y56Var, R r, @yfb @cg1 kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return x76.scan(y56Var, r, kz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow has less verbose 'scan' shortcut", replaceWith = @i2e(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> y56<R> scanFold(@yfb y56<? extends T> y56Var, R r, @yfb @cg1 kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return u76.scanFold(y56Var, r, kz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @i2e(expression = "runningReduce(operation)", imports = {}))
    public static final <T> y56<T> scanReduce(@yfb y56<? extends T> y56Var, @yfb kz6<? super T, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        return u76.scanReduce(y56Var, kz6Var);
    }

    @yfb
    public static final <T> q9f<T> shareIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var, @yfb jaf jafVar, int i) {
        return w76.shareIn(y56Var, x13Var, jafVar, i);
    }

    @gib
    public static final <T> Object single(@yfb y56<? extends T> y56Var, @yfb zy2<? super T> zy2Var) {
        return v76.single(y56Var, zy2Var);
    }

    @gib
    public static final <T> Object singleOrNull(@yfb y56<? extends T> y56Var, @yfb zy2<? super T> zy2Var) {
        return v76.singleOrNull(y56Var, zy2Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @i2e(expression = "drop(count)", imports = {}))
    public static final <T> y56<T> skip(@yfb y56<? extends T> y56Var, int i) {
        return u76.skip(y56Var, i);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @i2e(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> y56<T> startWith(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        return u76.startWith((y56) y56Var, (y56) y56Var2);
    }

    @yfb
    public static final <T> l2g<T> stateIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var, @yfb jaf jafVar, T t) {
        return w76.stateIn(y56Var, x13Var, jafVar, t);
    }

    @q64(level = u64.f86866b, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@yfb y56<? extends T> y56Var) {
        u76.subscribe(y56Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Use 'flowOn' instead")
    public static final <T> y56<T> subscribeOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        return u76.subscribeOn(y56Var, e13Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @i2e(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> y56<R> switchMap(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return u76.switchMap(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> take(@yfb y56<? extends T> y56Var, int i) {
        return r76.take(y56Var, i);
    }

    @yfb
    public static final <T> y56<T> takeWhile(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return r76.takeWhile(y56Var, gz6Var);
    }

    @d86
    @yfb
    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> y56<T> m28225timeoutHG0u8IE(@yfb y56<? extends T> y56Var, long j) {
        return l76.m30813timeoutHG0u8IE(y56Var, j);
    }

    @gib
    public static final <T, C extends Collection<? super T>> Object toCollection(@yfb y56<? extends T> y56Var, @yfb C c, @yfb zy2<? super C> zy2Var) {
        return g76.toCollection(y56Var, c, zy2Var);
    }

    @gib
    public static final <T> Object toList(@yfb y56<? extends T> y56Var, @yfb List<T> list, @yfb zy2<? super List<? extends T>> zy2Var) {
        return g76.toList(y56Var, list, zy2Var);
    }

    @gib
    public static final <T> Object toSet(@yfb y56<? extends T> y56Var, @yfb Set<T> set, @yfb zy2<? super Set<? extends T>> zy2Var) {
        return g76.toSet(y56Var, set, zy2Var);
    }

    @yfb
    public static final <T, R> y56<R> transform(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return p76.transform(y56Var, kz6Var);
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> transformLatest(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return s76.transformLatest(y56Var, kz6Var);
    }

    @yfb
    public static final <T, R> y56<R> transformWhile(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super Boolean>, ? extends Object> kz6Var) {
        return r76.transformWhile(y56Var, kz6Var);
    }

    @yfb
    @yjd
    public static final <T, R> y56<R> unsafeTransform(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return p76.unsafeTransform(y56Var, kz6Var);
    }

    @yfb
    public static final <T> y56<q08<T>> withIndex(@yfb y56<? extends T> y56Var) {
        return x76.withIndex(y56Var);
    }

    @yfb
    public static final <T1, T2, R> y56<R> zip(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return y76.zip(y56Var, y56Var2, kz6Var);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var) {
        return d76.asFlow(qy6Var);
    }

    @yfb
    public static final <T> y56<T> buffer(@yfb y56<? extends T> y56Var, int i, @yfb gf1 gf1Var) {
        return h76.buffer(y56Var, i, gf1Var);
    }

    @yfb
    public static final <T1, T2, T3, T4, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb rz6<? super T1, ? super T2, ? super T3, ? super T4, ? super zy2<? super R>, ? extends Object> rz6Var) {
        return y76.combine(y56Var, y56Var2, y56Var3, y56Var4, rz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb rz6<? super T1, ? super T2, ? super T3, ? super T4, ? super zy2<? super R>, ? extends Object> rz6Var) {
        return u76.combineLatest(y56Var, y56Var2, y56Var3, y56Var4, rz6Var);
    }

    @yfb
    public static final <T1, T2, T3, T4, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb @cg1 uz6<? super t66<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super zy2<? super bth>, ? extends Object> uz6Var) {
        return y76.combineTransform(y56Var, y56Var2, y56Var3, y56Var4, uz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @i2e(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> y56<T> concatWith(@yfb y56<? extends T> y56Var, T t) {
        return u76.concatWith(y56Var, t);
    }

    @gib
    public static final <T> Object count(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, @yfb zy2<? super Integer> zy2Var) {
        return i76.count(y56Var, gz6Var, zy2Var);
    }

    @d86
    @r9c
    @yfb
    public static final <T> y56<T> debounce(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, Long> qy6Var) {
        return l76.debounce(y56Var, qy6Var);
    }

    @yfb
    public static final <T> y56<T> distinctUntilChanged(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super T, Boolean> gz6Var) {
        return o76.distinctUntilChanged(y56Var, gz6Var);
    }

    @gib
    public static final <T> Object emitAll(@yfb t66<? super T> t66Var, @yfb hsd<? extends T> hsdVar, @yfb zy2<? super bth> zy2Var) {
        return e76.emitAll(t66Var, hsdVar, zy2Var);
    }

    @yfb
    public static final <R> y56<R> filterIsInstance(@yfb y56<?> y56Var, @yfb oo8<R> oo8Var) {
        return x76.filterIsInstance(y56Var, oo8Var);
    }

    @gib
    public static final <T> Object first(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return v76.first(y56Var, gz6Var, zy2Var);
    }

    @gib
    public static final <T> Object firstOrNull(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return v76.firstOrNull(y56Var, gz6Var, zy2Var);
    }

    @yfb
    public static final <T> y56<T> flowOf(@yfb T... tArr) {
        return d76.flowOf((Object[]) tArr);
    }

    @yfb
    public static final <T> y56<T> merge(@yfb Iterable<? extends y56<? extends T>> iterable) {
        return s76.merge(iterable);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @i2e(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> y56<T> onErrorReturn(@yfb y56<? extends T> y56Var, T t, @yfb qy6<? super Throwable, Boolean> qy6Var) {
        return u76.onErrorReturn(y56Var, t, qy6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> y56<T> publish(@yfb y56<? extends T> y56Var, int i) {
        return u76.publish(y56Var, i);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> y56<T> replay(@yfb y56<? extends T> y56Var, int i) {
        return u76.replay(y56Var, i);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @i2e(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> y56<T> startWith(@yfb y56<? extends T> y56Var, T t) {
        return u76.startWith(y56Var, t);
    }

    @gib
    public static final <T> Object stateIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var, @yfb zy2<? super l2g<? extends T>> zy2Var) {
        return w76.stateIn(y56Var, x13Var, zy2Var);
    }

    @q64(level = u64.f86866b, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        u76.subscribe(y56Var, gz6Var);
    }

    @yfb
    public static final y56<Integer> asFlow(@yfb f78 f78Var) {
        return d76.asFlow(f78Var);
    }

    @yfb
    public static final <T1, T2, T3, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb @cg1 oz6<? super T1, ? super T2, ? super T3, ? super zy2<? super R>, ? extends Object> oz6Var) {
        return y76.combine(y56Var, y56Var2, y56Var3, oz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb oz6<? super T1, ? super T2, ? super T3, ? super zy2<? super R>, ? extends Object> oz6Var) {
        return u76.combineLatest(y56Var, y56Var2, y56Var3, oz6Var);
    }

    @yfb
    public static final <T1, T2, T3, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb @cg1 rz6<? super t66<? super R>, ? super T1, ? super T2, ? super T3, ? super zy2<? super bth>, ? extends Object> rz6Var) {
        return y76.combineTransform(y56Var, y56Var2, y56Var3, rz6Var);
    }

    @yfb
    public static final <T> y56<T> merge(@yfb y56<? extends T>... y56VarArr) {
        return s76.merge(y56VarArr);
    }

    @q64(level = u64.f86866b, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb gz6<? super Throwable, ? super zy2<? super bth>, ? extends Object> gz6Var2) {
        u76.subscribe(y56Var, gz6Var, gz6Var2);
    }

    @yfb
    public static final y56<Long> asFlow(@yfb ul9 ul9Var) {
        return d76.asFlow(ul9Var);
    }

    @yfb
    public static final <T1, T2, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return y76.combine(y56Var, y56Var2, kz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return u76.combineLatest(y56Var, y56Var2, kz6Var);
    }

    @yfb
    public static final <T1, T2, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb @cg1 oz6<? super t66<? super R>, ? super T1, ? super T2, ? super zy2<? super bth>, ? extends Object> oz6Var) {
        return y76.combineTransform(y56Var, y56Var2, oz6Var);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb vye<? extends T> vyeVar) {
        return d76.asFlow(vyeVar);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb Iterable<? extends T> iterable) {
        return d76.asFlow(iterable);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb Iterator<? extends T> it) {
        return d76.asFlow(it);
    }

    @yfb
    public static final y56<Integer> asFlow(@yfb int[] iArr) {
        return d76.asFlow(iArr);
    }

    @yfb
    public static final y56<Long> asFlow(@yfb long[] jArr) {
        return d76.asFlow(jArr);
    }

    @yfb
    public static final <T> y56<T> asFlow(@yfb T[] tArr) {
        return d76.asFlow(tArr);
    }
}
