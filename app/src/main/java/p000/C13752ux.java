package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.InterfaceC14278vw;

/* JADX INFO: renamed from: ux */
/* JADX INFO: loaded from: classes3.dex */
public class C13752ux extends h3i implements InterfaceC14278vw {

    /* JADX INFO: renamed from: F */
    public static final String f89301F = "AnimatedVDCompat";

    /* JADX INFO: renamed from: H */
    public static final String f89302H = "animated-vector";

    /* JADX INFO: renamed from: L */
    public static final String f89303L = "target";

    /* JADX INFO: renamed from: M */
    public static final boolean f89304M = false;

    /* JADX INFO: renamed from: C */
    public final Drawable.Callback f89305C;

    /* JADX INFO: renamed from: b */
    public c f89306b;

    /* JADX INFO: renamed from: c */
    public Context f89307c;

    /* JADX INFO: renamed from: d */
    public ArgbEvaluator f89308d;

    /* JADX INFO: renamed from: e */
    public d f89309e;

    /* JADX INFO: renamed from: f */
    public Animator.AnimatorListener f89310f;

    /* JADX INFO: renamed from: m */
    public ArrayList<InterfaceC14278vw.a> f89311m;

    /* JADX INFO: renamed from: ux$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C13752ux.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C13752ux.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C13752ux.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: ux$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C13752ux.this.f89311m);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC14278vw.a) arrayList.get(i)).onAnimationEnd(C13752ux.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C13752ux.this.f89311m);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC14278vw.a) arrayList.get(i)).onAnimationStart(C13752ux.this);
            }
        }
    }

    /* JADX INFO: renamed from: ux$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f89314a;

        /* JADX INFO: renamed from: b */
        public i3i f89315b;

        /* JADX INFO: renamed from: c */
        public AnimatorSet f89316c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Animator> f89317d;

