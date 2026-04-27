package p000;

import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.C1162s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w49 implements x13 {

    /* JADX INFO: renamed from: w49$a */
    @ck3(m4009c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m4010f = "Lifecycle.jvm.kt", m4011i = {}, m4012l = {55}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14377a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93225a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<x13, zy2<? super bth>, Object> f93227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14377a(gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C14377a> zy2Var) {
            super(2, zy2Var);
            this.f93227c = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return w49.this.new C14377a(this.f93227c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C14377a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f93225a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                AbstractC1143j lifecycle$lifecycle_common = w49.this.getLifecycle$lifecycle_common();
                gz6<x13, zy2<? super bth>, Object> gz6Var = this.f93227c;
                this.f93225a = 1;
                if (C1162s.whenCreated(lifecycle$lifecycle_common, gz6Var, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: w49$b */
    @ck3(m4009c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m4010f = "Lifecycle.jvm.kt", m4011i = {}, m4012l = {93}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14378b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93228a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<x13, zy2<? super bth>, Object> f93230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14378b(gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C14378b> zy2Var) {
            super(2, zy2Var);
            this.f93230c = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return w49.this.new C14378b(this.f93230c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C14378b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f93228a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                AbstractC1143j lifecycle$lifecycle_common = w49.this.getLifecycle$lifecycle_common();
                gz6<x13, zy2<? super bth>, Object> gz6Var = this.f93230c;
                this.f93228a = 1;
                if (C1162s.whenResumed(lifecycle$lifecycle_common, gz6Var, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: w49$c */
    @ck3(m4009c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m4010f = "Lifecycle.jvm.kt", m4011i = {}, m4012l = {74}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14379c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93231a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<x13, zy2<? super bth>, Object> f93233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14379c(gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C14379c> zy2Var) {
            super(2, zy2Var);
            this.f93233c = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return w49.this.new C14379c(this.f93233c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C14379c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f93231a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                AbstractC1143j lifecycle$lifecycle_common = w49.this.getLifecycle$lifecycle_common();
                gz6<x13, zy2<? super bth>, Object> gz6Var = this.f93233c;
                this.f93231a = 1;
                if (C1162s.whenStarted(lifecycle$lifecycle_common, gz6Var, this) == coroutine_suspended) {
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

    @yfb
    public abstract AbstractC1143j getLifecycle$lifecycle_common();

    @yfb
    @q64(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final jj8 launchWhenCreated(@yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        return fg1.launch$default(this, null, null, new C14377a(gz6Var, null), 3, null);
    }

    @yfb
    @q64(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final jj8 launchWhenResumed(@yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        return fg1.launch$default(this, null, null, new C14378b(gz6Var, null), 3, null);
    }

    @yfb
    @q64(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final jj8 launchWhenStarted(@yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        return fg1.launch$default(this, null, null, new C14379c(gz6Var, null), 3, null);
    }
}
