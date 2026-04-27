package p000;

import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,492:1\n189#2:493\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n431#1:493\n*E\n"})
public final /* synthetic */ class u76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: u76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", m4010f = "Migration.kt", m4011i = {}, m4012l = {423}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13390a<T> extends ugg implements gz6<T, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f86940a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f86941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13390a(long j, zy2<? super C13390a> zy2Var) {
            super(2, zy2Var);
            this.f86941b = j;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C13390a(this.f86941b, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(T t, zy2<? super bth> zy2Var) {
            return ((C13390a) create(t, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f86940a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                long j = this.f86941b;
                this.f86940a = 1;
                if (p34.delay(j, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: u76$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", m4010f = "Migration.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_LED_SELECTOR}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13391b<T> extends ugg implements gz6<t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f86942a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f86943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13391b(long j, zy2<? super C13391b> zy2Var) {
            super(2, zy2Var);
            this.f86943b = j;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C13391b(this.f86943b, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            return ((C13391b) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f86942a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                long j = this.f86943b;
                this.f86942a = 1;
                if (p34.delay(j, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: u76$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", m4010f = "Migration.kt", m4011i = {}, m4012l = {302}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13392c<T> extends ugg implements kz6<t66<? super T>, Throwable, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f86944a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f86945b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f86946c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<Throwable, Boolean> f86947d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ T f86948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13392c(qy6<? super Throwable, Boolean> qy6Var, T t, zy2<? super C13392c> zy2Var) {
            super(3, zy2Var);
            this.f86947d = qy6Var;
            this.f86948e = t;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super T> t66Var, Throwable th, zy2<? super bth> zy2Var) {
            C13392c c13392c = new C13392c(this.f86947d, this.f86948e, zy2Var);
            c13392c.f86945b = t66Var;
            c13392c.f86946c = th;
            return c13392c.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f86944a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f86945b;
                Throwable th = (Throwable) this.f86946c;
                if (!this.f86947d.invoke(th).booleanValue()) {
                    throw th;
                }
                T t = this.f86948e;
                this.f86945b = null;
                this.f86944a = 1;
                if (t66Var.emit(t, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: u76$d */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", m4010f = "Migration.kt", m4011i = {}, m4012l = {189, 189}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13393d<R, T> extends ugg implements kz6<t66<? super R>, T, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f86949a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f86950b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f86951c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6 f86952d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13393d(gz6 gz6Var, zy2 zy2Var) {
            super(3, zy2Var);
            this.f86952d = gz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, T t, zy2<? super bth> zy2Var) {
            C13393d c13393d = new C13393d(this.f86952d, zy2Var);
            c13393d.f86950b = t66Var;
            c13393d.f86951c = t;
            return c13393d.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            t66 t66Var;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f86949a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66Var = (t66) this.f86950b;
                Object obj2 = this.f86951c;
                gz6 gz6Var = this.f86952d;
                this.f86950b = t66Var;
                this.f86949a = 1;
                obj = gz6Var.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                t66Var = (t66) this.f86950b;
                y7e.throwOnFailure(obj);
            }
            this.f86950b = null;
            this.f86949a = 2;
            if (c76.emitAll(t66Var, (y56) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @i2e(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    public static final <T> y56<T> cache(@yfb y56<? extends T> y56Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return c76.combine(y56Var, y56Var2, kz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'compose' is 'let'", replaceWith = @i2e(expression = "let(transformer)", imports = {}))
    public static final <T, R> y56<R> compose(@yfb y56<? extends T> y56Var, @yfb qy6<? super y56<? extends T>, ? extends y56<? extends R>> qy6Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @i2e(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> y56<R> concatMap(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, ? extends y56<? extends R>> qy6Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @i2e(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> y56<T> concatWith(@yfb y56<? extends T> y56Var, T t) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @i2e(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> y56<T> delayEach(@yfb y56<? extends T> y56Var, long j) {
        return c76.onEach(y56Var, new C13390a(j, null));
    }

    @yfb
    @q64(level = u64.f86866b, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @i2e(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> y56<T> delayFlow(@yfb y56<? extends T> y56Var, long j) {
        return c76.onStart(y56Var, new C13391b(j, null));
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue is 'flatMapConcat'", replaceWith = @i2e(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> y56<R> flatMap(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @i2e(expression = "flattenConcat()", imports = {}))
    public static final <T> y56<T> flatten(@yfb y56<? extends y56<? extends T>> y56Var) {
        c76.noImpl();
        throw new us8();
    }

    @q64(level = u64.f86866b, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @i2e(expression = "collect(action)", imports = {}))
    public static final <T> void forEach(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @i2e(expression = "flattenConcat()", imports = {}))
    public static final <T> y56<T> merge(@yfb y56<? extends y56<? extends T>> y56Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @yfb
    @q64(level = u64.f86866b, message = "Collect flow in the desired context instead")
    public static final <T> y56<T> observeOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @i2e(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> y56<T> onErrorResume(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @i2e(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> y56<T> onErrorResumeNext(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @i2e(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> y56<T> onErrorReturn(@yfb y56<? extends T> y56Var, T t) {
        c76.noImpl();
        throw new us8();
    }

    public static /* synthetic */ y56 onErrorReturn$default(y56 y56Var, Object obj, qy6 qy6Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            qy6Var = new qy6() { // from class: t76
                @Override // p000.qy6
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(u76.onErrorReturn$lambda$0$FlowKt__MigrationKt((Throwable) obj3));
                }
            };
        }
        return c76.onErrorReturn(y56Var, obj, qy6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onErrorReturn$lambda$0$FlowKt__MigrationKt(Throwable th) {
        return true;
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> y56<T> publish(@yfb y56<? extends T> y56Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Collect flow in the desired context instead")
    public static final <T> y56<T> publishOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> y56<T> replay(@yfb y56<? extends T> y56Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow has less verbose 'scan' shortcut", replaceWith = @i2e(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> y56<R> scanFold(@yfb y56<? extends T> y56Var, R r, @yfb @cg1 kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @i2e(expression = "runningReduce(operation)", imports = {}))
    public static final <T> y56<T> scanReduce(@yfb y56<? extends T> y56Var, @yfb kz6<? super T, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        return c76.runningReduce(y56Var, kz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @i2e(expression = "drop(count)", imports = {}))
    public static final <T> y56<T> skip(@yfb y56<? extends T> y56Var, int i) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @i2e(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> y56<T> startWith(@yfb y56<? extends T> y56Var, T t) {
        c76.noImpl();
        throw new us8();
    }

    @q64(level = u64.f86866b, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@yfb y56<? extends T> y56Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Use 'flowOn' instead")
    public static final <T> y56<T> subscribeOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @i2e(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> y56<R> switchMap(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return c76.transformLatest(y56Var, new C13393d(gz6Var, null));
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb oz6<? super T1, ? super T2, ? super T3, ? super zy2<? super R>, ? extends Object> oz6Var) {
        return c76.combine(y56Var, y56Var2, y56Var3, oz6Var);
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @i2e(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> y56<T> concatWith(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @i2e(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> y56<T> onErrorReturn(@yfb y56<? extends T> y56Var, T t, @yfb qy6<? super Throwable, Boolean> qy6Var) {
        return c76.m28222catch(y56Var, new C13392c(qy6Var, t, null));
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> y56<T> publish(@yfb y56<? extends T> y56Var, int i) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @i2e(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> y56<T> replay(@yfb y56<? extends T> y56Var, int i) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @i2e(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> y56<T> startWith(@yfb y56<? extends T> y56Var, @yfb y56<? extends T> y56Var2) {
        c76.noImpl();
        throw new us8();
    }

    @q64(level = u64.f86866b, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb rz6<? super T1, ? super T2, ? super T3, ? super T4, ? super zy2<? super R>, ? extends Object> rz6Var) {
        return c76.combine(y56Var, y56Var2, y56Var3, y56Var4, rz6Var);
    }

    @q64(level = u64.f86866b, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb gz6<? super Throwable, ? super zy2<? super bth>, ? extends Object> gz6Var2) {
        c76.noImpl();
        throw new us8();
    }

    @yfb
    @q64(level = u64.f86866b, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @i2e(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> y56<R> combineLatest(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb y56<? extends T5> y56Var5, @yfb uz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super zy2<? super R>, ? extends Object> uz6Var) {
        return c76.combine(y56Var, y56Var2, y56Var3, y56Var4, y56Var5, uz6Var);
    }
}
