package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a0b {

    /* JADX INFO: renamed from: c */
    public static final String f22c = "MotionSpec";

    /* JADX INFO: renamed from: a */
    public final scf<String, b0b> f23a = new scf<>();

    /* JADX INFO: renamed from: b */
    public final scf<String, PropertyValuesHolder[]> f24b = new scf<>();

    private static void addInfoFromAnimator(@efb a0b a0bVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            a0bVar.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            a0bVar.setTiming(objectAnimator.getPropertyName(), b0b.m2784a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @efb
    private PropertyValuesHolder[] clonePropertyValuesHolder(@efb PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @hib
    public static a0b createFromAttribute(@efb Context context, @efb TypedArray typedArray, @ebg int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @hib
    public static a0b createFromResource(@efb Context context, @InterfaceC6036fz int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return createSpecFromAnimators(arrayList);
        } catch (Exception e) {
            Log.w(f22c, "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @efb
    private static a0b createSpecFromAnimators(@efb List<Animator> list) {
        a0b a0bVar = new a0b();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addInfoFromAnimator(a0bVar, list.get(i));
        }
        return a0bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0b) {
            return this.f23a.equals(((a0b) obj).f23a);
        }
        return false;
    }

    @efb
    public <T> ObjectAnimator getAnimator(@efb String str, @efb T t, @efb Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @efb
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.f24b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public b0b getTiming(String str) {
        if (hasTiming(str)) {
            return this.f23a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.f23a.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            b0b b0bVarValueAt = this.f23a.valueAt(i);
            jMax = Math.max(jMax, b0bVarValueAt.getDelay() + b0bVarValueAt.getDuration());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.f24b.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.f23a.get(str) != null;
    }

    public int hashCode() {
        return this.f23a.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f24b.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @hib b0b b0bVar) {
        this.f23a.put(str, b0bVar);
    }

    @efb
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f23a + "}\n";
    }
}
