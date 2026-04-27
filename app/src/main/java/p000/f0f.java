package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface f0f {

    /* JADX INFO: renamed from: f0f$a */
    public static final class C5539a {
        @yfb
        public static List<Annotation> getAnnotations(@yfb f0f f0fVar) {
            return l82.emptyList();
        }

        @ph5
        public static /* synthetic */ void getAnnotations$annotations() {
        }

        @ph5
        public static /* synthetic */ void getElementsCount$annotations() {
        }

        @ph5
        public static /* synthetic */ void getKind$annotations() {
        }

        @ph5
        public static /* synthetic */ void getSerialName$annotations() {
        }

        public static boolean isInline(@yfb f0f f0fVar) {
            return false;
        }

        public static boolean isNullable(@yfb f0f f0fVar) {
            return false;
        }

        @ph5
        public static /* synthetic */ void isNullable$annotations() {
        }
    }

    @yfb
    List<Annotation> getAnnotations();

    @ph5
    @yfb
    List<Annotation> getElementAnnotations(int i);

    @ph5
    @yfb
    f0f getElementDescriptor(int i);

    @ph5
    int getElementIndex(@yfb String str);

    @ph5
    @yfb
    String getElementName(int i);

    int getElementsCount();

    @yfb
    u0f getKind();

    @yfb
    String getSerialName();

    @ph5
    boolean isElementOptional(int i);

    boolean isInline();

    boolean isNullable();
}
