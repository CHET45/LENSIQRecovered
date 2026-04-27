package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface oo8<T> extends so8, mo8, ro8 {

    /* JADX INFO: renamed from: oo8$a */
    public static final class C10485a {
        @jjf(version = "1.3")
        public static /* synthetic */ void getSealedSubclasses$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void getSupertypes$annotations() {
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
        public static /* synthetic */ void isCompanion$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isData$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isFinal$annotations() {
        }

        @jjf(version = "1.4")
        public static /* synthetic */ void isFun$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isInner$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isOpen$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void isSealed$annotations() {
        }

        @jjf(version = "1.5")
        public static /* synthetic */ void isValue$annotations() {
        }
    }

    boolean equals(@gib Object obj);

    @yfb
    Collection<to8<T>> getConstructors();

    @Override // p000.so8
    @yfb
    Collection<no8<?>> getMembers();

    @yfb
    Collection<oo8<?>> getNestedClasses();

    @gib
    T getObjectInstance();

    @gib
    String getQualifiedName();

    @yfb
    List<oo8<? extends T>> getSealedSubclasses();

    @gib
    String getSimpleName();

    @yfb
    List<mp8> getSupertypes();

    @yfb
    List<op8> getTypeParameters();

    @gib
    sp8 getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    @jjf(version = "1.1")
    boolean isInstance(@gib Object obj);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}