        /* JADX INFO: renamed from: e */
        public x60<Animator, String> f89318e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f89314a = cVar.f89314a;
                i3i i3iVar = cVar.f89315b;
                if (i3iVar != null) {
                    Drawable.ConstantState constantState = i3iVar.getConstantState();
                    if (resources != null) {
                        this.f89315b = (i3i) constantState.newDrawable(resources);
                    } else {
                        this.f89315b = (i3i) constantState.newDrawable();
                    }
                    i3i i3iVar2 = (i3i) this.f89315b.mutate();
                    this.f89315b = i3iVar2;
                    i3iVar2.setCallback(callback);
                    this.f89315b.setBounds(cVar.f89315b.getBounds());
                    this.f89315b.m12764c(false);
                }
                ArrayList<Animator> arrayList = cVar.f89317d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f89317d = new ArrayList<>(size);
                    this.f89318e = new x60<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.f89317d.get(i);
                        Animator animatorClone = animator.clone();
                        String str = cVar.f89318e.get(animator);
                        animatorClone.setTarget(this.f89315b.m12763b(str));
                        this.f89317d.add(animatorClone);
                        this.f89318e.put(animatorClone, str);
                    }
                    setupAnimatorSet();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f89314a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public void setupAnimatorSet() {
            if (this.f89316c == null) {
                this.f89316c = new AnimatorSet();
            }
            this.f89316c.playTogether(this.f89317d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C13752ux() {
        this(null, null, null);
    }

    @hib
    public static C13752ux create(@efb Context context, @gq4 int i) {
        C13752ux c13752ux = new C13752ux(context);
        Drawable drawable = f7e.getDrawable(context.getResources(), i, context.getTheme());
        c13752ux.f42259a = drawable;
        drawable.setCallback(c13752ux.f89305C);
        c13752ux.f89309e = new d(c13752ux.f42259a.getConstantState());
        return c13752ux;
    }

    public static C13752ux createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C13752ux c13752ux = new C13752ux(context);
        c13752ux.inflate(resources, xmlPullParser, attributeSet, theme);
        return c13752ux;
    }

    @c5e(23)
    private static void registerPlatformCallback(@efb AnimatedVectorDrawable animatedVectorDrawable, @efb InterfaceC14278vw.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.m24210a());
    }

    private void removeAnimatorSetListener() {
        Animator.AnimatorListener animatorListener = this.f89310f;
        if (animatorListener != null) {
            this.f89306b.f89316c.removeListener(animatorListener);
            this.f89310f = null;
        }
    }

    private void setupAnimatorsForTarget(String str, Animator animator) {
        animator.setTarget(this.f89306b.f89315b.m12763b(str));
        c cVar = this.f89306b;
        if (cVar.f89317d == null) {
            cVar.f89317d = new ArrayList<>();
            this.f89306b.f89318e = new x60<>();
        }
        this.f89306b.f89317d.add(animator);
        this.f89306b.f89318e.put(animator, str);
    }

    private void setupColorAnimator(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                setupColorAnimator(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f89308d == null) {
                    this.f89308d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f89308d);
            }
        }
    }

    @c5e(23)
    private static boolean unregisterPlatformCallback(AnimatedVectorDrawable animatedVectorDrawable, InterfaceC14278vw.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.m24210a());
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.applyTheme(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            return yp4.canApplyTheme(drawable);
        }
        return false;
    }

    @Override // p000.InterfaceC14278vw
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        removeAnimatorSetListener();
        ArrayList<InterfaceC14278vw.a> arrayList = this.f89311m;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f89306b.f89315b.draw(canvas);
        if (this.f89306b.f89316c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f42259a;
        return drawable != null ? yp4.getAlpha(drawable) : this.f89306b.f89315b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f89306b.f89314a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f42259a;
        return drawable != null ? yp4.getColorFilter(drawable) : this.f89306b.f89315b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f42259a != null) {
            return new d(this.f42259a.getConstantState());
        }
        return null;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f89306b.f89315b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f89306b.f89315b.getIntrinsicWidth();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.getOpacity() : this.f89306b.f89315b.getOpacity();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f89302H.equals(name)) {
                    TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C15299xu.f99264M);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i3i i3iVarCreate = i3i.create(resources, resourceId, theme);
                        i3iVarCreate.m12764c(false);
                        i3iVarCreate.setCallback(this.f89305C);
                        i3i i3iVar = this.f89306b.f89315b;
                        if (i3iVar != null) {
                            i3iVar.setCallback(null);
                        }
                        this.f89306b.f89315b = i3iVarCreate;
                    }
                    typedArrayObtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, C15299xu.f99266O);
                    String string = typedArrayObtainAttributes2.getString(0);
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f89307c;
                        if (context == null) {
                            typedArrayObtainAttributes2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        setupAnimatorsForTarget(string, C5019dz.loadAnimator(context, resourceId2));
                    }
                    typedArrayObtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f89306b.setupAnimatorSet();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f42259a;
        return drawable != null ? yp4.isAutoMirrored(drawable) : this.f89306b.f89315b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f42259a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f89306b.f89316c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.isStateful() : this.f89306b.f89315b.isStateful();
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f89306b.f89315b.setBounds(rect);
        }
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.setLevel(i) : this.f89306b.f89315b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f42259a;
        return drawable != null ? drawable.setState(iArr) : this.f89306b.f89315b.setState(iArr);
    }

    @Override // p000.InterfaceC14278vw
    public void registerAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            registerPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f89311m == null) {
            this.f89311m = new ArrayList<>();
        }
        if (this.f89311m.contains(aVar)) {
            return;
        }
        this.f89311m.add(aVar);
        if (this.f89310f == null) {
            this.f89310f = new b();
        }
        this.f89306b.f89316c.addListener(this.f89310f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f89306b.f89315b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setAutoMirrored(drawable, z);
        } else {
            this.f89306b.f89315b.setAutoMirrored(z);
        }
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.h3i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTint(int i) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setTint(drawable, i);
        } else {
            this.f89306b.f89315b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setTintList(drawable, colorStateList);
        } else {
            this.f89306b.f89315b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            yp4.setTintMode(drawable, mode);
        } else {
            this.f89306b.f89315b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f89306b.f89315b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f89306b.f89316c.isStarted()) {
                return;
            }
            this.f89306b.f89316c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f89306b.f89316c.end();
        }
    }

    @Override // p000.InterfaceC14278vw
    public boolean unregisterAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            unregisterPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<InterfaceC14278vw.a> arrayList = this.f89311m;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(aVar);
        if (this.f89311m.size() == 0) {
            removeAnimatorSetListener();
        }
        return zRemove;
    }

    private C13752ux(@hib Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f42259a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f89306b.f89315b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: ux$d */
    @c5e(24)
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f89319a;

        public d(Drawable.ConstantState constantState) {
            this.f89319a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f89319a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f89319a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C13752ux c13752ux = new C13752ux();
            Drawable drawableNewDrawable = this.f89319a.newDrawable();
            c13752ux.f42259a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c13752ux.f89305C);
            return c13752ux;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C13752ux c13752ux = new C13752ux();
            Drawable drawableNewDrawable = this.f89319a.newDrawable(resources);
            c13752ux.f42259a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c13752ux.f89305C);
            return c13752ux;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C13752ux c13752ux = new C13752ux();
            Drawable drawableNewDrawable = this.f89319a.newDrawable(resources, theme);
            c13752ux.f42259a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c13752ux.f89305C);
            return c13752ux;
        }
    }

    private C13752ux(@hib Context context, @hib c cVar, @hib Resources resources) {
        this.f89308d = null;
        this.f89310f = null;
        this.f89311m = null;
        a aVar = new a();
        this.f89305C = aVar;
        this.f89307c = context;
        if (cVar != null) {
            this.f89306b = cVar;
        } else {
            this.f89306b = new c(context, cVar, aVar, resources);
        }
    }

    public static void clearAnimationCallbacks(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    public static boolean unregisterAnimationCallback(Drawable drawable, InterfaceC14278vw.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return unregisterPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
    }

    public static void registerAnimationCallback(Drawable drawable, InterfaceC14278vw.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        registerPlatformCallback((AnimatedVectorDrawable) drawable, aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
