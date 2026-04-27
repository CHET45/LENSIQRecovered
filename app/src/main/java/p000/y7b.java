package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface y7b {

    /* JADX INFO: renamed from: y7b$a */
    public static final class C15538a {
        @q64(level = u64.f86865a, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void getOnLock$annotations() {
        }

        public static /* synthetic */ Object lock$default(y7b y7bVar, Object obj, zy2 zy2Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return y7bVar.lock(obj, zy2Var);
        }

        public static /* synthetic */ boolean tryLock$default(y7b y7bVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return y7bVar.tryLock(obj);
        }

        public static /* synthetic */ void unlock$default(y7b y7bVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            y7bVar.unlock(obj);
        }
    }

    @yfb
    lve<Object, y7b> getOnLock();

    boolean holdsLock(@yfb Object obj);

    boolean isLocked();

    @gib
    Object lock(@gib Object obj, @yfb zy2<? super bth> zy2Var);

    boolean tryLock(@gib Object obj);

    void unlock(@gib Object obj);
}
