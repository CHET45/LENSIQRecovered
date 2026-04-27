package p000;

import java.util.concurrent.CancellationException;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
public final class web extends AbstractC13302u0 implements jj8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final web f94038b = new web();

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f94039c = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private web() {
        super(jj8.f50715A);
    }

    @q64(level = u64.f86865a, message = f94039c)
    public static /* synthetic */ void getChildren$annotations() {
    }

    @q64(level = u64.f86865a, message = f94039c)
    public static /* synthetic */ void getOnJoin$annotations() {
    }

    @q64(level = u64.f86865a, message = f94039c)
    public static /* synthetic */ void getParent$annotations() {
    }

    @q64(level = u64.f86865a, message = f94039c)
    public static /* synthetic */ void isActive$annotations() {
    }

    @q64(level = u64.f86865a, message = f94039c)
    public static /* synthetic */ void isCancelled$annotations() {
    }

    @q64(level = u64.f86865a, message = f94039c)
    public static /* synthetic */ void isCompleted$annotations() {
    }

    @Override // p000.jj8
    @yfb
    @q64(level = u64.f86865a, message = f94039c)
    public wy1 attachChild(@yfb yy1 yy1Var) {
        return xeb.f97598a;
    }

    @Override // p000.jj8
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // p000.jj8
    @yfb
    @q64(level = u64.f86865a, message = f94039c)
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.jj8
    @yfb
    public vye<jj8> getChildren() {
        return ize.emptySequence();
    }

    @Override // p000.jj8
    @yfb
    public hve getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p000.jj8
    @gib
    public jj8 getParent() {
        return null;
    }

    @Override // p000.jj8
    @yfb
    @q64(level = u64.f86865a, message = f94039c)
    public yf4 invokeOnCompletion(@yfb qy6<? super Throwable, bth> qy6Var) {
        return xeb.f97598a;
    }

    @Override // p000.jj8
    public boolean isActive() {
        return true;
    }

    @Override // p000.jj8
    public boolean isCancelled() {
        return false;
    }

    @Override // p000.jj8
    public boolean isCompleted() {
        return false;
    }

    @Override // p000.jj8
    @gib
    @q64(level = u64.f86865a, message = f94039c)
    public Object join(@yfb zy2<? super bth> zy2Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p000.jj8
    @yfb
    @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public jj8 plus(@yfb jj8 jj8Var) {
        return jj8.C7916a.plus((jj8) this, jj8Var);
    }

    @Override // p000.jj8
    @q64(level = u64.f86865a, message = f94039c)
    public boolean start() {
        return false;
    }

    @yfb
    public String toString() {
        return "NonCancellable";
    }

    @Override // p000.jj8
    @q64(level = u64.f86865a, message = f94039c)
    public void cancel(@gib CancellationException cancellationException) {
    }

    @Override // p000.jj8
    @yfb
    @q64(level = u64.f86865a, message = f94039c)
    public yf4 invokeOnCompletion(boolean z, boolean z2, @yfb qy6<? super Throwable, bth> qy6Var) {
        return xeb.f97598a;
    }

    @Override // p000.jj8
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }
}
