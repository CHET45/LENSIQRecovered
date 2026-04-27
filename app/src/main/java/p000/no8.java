package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface no8<R> extends mo8 {

    /* JADX INFO: renamed from: no8$a */
    public static final class C9960a {
        @cd8
        public static /* synthetic */ void getName$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void getVisibility$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isAbstract$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isFinal$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isOpen$annotations() {
        }

        @jjf(version = "1.3")
        public static /* synthetic */ void isSuspend$annotations() {
        }
    }

    R call(@yfb Object... objArr);

    R callBy(@yfb Map<gp8, ? extends Object> map);

    @yfb
    String getName();

    @yfb
    List<gp8> getParameters();

    @yfb
    mp8 getReturnType();

    @yfb
    List<op8> getTypeParameters();

    @gib
    sp8 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
